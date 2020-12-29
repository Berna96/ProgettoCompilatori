package myPackage;

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

	@Override
	public String toString() {
		return "Metadata [publisher=" + publisher + ", title=" + title + ", year=" + year + ", authors=" + authors
				+ ", cover_path=" + cover_path + "]";
	}
}
