package myCompiler.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;


public class LibroGame {
	// CAMPI DEDICATI AL LIBROGAME
	public Metadata metadata;
	public LinkedHashMap<String, Story> storyTable;
	
	// COSTRUTTORI
	public LibroGame(String publisher, String title, Integer year, LinkedList<String> authors, String cover_path) {
		metadata = new Metadata();
		metadata.publisher = publisher;
		metadata.title = title;
		metadata.year = year;
		metadata.authors = authors;
		metadata.cover_path = cover_path;
		storyTable = new LinkedHashMap<String,Story>();
	}
	public LibroGame(Metadata metadata) {
		storyTable = new LinkedHashMap<String,Story>();
		this.metadata = metadata;
	}
	public LibroGame() {
		storyTable = new LinkedHashMap<String,Story>(); // SEMPRE aggiornata
		this.metadata = new Metadata();
	}
	
	// METODI DEDICATI AL LIBROGAME
	public void addStory(Story story) {
		// per i controlli in sem, story e' di certo NUOVA
		storyTable.put(story.name, story);
	}
	
	public Story getStory(String storyName) {
		return storyTable.get(storyName);
	}
	
	@Override
	public String toString() {
		String output = "Librogame[\n";
		Set<String> names = storyTable.keySet();
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String story_name = itr.next();
			output += story_name;
			Story storia = storyTable.get(story_name);
			if (storia.next_story != null) {
				output += " -> " + storia.next_story.name + "\n";
			} else if (storia.choose_story != null) {
				output += " -> BRANCHES [";
				for (int i=0; i < storia.choose_story.size(); i++) {
					output += storia.choose_story.get(i).name;
					if (i < storia.choose_story.size() - 1)
						output += "; ";
				}
				output += "]\n";
			} else {
				output += " [END]\n";
			}
		}
		output += "]";
		return output;
	}

/*
	// METODI DEDICATI AL CONTROLLO
	public boolean isCyclic() {
		return cyclic;
	}
	public boolean isConnected() {
		return connected;
	}
*/
}
