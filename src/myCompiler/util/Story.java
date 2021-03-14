package myCompiler.util;

import java.util.LinkedList;

public class Story {
	public String name;
	public String title;
	public String text;
	public LinkedList<String> answers;
	public LinkedList<Story> choose_story;
	public Story next_story;
	
	public Story (String name) {
		this.name = name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setAnswers(LinkedList<String> answers) {
		this.answers = answers;
	}
	public void setChoose_story(LinkedList<Story> choose_story) {
		this.choose_story = choose_story;
	}
	public void setNext_story(Story next_story) {
		this.next_story = next_story;
	}
	
	public boolean isComplete() {
		return text != null;
	}
		
	@Override
	public String toString() {
		return "Story[name: " + name + "\n"
				+ "title: " + title + "\n"
				+ "text: " + text + "]";
	}
	
}