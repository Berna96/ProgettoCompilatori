package myCompiler.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.antlr.runtime.Token;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultEdge;

import myCompiler.Coordinates;
import myCompiler.util.error.*;
import myCompiler.util.warning.*;

//import myCompiler.MyGrammarParser.story_return;

public class ParserSemantic {
	ParserEnvironment env;
	public ParserSemantic (ParserEnvironment e) {
		env = e;
	}
	
	/*----------METADATA----------*/
	public void setPublisher(Token publisher) {
		env.metadata.publisher = publisher.getText().replace("\"", "");
	}
	
	public void setTitleBook(Token title_book) {
		env.metadata.title = title_book.getText().replace("\"", "");
	}
	
	public void addAuthor(Token author) {
		env.metadata.authors.add(author.getText().replace("\"", ""));
	}
	
	public void setYear(Token year) {
		env.metadata.year = Integer.parseInt(year.getText());
	}
	
	public void setCover(Token cover) {
		env.metadata.cover_path = cover.getText();
	}
	
	public void createCover() {
		try {
			EpubHandler.createCover(env.metadata);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// ERRORE COMPILAZIONE: NON E' STATO POSSIBILE CREARE IL FILE
		}
	}
	/*----------FINE METADATA----------*/
	
	/*----------ERRORI E WARNING----------*/	
	private void addError(ErrType tipo, ErrCauses causa, ErrSolution soluzione, Token riferimento) {
		Integer line = riferimento.getLine();
		Integer char_position = riferimento.getCharPositionInLine();
		Coordinates coord = new Coordinates(line,char_position);
		CompilationError c_error = new CompilationError(tipo,causa,soluzione,coord);
		env.errorList.add(c_error);
	}
	
	private void addWarning(WarnType tipo, WarnCauses causa, WarnSolution soluzione, Token riferimento) {
		Integer line = riferimento.getLine();
		Integer char_position = riferimento.getCharPositionInLine();
		Coordinates coord = new Coordinates(line,char_position);
		CompilationWarning c_warning = new CompilationWarning(tipo,causa,soluzione,coord);
		env.warningList.add(c_warning);
	}
	/*----------FINE ERRORI E WARNING----------*/
	
	/*----------STORIE----------*/
	private Story manageThisStory(Token this_story) {
		String this_story_name = this_story.getText();
		Story story = env.librogame.getStory(this_story_name); // DEVE RESTITUIRE NULL
		// Se e' null significa che non e' gia' presente e quindi non c'e' ridondanza
		if (story == null) {
			story = new Story(this_story_name); // creo la nuova story
			env.librogame.addStory(story); // aggiungo la story nella storyTable
			env.graph.addVertex(story); // aggiungo la story nel grafo
		} else if (story.choose_story != null || story.next_story != null || story.text != null) {
			// story esiste gia' ed e' ben definita
			// ERRORE COMPILAZIONE: RIDONDANZA !!!
			addError(ErrType.ERROR,ErrCauses.DOUBLE_STORY,ErrSolution.DOUBLE_STORY,this_story);
		}
		return story;
	}
	
	private void manageTitleStory(Story story, Token title) {
		if (title != null) {
			String title_text = title.getText();
			if (title_text.isEmpty()) {
				// WARNING COMPILAZIONE: TITOLO VUOTO !!!
				//addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.MISSING_STORY_FIELD, null, title);
			}
			story.setTitle(title.getText()); // salvo il titolo
		}
	}
	
	private void manageTextStory(Story story, Token text) {
		if (text != null) {
			String text_story = text.getText();
			if (text_story.isEmpty()) {
				// WARNING COMPILAZIONE: TESTO VUOTO !!!
			}
			story.setText(text.getText()); // salvo il testo
		} else {
			// WARNING COMPILAZIONE: TESTO ASSENTE !!!
		}
	}
	
	private void manageNextStory(Story story, Token next_story) {
		String next_story_name = next_story.getText();
		// controllo se gia' esiste nella storyTable
		Story nextStory = env.librogame.getStory(next_story_name);
		// se non esiste
		if (nextStory == null) {
			nextStory = new Story(next_story_name); // creo la nuova nextStory
			env.librogame.addStory(nextStory); // aggiungo nextStory nella storyTable
			env.graph.addVertex(nextStory); // aggiungo nextStory nel grafo
		}
		story.setNext_story(nextStory); // setto next story di story
		env.graph.addEdge(story, nextStory); // collego story alla nextStory nel grafo
	}
	
	private void manageBranchesStory(Story story, LinkedList<String> answers, LinkedList<Token> chosen_stories) {
		LinkedList<String> choose_answer = new LinkedList<String>();
		LinkedList<Story> choose_story = new LinkedList<Story>();
		// ciclo i nomi delle storie possibili
		for (int i=0; i < chosen_stories.size(); i++) {
			Token chosen_story_i = chosen_stories.get(i);
			String chosen_story_name_i = chosen_story_i.getText(); // nome storia i-esima
			Story temp_story = env.librogame.getStory(chosen_story_name_i); // estraggo la storia dalla storyTable
			// se non esiste
			if (temp_story == null) {
				temp_story = new Story(chosen_story_name_i); // creo la nuova temp_story i-esima
				env.librogame.addStory(temp_story); // aggiungo la temp_story i-esima nella storyTable
				env.graph.addVertex(temp_story); // aggiungo la temp_story i-esima nel grafo
			}
			env.graph.addEdge(story, temp_story); // collego story alla temp_story i-esima
			choose_story.add(temp_story);
		}
		story.setChoose_story(choose_story);
		story.setAnswers(answers);
	}
	
	public void manageStoryBlock(Token this_story, Token next_story, boolean hasBranches, Token title, Token text, LinkedList<Token> chosen_stories, LinkedList<String> answers) {
		Story story = manageThisStory(this_story); // fare che se ritorna null significa che gia' esiste?
		
		if (title != null)
			manageTitleStory(story, title);
		
		manageTextStory(story,text);
		
		// NEXT_STORY
		if (next_story != null) {
			if (chosen_stories != null) {
				// ERRORE COMPILAZIONE: BLOCCO CHOSEN SENZA BRANCHES !!!
				addError(ErrType.ERROR,ErrCauses.CHOOSE_NO_BRANCH,ErrSolution.CHOOSE_NO_BRANCH,next_story);
			}
			manageNextStory(story,next_story);
		}
		// BRANCHES
		else if (hasBranches) {
			if (chosen_stories == null) {
				// ERRORE COMPILAZIONE: BRANCHES SENZA BLOCCO CHOSEN !!!
				addError(ErrType.ERROR,ErrCauses.BRANCH_NO_CHOOSE,ErrSolution.BRANCH_NO_CHOOSE,this_story);
			}
			manageBranchesStory(story,answers,chosen_stories);
		}
		// STORIA FINALE
		//else {}
	}
	
	/*
	public String setTitleStory(Token title_story) {
		return title_story.getText();
	}
	*/
	
	public void insertChosenStory(Token story){
		//env.chosenStories.add(story.getText());
		env.chosenStories.add(story);
	}
	
	public LinkedList<Token> getChosenStories(){
		@SuppressWarnings("unchecked")
		LinkedList<Token> clone = (LinkedList<Token>) env.chosenStories.clone();
		env.chosenStories.clear();
		return clone;
	}
	
	public void insertAnswers(Token answer_token){
		//env.chosenStories.add(story.getText());
		String answer = answer_token.getText().replace("\"", "");
		env.answers.add(answer);
	}
	
	public LinkedList<String> getAnswers(){
		@SuppressWarnings("unchecked")
		LinkedList<String> clone = (LinkedList<String>) env.answers.clone();
		env.answers.clear();
		return clone;
	}
	
	/*----------FINE STORIE----------*/
	
	/*----------GESTIONE GRAFO----------*/
	public void updateGraphInfo() {
		CycleDetector<Story, DefaultEdge> cycle_detector = new CycleDetector<>(env.graph);
		ConnectivityInspector<Story, DefaultEdge> connectivity_inspector = new ConnectivityInspector<>(env.graph);
		env.cyclic = cycle_detector.detectCycles();
		env.connected = connectivity_inspector.isConnected();
	}
	/*----------FINE GESTIONE GRAFO----------*/
	
	/*-----------GESTIONE FILES EPUB-----------*/
	public void createFilesFromStories() {
		
		try {
			Set<String> names = env.librogame.storyTable.keySet();
			Iterator<String> itr = names.iterator();
			while (itr.hasNext()) {
				String story_name = itr.next();
				Story story = env.librogame.getStory(story_name);
				EpubHandler.createFileFromStory(story);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// ERRORE COMPILAZIONE: NON E' STATO POSSIBILE CREARE IL FILE
		}
		
	}
	/*-----------FINE GESTIONE FILES EPUB-----------*/
	
}
