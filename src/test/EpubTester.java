package test;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;

import coza.opencollab.epub.creator.api.MetadataItem;
import coza.opencollab.epub.creator.model.Content;
import coza.opencollab.epub.creator.model.EpubBook;
import coza.opencollab.epub.creator.util.EpubWriter;

public class EpubTester {
	
	  
	public static void main(String[] args) {
		
		try {
		      // Create new Book
		    EpubBook book = new EpubBook("english", "1", "Il pianeta delle scimmie", "Dr zaius");
		    //Content c1 = new Content();
		    //book.addCoverImage(null, null, null);
		    book.addContent(null)
		    
		    //book.addContent(new Content());
		    EpubWriter writer = new EpubWriter();
		    writer.writeEpubToFile(book, "addcontent.epub");
		    
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

	}

}
