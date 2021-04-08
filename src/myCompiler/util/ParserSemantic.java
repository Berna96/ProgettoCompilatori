package myCompiler.util;

import java.io.IOException;
import java.util.Collections;
//import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.antlr.runtime.Token;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
//import org.jgrapht.graph.DefaultEdge;

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
		if (!publisher.getText().isEmpty())
			env.metadata.publisher = publisher.getText().replace("\"", "");
		else
			addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.MISSING_META_FIELD, WarnSolution.SPEC_FIELD,publisher,publisher);
	}
	
	public void setTitleBook(Token title_book) {
		if (!title_book.getText().isEmpty())
			env.metadata.title = title_book.getText().replace("\"", "");
		else
			addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.MISSING_META_FIELD, WarnSolution.SPEC_FIELD,title_book,title_book);
	}
	
	public void addAuthor(Token author) {
		if (!author.getText().isEmpty())
			env.metadata.authors.add(author.getText().replace("\"", ""));
		else
			addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.MISSING_META_FIELD, WarnSolution.SPEC_FIELD,author,author);
	}
	
	public void setYear(Token year) {
		if (!year.getText().isEmpty())
			env.metadata.year = Integer.parseInt(year.getText());
		else
			addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.MISSING_META_FIELD, WarnSolution.SPEC_FIELD,year,year);
	}
	
	public void setCover(Token cover) {
		if (cover.getText() != null && !cover.getText().isEmpty()) {
			env.metadata.cover_path = cover.getText().replace("\"", "");
		} else {
			addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.MISSING_META_FIELD, WarnSolution.SPEC_FIELD,cover,cover);
		}
	}
	
	public void createCover() {
		try {
			EpubHandler.createCover(env.metadata);
		} catch (IOException e) {
			// ERRORE COMPILAZIONE: NON E' STATO POSSIBILE CREARE IL FILE
			addWarning(WarnType.INCOMPLETE_INFO, WarnCauses.NOT_EXIST_IMAGE_PATH, WarnSolution.SPEC_CORR_PATH);
		}
	}
	/*----------FINE METADATA----------*/
	
	/*----------ERRORI E WARNING----------*/
	private void addError(ErrType tipo, ErrCauses causa, ErrSolution soluzione, Token token_coord_ref, Token token_ref) {
		Integer line = token_coord_ref.getLine();
		Integer char_position = token_coord_ref.getCharPositionInLine();
		Coordinates coord = new Coordinates(line,char_position);
		//CompilationError c_error = new CompilationError(tipo,causa,soluzione,coord);
		CompilationError c_error = new CompilationError(tipo,causa,soluzione,coord,token_ref.getText());
		env.errorList.add(c_error);
	}
	public void manageSyntaxError(Token tk) {
		addError(ErrType.SYNTAX_ERROR,ErrCauses.SYNTAX_ERROR,ErrSolution.SYNTAX_ERROR,tk,tk);
	}
	
	private void addWarning(WarnType tipo, WarnCauses causa, WarnSolution soluzione, Token token_coord_ref, Token token_ref) {
		Integer line = token_coord_ref.getLine();
		Integer char_position = token_coord_ref.getCharPositionInLine();
		Coordinates coord = new Coordinates(line,char_position);
		CompilationWarning c_warning = new CompilationWarning(tipo,causa,soluzione,coord, token_ref.getText());
		env.warningList.add(c_warning);
	}
	// per le proprieta dell intero librogame, non riferito a singoli token (ciclico / non connesso)
	private void addWarning(WarnType tipo, WarnCauses causa, WarnSolution soluzione) {
		CompilationWarning c_warning = new CompilationWarning(tipo,causa,soluzione,null,null);
		env.warningList.add(c_warning);
	}
	
	public void reorderErrors() {
		Collections.sort(env.errorList);
	}
	/*
	public void scan_error(Token tk) {
		addError(ErrType.TOKEN_UNRECOGNIZED, ErrCauses.TOKEN_UNRECOGNIZED, ErrSolution.TOKEN_UNRECOGNIZED, tk, tk);
	}
	*/
	/*----------FINE ERRORI E WARNING----------*/
	
	/*----------STORIE----------*/
	private Story manageThisStory(Token this_story) {
		String this_story_name = this_story.getText();
		Story story = env.librogame.getStory(this_story_name); // DEVE RESTITUIRE NULL
		// Se e' null significa che non e' gia' presente e quindi non c'e' ridondanza
		if (story == null) {
			story = new Story(this_story_name); // creo la nuova story
			env.librogame.addStory(story); // aggiungo la story nella storyTable
			env.tokenStoryTable.put(story,this_story); // tengo traccia del token della storia definita
			env.graph.addVertex(story); // aggiungo la story nel grafo
		} else if (story.choose_story != null || story.next_story != null || story.text != null) {
			// story esiste gia' ed e' ben definita
			// ERRORE COMPILAZIONE: RIDONDANZA !!!
			addError(ErrType.IDENTIF_ERROR,ErrCauses.DOUBLE_STORY,ErrSolution.DOUBLE_STORY,this_story,this_story);
		} else {
			// story esiste gia' ed e' ancora da definire
			env.tokenStoryTable.replace(story, this_story); // aggiorno con il nuovo token
		}
		return story;
	}
	
	private void manageTitleStory(Story story, Token story_token, Token title) {
		String title_text = title.getText().replace("\"", "");
		if (title_text.isEmpty()) {
			// WARNING COMPILAZIONE: TITOLO VUOTO !!!
			addWarning(WarnType.INCOMPLETE_STORY,WarnCauses.TITLE_EMPTY,WarnSolution.TITLE_EMPTY,title,story_token);
		}
		story.setTitle(title_text); // salvo il titolo
	}
	
	private void manageTextStory(Story story, Token story_token, Token text) {
		if (text != null) {
			String text_story = text.getText().replace("$", "");
			if (text_story.isEmpty()) {
				// WARNING COMPILAZIONE: TESTO VUOTO !!!
				addWarning(WarnType.INCOMPLETE_STORY,WarnCauses.TEXT_EMPTY,WarnSolution.TEXT_EMPTY,text,story_token);
			}
			story.setText(text_story); // salvo il testo
		} else {
			// WARNING COMPILAZIONE: TESTO ASSENTE !!!
			
		}
	}
	
	private void manageNextStory(Story story, Token story_token, Token next_story) {
		String next_story_name = next_story.getText();
		// controllo se gia' esiste nella storyTable
		Story nextStory = env.librogame.getStory(next_story_name);
		// se non esiste
		if (nextStory == null) {
			nextStory = new Story(next_story_name); // creo la nuova nextStory
			env.librogame.addStory(nextStory); // aggiungo nextStory nella storyTable
			env.tokenStoryTable.put(nextStory,next_story); // tengo traccia del token della storia ancora da definire
			env.graph.addVertex(nextStory); // aggiungo nextStory nel grafo
		}
		story.setNext_story(nextStory); // setto next story di story
		env.graph.addEdge(story, nextStory); // collego story alla nextStory nel grafo
	}
	
	private void manageBranchesStory(Story story, Token story_token, LinkedList<String> answers, LinkedList<Token> chosen_stories) {
		//LinkedList<String> choose_answer = new LinkedList<String>();
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
				env.tokenStoryTable.put(temp_story,chosen_story_i); // tengo traccia del token della storia da definire
				env.graph.addVertex(temp_story); // aggiungo la temp_story i-esima nel grafo
			}
			try {
				env.graph.addEdge(story, temp_story); // collego story alla temp_story i-esima
			}catch(IllegalArgumentException e) {
				// WARNING COMPILAZIONE: CICLICO!!!
				addWarning(WarnType.CYCLIC,WarnCauses.CYCLIC,WarnSolution.REDEF_PATH_STORIES);
				env.cyclic = true;
			}
			choose_story.add(temp_story);
		}
		story.setChoose_story(choose_story);
		story.setAnswers(answers);
	}
	
	public void manageStoryBlock(Token this_story, Token next_story, boolean hasBranches, Token title, Token text, LinkedList<Token> chosen_stories, LinkedList<String> answers) {
		Story story = manageThisStory(this_story); // fare che se ritorna null significa che gia' esiste?
		
		if (title != null)
			manageTitleStory(story, this_story, title);
		
		manageTextStory(story,this_story,text);
		
		// NEXT_STORY
		if (next_story != null) {
			if (chosen_stories != null) {
				// ERRORE COMPILAZIONE: BLOCCO CHOSEN SENZA BRANCHES !!! (in realta next_story_choose)
				addError(ErrType.SYNTAX_ERROR,ErrCauses.NEXT_STORY_CHOOSE,ErrSolution.NEXT_STORY_CHOOSE,next_story,next_story);
			}
			manageNextStory(story,this_story,next_story);
		}
		// BRANCHES
		else if (hasBranches) {
			if (chosen_stories == null) {
				// ERRORE COMPILAZIONE: BRANCHES SENZA BLOCCO CHOSEN !!!
				addError(ErrType.SYNTAX_ERROR,ErrCauses.BRANCH_NO_CHOOSE,ErrSolution.BRANCH_NO_CHOOSE,this_story,this_story);
			} else {
				// gestisco solo se c'e' anche CHOSEN
				manageBranchesStory(story,this_story,answers,chosen_stories);
			}
		}
		// STORIA FINALE
		else {
			if (chosen_stories != null)
				addError(ErrType.SYNTAX_ERROR,ErrCauses.CHOOSE_NO_BRANCH,ErrSolution.CHOOSE_NO_BRANCH,this_story,this_story);
		}
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
	
	public void checkStories() {
		Set<Story> names = env.tokenStoryTable.keySet();
		Iterator<Story> itr = names.iterator();
		while (itr.hasNext()) {
			Story story = itr.next();
			Token storyToken = env.tokenStoryTable.get(story);
			if (!story.isComplete()) {
				// ERRORE COMPILAZIONE : STORIA NON DEFINITA
				addError(ErrType.UNDEF_STORY_ERROR,ErrCauses.UNDEF_STORY,ErrSolution.UNDEF_STORY,storyToken,storyToken);
			}
		}
	}
	
	/*----------FINE STORIE----------*/
	
	/*----------GESTIONE GRAFO----------*/
	public void checkGraph() {
		env.cycle_detector = new CycleDetector<>(env.graph);
		env.connectivity_inspector = new ConnectivityInspector<>(env.graph);
		
		if (!env.cyclic && env.cycle_detector.detectCycles()) {
			// WARNING: CICLICLO !!!
			addWarning(WarnType.CYCLIC,WarnCauses.CYCLIC,WarnSolution.REDEF_PATH_STORIES);
		}
		
		if (!env.connectivity_inspector.isConnected()) {
			// WARNING: NON CONNESSO !!!
			addWarning(WarnType.UNATTAINABLE,WarnCauses.UNATTAINABLE,WarnSolution.REDEF_PATH_STORIES);
		}
	}
	/*----------FINE GESTIONE GRAFO----------*/
	
	/*-----------GESTIONE FILES EPUB-----------*/
	public void createFilesFromStories() {
		// solo se non ci sono errori
		if (!env.errorList.isEmpty())
			return;
		
		try {
			//EpubHandler.createCover(env.metadata);
			//crea i file dalle storie
			Set<String> names = env.librogame.storyTable.keySet();
			Iterator<String> itr = names.iterator();
			while (itr.hasNext()) {
				String story_name = itr.next();
				Story story = env.librogame.getStory(story_name);
				//CONTROLLO SE STORIE COMPLETE
				if (story.choose_story != null || story.next_story != null || story.text != null) {
					EpubHandler.createFileFromStory(story);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			addError(ErrType.GEN_FILES_ERROR,ErrCauses.UNKNOWN,ErrSolution.NO_SOLUTION,null,null);
		}
		
	}
	/*-----------FINE GESTIONE FILES EPUB-----------*/
	
}
