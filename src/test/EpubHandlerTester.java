package test;

import java.io.IOException;
import java.util.LinkedList;

import myCompiler.util.EpubHandler;
import myCompiler.util.Metadata;
import myCompiler.util.Story;

public class EpubHandlerTester {

	public static void main(String[] args) {
		Metadata meta = new Metadata();
		meta.title = "Il pianeta delle scimmie";
		meta.cover_path = "./output/book_cover.jpg";
		meta.publisher = "pippo";
		meta.authors = new LinkedList<String>();
		meta.authors.add("mimmo");
		meta.authors.add("mimma");
		meta.year = 1992;
		
		//ParserSemantic
		EpubHandler hand = new EpubHandler(meta);
		try {
			EpubHandler.createCover(meta);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//ParserSemantic
		for (int i=1; i<3; i++) {
			Story story = new Story("story" + i);
			story.text = "text" + i;
			story.title = "title" + i;
			try {
				EpubHandler.createFileFromStory(story);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			//ParserUser
			hand.createEpub();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
