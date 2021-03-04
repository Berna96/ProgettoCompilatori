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
		Story[] stories = new Story[3];
		for (int i=0; i<3; i++) {
			Story story = new Story("story" + i);
			story.text = "text" + i;
			story.title = "title" + i;
			story.choose_story = new LinkedList<Story>();
			stories[i] = story;
		}
		stories[0].choose_story.add(stories[1]); //0 -> 1,2
		stories[0].choose_story.add(stories[2]);
		LinkedList<String> answ0 = new LinkedList<>();
		answ0.add("fight");
		answ0.add("run away");
		stories[1].choose_story.add(stories[2]);// 1 -> 2
		stories[1].next_story = stories[2];
		stories[2].choose_story.add(stories[0]);// 2 -> 0
		stories[2].next_story = stories[0];
		
		
		for (int i= 0; i<3; i++) {
			try {
				EpubHandler.createFileFromStory(stories[i], answ0);
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
