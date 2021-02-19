package myPackage;

import java.util.LinkedList;

import org.antlr.runtime.Token;

public class Environment {
	public String translation;
	public LinkedList<String> errorList;
	public LinkedList<String> warningList;
	//qualcos'altro
	
	public Metadata metadata;
	public LinkedList<String> chosenStories;
	
	public Environment() {
		translation = "";
		errorList = new LinkedList<>();
		warningList = new LinkedList<>();
		metadata = new Metadata();
		chosenStories = new LinkedList<>();
	}
	
	/*----------METADATA----------*/
	public void setPublisher(Token publisher) {
		metadata.publisher = publisher.getText().replace("\"", "");
	}
	
	public void setTitleBook(Token title_book) {
		metadata.title = title_book.getText().replace("\"", "");
	}
	
	public void addAuthor(Token author) {
		metadata.authors.add(author.getText().replace("\"", ""));
	}
	
	public void setYear(Token year) {
		metadata.year = Integer.parseInt(year.getText());
	}
	
	public void setCover(Token cover) {
		metadata.cover_path = cover.getText();
	}
	/*----------FINE METADATA----------*/
	
	/*--------------BIOH----------------*/
	void insertChosenStories(Token story){
		chosenStories.add(story.getText());
	}
	
	public LinkedList<String> getChosenStories(){
		LinkedList<String> clone = (LinkedList<String>) chosenStories.clone();
		chosenStories.clear();
		return clone;
	}
	
	
}
