package myCompiler.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import coza.opencollab.epub.creator.EpubConstants;
import coza.opencollab.epub.creator.model.Content;
import coza.opencollab.epub.creator.model.EpubBook;
import coza.opencollab.epub.creator.model.Landmark;
import coza.opencollab.epub.creator.util.EpubWriter;
import coza.opencollab.epub.creator.util.MediaTypeUtil;

public class EpubHandler {
	private EpubBook book;
	private Metadata meta;
	private String authors;
	private static final String FILENAME_DEFAULT = "./output/output.epub";
	private static final String HTML_WRAPPER = "<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>{0}</head><body>{1}</body></html>";
	private static final String BUTTON_WRAPPER = "<a href=\"{0}\" class=\"button\">{1}</a>\r\n";
	private static final String SINGLE_CHOICE = "\r\n<h3 class=\"choice\">La storia continua! Premi il bottone per continuare</h3>\r\n";
	private static final String MULT_CHOICE = "\r\n<h3 class=\"choice\">La storia si complica! Scegli tu come continuare la Storia!</h3>\r\n";
	private static final String SINGLE_CHOICE_BUTTON_ANSWER = "Continua la storia!";
	
	public EpubHandler(Metadata meta) {
		this.meta = meta;
		authors = genStringFromAuthors(meta.authors);
		book = new EpubBook("english", "book", meta.title, authors);
	}
	
	//crea cover per il libro
	public static void createCover(Metadata meta) throws IOException {
		//body in html
		String body = "<img src=\"" + meta.cover_path.replace("./output/", "") +"\" alt=\"cover image\" class=\"cover\">\r\n"
					+ "<h1 id=\"title\" class=\"title\">" + meta.title + "</h1>\r\n"
					+ "<h2 class=\"author\">" + genStringFromAuthors(meta.authors) + "</h2>\r\n<br />\r\n"
					+ "<h3 class=\"publisher\">" + meta.publisher + "</h3>\r\n"
					+ "<h4 class=\"year\">" + meta.year.toString() + "</h4>";
		//head in html
		String head = "<title>" + meta.title + "</title>" +
					  "<link rel=\"stylesheet\" href=\"mystyle.css\">";
		//formatta head e body
		Object[] args = {head, body};
		MessageFormat fmt = new MessageFormat(HTML_WRAPPER);
		String fileContent = fmt.format(args);
		BufferedWriter writer = new BufferedWriter(new FileWriter("./output/cover.html"));
	    writer.write(fileContent);
	    writer.close();
	}
	//Crea un file per storia
	public static void createFileFromStory(Story story) throws IOException{
		//crea i buttoni
		String buttons = "";
		//size != 0 sempre
		if (story.choose_story!=null && story.choose_story.size() > 1) {
			int num_buttons = story.choose_story.size();
			buttons += MULT_CHOICE;
			for (int i=0; i<num_buttons; i++) {
				buttons += MessageFormat.format(BUTTON_WRAPPER, story.choose_story.get(i).name + ".html", story.answers.get(i));
			}
			
		}else if (story.next_story!=null){
			buttons += SINGLE_CHOICE;
			buttons += MessageFormat.format(BUTTON_WRAPPER, story.next_story.name + ".html", SINGLE_CHOICE_BUTTON_ANSWER);
		}
		//head e body
		String head = "<title>" + story.title + "</title>" +
				  	  "<link rel=\"stylesheet\" href=\"mystyle.css\">";
		String text = story.text + buttons;
		Object[] args = {head, text};
		
		//FORMATTAZIONE STRINGHE HEAD + BODY
		MessageFormat fmt = new MessageFormat(HTML_WRAPPER);
		String fileContent = fmt.format(args);
		BufferedWriter writer = new BufferedWriter(new FileWriter("./output/" + story.name + ".html"));
	    writer.write(fileContent);
	    writer.close();
	}
	
	//cancella tutti i file che sono stati creati durante il parsing
	public static void abort() throws Exception {
		File folder = new File("./output");
		File[] listOfFiles = folder.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.toLowerCase().endsWith(".html");
		    }
		});
		for (File file : listOfFiles) {
			if (!file.delete()) throw new Exception("file not deleted!");
		}
	}
	
	private static String genStringFromAuthors(LinkedList<String> authors) {
		String retStr = "";
		for (String author : authors) {
			retStr += author + ", ";
		}
		return retStr.substring(0, retStr.length()-2);
		
	}
	
	//create epub with default file name
	public void createEpub() throws IOException {
		createEpub(FILENAME_DEFAULT);
	}
	//create epub
	public void createEpub(String filename) throws IOException {
		File folder = new File("./output");
		File[] listOfFiles = folder.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.toLowerCase().endsWith(".html");
		    }
		});
		//Add HTML to book
		for (File chapt_file : listOfFiles) {
	    	byte[] chapt_bytes = FileUtils.readFileToByteArray(chapt_file);
	    	String myme_type = MediaTypeUtil.getMediaTypeFromExt("html");
		    Content c = new Content(myme_type, chapt_file.getName(), chapt_bytes);
	        book.addContent(c);
	    }

		System.out.println(meta.cover_path);
		
		//Add image to book
		File image_file = new File(meta.cover_path);
		
		System.out.println(image_file.getName());
		
		byte[] img_byte = FileUtils.readFileToByteArray(image_file);
    	String myme_type = MediaTypeUtil.getMediaTypeFromExt("jpg");
    	Content c = new Content(myme_type, image_file.getName(), img_byte);
        book.addContent(c);
        book.addCoverImage(img_byte, myme_type, image_file.getName());
        
        //ADD CSS
        File css_file = new File("./output/mystyle.css");
		byte[] css_byte = FileUtils.readFileToByteArray(css_file);
    	String myme_type_css = MediaTypeUtil.getMediaTypeFromExt("css");
    	Content cs = new Content(myme_type_css, "mystyle.css", css_byte);
        book.addContent(cs);
        
        
        
		EpubWriter writer = new EpubWriter();
	    writer.writeEpubToFile(book, filename);
	}
}
