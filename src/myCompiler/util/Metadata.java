package myCompiler.util;

import java.util.LinkedList;

public class Metadata {
	public String publisher;
	public String title;
	public Integer year;
	public LinkedList<String> authors;
	public String cover_path;
	
	public Metadata() {
		authors = new LinkedList<String>();
	}
/*
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public void setCover(String cover_path) {
		this.cover_path = cover_path;
	}
	public void addAuthor(String author) {
		this.authors.add(author);
	}
	public void removeAuthor(int i) {
		//if (i>= 0 && i < authors.size())
		this.authors.remove(i);
	}
	
	public String getPublisher() {
		return publisher;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getCover() {
		return cover_path;
	}
	public LinkedList<String> getAuthors() {
		return authors;
	}
*/
	@Override
	public String toString() {
		return "Metadata [publisher=" + publisher + ", title=" + title + ", year=" + year + ", authors=" + authors
				+ ", cover_path=" + cover_path + "]";
	}
}
