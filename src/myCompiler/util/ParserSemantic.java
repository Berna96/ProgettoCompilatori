package myCompiler.util;

import java.util.LinkedList;

import org.antlr.runtime.Token;

import myCompiler.MyGrammarParser.story_return;

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
		Story storia = env.librogame.getStory(this_story_name);
		
		if (storia == null) {
			storia = new Story(this_story_name);
			env.librogame.addStory(storia);
		}
		
		if (next_story_name != null) {
			Story next_story = env.librogame.getStory(next_story_name);
			if (next_story == null) {
				next_story = new Story(next_story_name);
				env.librogame.addStory(next_story);
				storia.setNext_story(next_story);
			}
		}
		
		if (title != null)
			storia.setTitle(title);
		
		if (text.getText() != null)
			storia.setText(text.getText());
		
		if (choose_story_name != null) {
			LinkedList<Story> choose_story = new LinkedList<Story>();
			for(int i = 0; i < choose_story_name.size(); i++) {
				String name_i = choose_story_name.get(i);
				Story temp_story = new Story(name_i);
				choose_story.add(temp_story);
			}
			storia.setChoose_story(choose_story);
		}
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
