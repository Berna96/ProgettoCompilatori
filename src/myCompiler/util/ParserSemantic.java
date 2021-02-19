package myCompiler.util;

import java.util.LinkedList;

import org.antlr.runtime.Token;

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
	
	/*--------------BIOH----------------*/
	
	void createStory() {
		
	}
	
	void insertChosenStories(Token story){
		env.chosenStories.add(story.getText());
	}
	
	public LinkedList<String> getChosenStories(){
		@SuppressWarnings("unchecked")
		LinkedList<String> clone = (LinkedList<String>) env.chosenStories.clone();
		env.chosenStories.clear();
		return clone;
	}
}
