package myCompiler.util;

import java.util.LinkedList;

public class ParserMetadata {
	public String publisher;
	public String title;
	public Integer year;
	public LinkedList<String> authors;
	public String cover_path;
	
	public ParserMetadata() {
		authors = new LinkedList<String>();
	}

	@Override
	public String toString() {
		return "Metadata [publisher=" + publisher + ", title=" + title + ", year=" + year + ", authors=" + authors
				+ ", cover_path=" + cover_path + "]";
	}
}
