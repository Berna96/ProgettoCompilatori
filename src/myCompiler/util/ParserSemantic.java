package myCompiler.util;

import java.util.LinkedList;

import org.antlr.runtime.Token;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultEdge;

import myCompiler.util.error.ErrCauses;
import myCompiler.util.error.ErrSolution;
import myCompiler.util.error.ErrType;

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
	/*----------FINE METADATA----------*/
	
	
	/*----------STORIE----------*/
	public void createStory(String this_story_name, String next_story_name, String title, Token text, LinkedList<String> choose_story_name) {
		Story story = env.librogame.getStory(this_story_name); // DEVE RESTITUIRE NULL
		
		// Se e' null significa che non e' gia' presente e quindi non c'e' ridondanza
		if (story == null) {
			story = new Story(this_story_name); // creo la nuova story
			env.librogame.addStory(story); // aggiungo la story nella storyTable
			env.graph.addVertex(story); // aggiungo la story nel grafo
		} else {
			// BLOCCO COMPILAZIONE: RIDONDANZA !!!
			//ErrType.ERROR + ":" + ErrType.IDENTIF_ERROR : ErrCauses.DOUBLE_STORY : ErrSolution.DOUBLE_STORY : 
		}
		
		if (title != null)
			story.setTitle(title);
		
		if (text.getText() != null)
			story.setText(text.getText());
		
		// se next story
		if (next_story_name != null) {
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
		
		// se branches
		else if (choose_story_name != null) {
			LinkedList<Story> choose_story = new LinkedList<Story>(); // preparo la LinkedList
			
			// ciclo i nomi delle storie possibili
			for (int i=0; i < choose_story_name.size(); i++) {
				String name_i = choose_story_name.get(i); // nome storia i-esima
				Story temp_story = env.librogame.getStory(name_i); // estraggo la storia dalla storyTable
				// se non esiste
				if (temp_story == null) {
					temp_story = new Story(name_i); // creo la nuova temp_story i-esima
					env.librogame.addStory(temp_story); // aggiungo la temp_story i-esima nella storyTable
					env.graph.addVertex(temp_story); // aggiungo la temp_story i-esima nel grafo
				}
				env.graph.addEdge(story, temp_story); // collego story alla temp_story i-esima
				choose_story.add(temp_story);
			}
			story.setChoose_story(choose_story);
		}
	}
	
	public void updateGraphInfo() {
		CycleDetector<Story, DefaultEdge> cycle_detector = new CycleDetector<>(env.graph);
		ConnectivityInspector<Story, DefaultEdge> connectivity_inspector = new ConnectivityInspector<>(env.graph);
		env.cyclic = cycle_detector.detectCycles();
		env.connected = connectivity_inspector.isConnected();
	}
	
	/*
	public String setTitleStory(Token title_story) {
		return title_story.getText();
	}
	*/
	
	public void insertChosenStory(Token story){
		env.chosenStories.add(story.getText());
	}
	
	
	public LinkedList<String> getChosenStories(){
		@SuppressWarnings("unchecked")
		LinkedList<String> clone = (LinkedList<String>) env.chosenStories.clone();
		env.chosenStories.clear();
		return clone;
	}
	
}
