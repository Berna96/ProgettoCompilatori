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
		    
		    //Add content 1
		    for (int i=0; i<3; i++) {
		    	File chapt_file = new File("./output/chapter" + i + ".html");
		    	byte[] chapt_bytes = FileUtils.readFileToByteArray(chapt_file);
		    	String myme_type = MediaTypeUtil.getMediaTypeFromExt("html");
			    Content c = new Content(myme_type, "Text/Chapter" + i + ".html", chapt_bytes);
		        book.addContent(c);
		    }
		    /*
		    String s1 = "Amami Gian!"; 
		    Content c1 = new Content("text/html", "Text/Chapter1.html", s1.getBytes());
		    book.addContent(c1);
		    */
		    
		    //Add cover image
		    File my_cover_image = new File("./output/book_cover.jpg");
	        byte[] cover_bytes = FileUtils.readFileToByteArray(my_cover_image);		        
	        String myme_type1 = MediaTypeUtil.getMediaTypeFromExt("jpg");
	        System.out.println(myme_type1);
	        book.addCoverImage(cover_bytes, myme_type1, "Images/book_cover.jpg");
		    
		    
		    //Landmarks
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
		    l4.setHref("Text/Chapter0.html#title");
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
		    System.out.println("Output : " + EpubConstants.HTML_WRAPPER);
		    
		    
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
			
	}

}
