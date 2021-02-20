package myCompiler.util;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LibroGame {
	// CAMPI
	public Metadata metadata;
	public Hashtable<String, Story> storyTable;
	
	// COSTRUTTORI
	public LibroGame(String publisher, String title, Integer year, LinkedList<String> authors, String cover_path) {
		storyTable = new Hashtable<String,Story>();
	}
	public LibroGame(Metadata metadata) {
		storyTable = new Hashtable<String,Story>();
		this.metadata = metadata;
	}
	public LibroGame() {
		storyTable = new Hashtable<String,Story>();
		this.metadata = new Metadata();
	}
	
	// METODI
	public void addStory(Story story) {
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
				output += " -> BRANCHES\n";
			} else {
				output += "\n";
			}
		}
		output += "]";
		return output;
	}
}
