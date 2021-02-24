package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import coza.opencollab.epub.creator.EpubConstants;
import coza.opencollab.epub.creator.api.MetadataItem;
import coza.opencollab.epub.creator.impl.OpfCreatorDefault;
import coza.opencollab.epub.creator.impl.TocCreatorDefault;
import coza.opencollab.epub.creator.model.Content;
import coza.opencollab.epub.creator.model.EpubBook;
import coza.opencollab.epub.creator.model.Landmark;
import coza.opencollab.epub.creator.model.TocLink;
import coza.opencollab.epub.creator.util.EpubWriter;
import coza.opencollab.epub.creator.util.MediaTypeUtil;


public class EpubTester {
	
	  
	public static void main(String[] args) {
		
		try {
			
		    // Create new Book
		    EpubBook book = new EpubBook("english", "1", "Il pianeta delle scimmie", "Dr zaius");
		    
		  //Add cover image
		   /*non vede l'immagine*/
	        File my_cover_image = new File("./output/book_cover.jpg");
	        byte[] cover_bytes = FileUtils.readFileToByteArray(my_cover_image);		        
	        String myme_type = MediaTypeUtil.getMediaTypeFromExt("jpg");
	        System.out.println(myme_type);
	        book.addCoverImage(cover_bytes, myme_type, "Images/book_cover.jpg");
		    
		    
		    //Add content 1
		    String s1 = "Amami Gian!"; 
		    Content c1 = new Content("text/html", "Text/Chapter1.html", s1.getBytes());
		    book.addContent(c1);
		    //Add content 2
		    String s2 = "<!DOCTYPE html>\r\n"
		    		+ "<html>\r\n"
		    		+ "<body>\r\n"
		    		+ "\r\n"
		    		+ "<h1>My First Heading</h1>\r\n"
		    		+ "<p>My first paragraph.</p>\r\n"
		    		+ "<p> I love you doctor Zaius! </p>\r\n"
		    		+ "</body>\r\n"
		    		+ "</html>"; 
		    myme_type = MediaTypeUtil.getMediaTypeFromExt("html");
		    System.out.println(myme_type);
		    Content c2 = new Content(myme_type, "Text/Chapter2.html", s2.getBytes());
		    book.addContent(c2);
		    
		    //Landmarks
		    /*
		     * cover – the book cover(s), jacket information, etc.
			toc – table of contents
			bodymatter – First "real" page of content (e.g. "Chapter 1")
			title-page – page with possibly title, author, publisher, and other metadata
			*/
		    List<Landmark> ll = new ArrayList<>();
		    //cover
		    Landmark l1 = new Landmark();
		    l1.setType("cover");
		    l1.setHref("Images/book_cover.jpg");
		    l1.setTitle("Cover Image");
		    ll.add(l1);
		    //toc
		    Landmark l2 = new Landmark();
		    l2.setType("toc");
		    l2.setHref(EpubConstants.TOC_FILE_NAME + "#TOC");
		    l2.setTitle("Table of Contents");
		    ll.add(l2);
		    //bodymatter
		    Landmark l3 = new Landmark();
		    l3.setType("bodymatter");
		    l3.setHref("Text/Chapter1.html");
		    l3.setTitle("Start of Content");
		    ll.add(l3);
		    //title-page
		    Landmark l4 = new Landmark();
		    l4.setType("titlepage");
		    l4.setHref(EpubConstants.OPF_FILE_NAME + "#dc:title");
		    l4.setTitle("Title Page");
		    ll.add(l4);
		    
		    book.setLandmarks(ll);
		    
		    //TOC links
		    List<TocLink> lt = new ArrayList<>();
		    TocLink t = new TocLink("Text/Chapter1.html", "pippo", "pippo2");
		    lt.add(t);
		    book.setTocLinks(lt);
		    
		    EpubWriter writer = new EpubWriter();
		    String filename = "./output/prova_output.epub";
		    writer.writeEpubToFile(book, filename);
		    System.out.println("Output : " + filename);
		    
		    OpfCreatorDefault opf = new OpfCreatorDefault();
		    TocCreatorDefault toc = new TocCreatorDefault();
		    
		    System.out.println("LandMarks : " + book.getLandmarks() + "; \n" +
		    					"Contents : " + book.getContents() + "; \n" +
		    					"TocLinks : " + book.getTocLinks() + "; \n" + 
		    					"Toc from book : " + toc.createTocFromBook(book).getProperties() + "; \n"
		    					);
		    
		    
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

	}

}
