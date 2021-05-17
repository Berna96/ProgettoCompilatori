package myCompiler.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.text.MessageFormat;
//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;

import org.apache.commons.io.FileUtils;

//import coza.opencollab.epub.creator.EpubConstants;
import coza.opencollab.epub.creator.model.Content;
import coza.opencollab.epub.creator.model.EpubBook;
//import coza.opencollab.epub.creator.model.Landmark;
import coza.opencollab.epub.creator.util.EpubWriter;
import coza.opencollab.epub.creator.util.MediaTypeUtil;

public class EpubHandler {
	private EpubBook book;
	private Metadata meta;
	private String authors;
	private static final String FILENAME_DEFAULT = "./librogame.epub";
	private static final String HTML_WRAPPER = "<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>{0}</head><body>{1}</body></html>";
	private static final String BUTTON_WRAPPER = "<a href=\"{0}\" class=\"button\">{1}</a></br>";
	private static final String SINGLE_CHOICE_BUTTON_ANSWER = "Continua la storia!";
	private static final String STYLE_CSS = ".cover {\r\n"
											+ "	display: block;\r\n"
											+ "  	margin-left: auto;\r\n"
											+ "  	margin-right: auto;\r\n"
											+ "  	width: 50%;\r\n"
											+ "}\r\n"
											+ "\r\n"
											+ ".title .author .publisher .year {\r\n"
											+ "	text-align: center;\r\n"
											+ "}\r\n"
											+ "\r\n"
											+ ".button {\r\n"
											+ "  background-color: #008CBA;\r\n"
											+ "  border: none;\r\n"
											+ "  color: white;\r\n"
											+ "  padding: 15px 32px;\r\n"
											+ "  text-align: center;\r\n"
											+ "  text-decoration: none;\r\n"
											+ "  display: inline-block;\r\n"
											+ "  font-size: 16px;\r\n"
											+ "}";
	private static final String TEMP_FOLDER = "./output/";
	private static int index;
	
	public EpubHandler(Metadata meta) {
		this.meta = meta;
		authors = genStringFromAuthors(meta.authors);
		book = new EpubBook("english", "book", meta.title, authors);
		index = 0;
	}
	
	private static void setHiddenAttrib(Path filePath) {		
		try {
			DosFileAttributes attr = Files.readAttributes(filePath, DosFileAttributes.class);
			if (!attr.isHidden())
				Files.setAttribute(filePath, "dos:hidden", true);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	//crea cover per il libro
	public static void createCover(Metadata meta) throws IOException {
		File output_path = new File(TEMP_FOLDER);
		if (!output_path.exists() || !output_path.isDirectory()) {
			Path filePath = Paths.get(TEMP_FOLDER);
			Files.createDirectories(filePath);
			setHiddenAttrib(filePath);
		}
		
		String img = "";
		if (meta.cover_path != null) {
			img = "<img src=\"" + meta.cover_path.replace(TEMP_FOLDER, "") +"\" alt=\"cover image\" class=\"cover\">\r\n";
		}
		String publisher = "";
		if (meta.publisher!=null) {
			publisher = "<h3 class=\"publisher\">" + meta.publisher + "</h3>\r\n";
		}
		String year = "";
		if (meta.year != null) {
			year = "<h4 class=\"year\">" + meta.year.toString() + "</h4>";
		}
		//body in html
		String body = img
					+ "<h1 id=\"title\" class=\"title\">" + meta.title + "</h1>\r\n"
					+ "<h2 class=\"author\">" + genStringFromAuthors(meta.authors) + "</h2>\r\n<br />\r\n"
					+ publisher
					+ year;
		//head in html
		String head = "<title>" + meta.title + "</title>" +
					  "<link rel=\"stylesheet\" href=\"mystyle.css\">";
		//formatta head e body
		Object[] args = {head, body};
		MessageFormat fmt = new MessageFormat(HTML_WRAPPER);
		String fileContent = fmt.format(args);
		BufferedWriter writer = new BufferedWriter(new FileWriter(TEMP_FOLDER +"cover.html"));
	    writer.write(fileContent);
	    writer.close();
	}
	//TODO:controllare con gian
	//Crea un file per storia
	public static void createFileFromStory(Story story) throws IOException{
		index++;
		File output_path = new File(TEMP_FOLDER);
		if (!output_path.exists() || !output_path.isDirectory()) {
			Path filePath = Paths.get(TEMP_FOLDER);
			Files.createDirectories(filePath);
			setHiddenAttrib(filePath);
		}
		
		//crea i buttoni
		String buttons = "</br>";
		//size != 0 sempre
		if (story.choose_story!=null && story.choose_story.size() > 1) {
			int num_buttons = story.choose_story.size();
			//buttons += MULT_CHOICE;
			for (int i=0; i<num_buttons; i++) {
				buttons += MessageFormat.format(BUTTON_WRAPPER, index + story.choose_story.get(i).name + ".html", story.answers.get(i));
			}
			
		}else if (story.next_story!=null){
			//buttons += SINGLE_CHOICE;
			buttons += MessageFormat.format(BUTTON_WRAPPER, index + story.next_story.name + ".html", SINGLE_CHOICE_BUTTON_ANSWER);
		}
		//crea il titolo
		String title_body = "";
		if (story.title != null) {
			title_body = "<h3>" + story.title + "</h3>\r\n";
		}
		
		//head e body
		String head = "<title>" + story.title + "</title>" +
				  	  "<link rel=\"stylesheet\" href=\"mystyle.css\">";
		String text = title_body + story.text + buttons;
		Object[] args = {head, text};
		
		//FORMATTAZIONE STRINGHE HEAD + BODY
		MessageFormat fmt = new MessageFormat(HTML_WRAPPER);
		String fileContent = fmt.format(args);
		BufferedWriter writer = new BufferedWriter(new FileWriter(TEMP_FOLDER + index + story.name + ".html"));
	    writer.write(fileContent);
	    writer.close();
	}
	
	static boolean deleteDirectory(File directoryToBeDeleted) {
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            deleteDirectory(file);
	        }
	    }
	    return directoryToBeDeleted.delete();
	}
	
	//cancella tutti i file che sono stati creati durante il parsing
	public static void abort() throws Exception {
		File folder = new File(TEMP_FOLDER);
		deleteDirectory(folder);
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
		File folder = new File(TEMP_FOLDER);
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

		//System.out.println(meta.cover_path);
		
		//Add image to book
		if (meta.cover_path != null) {
			File image_file = new File(meta.cover_path);
				
			byte[] img_byte = FileUtils.readFileToByteArray(image_file);
			String myme_type = MediaTypeUtil.getMediaTypeFromExt("jpg");
			Content c = new Content(myme_type, image_file.getName(), img_byte);
			book.addContent(c);
			book.addCoverImage(img_byte, myme_type, image_file.getName());
		}
        //ADD CSS
        FileWriter css_writer = new FileWriter(TEMP_FOLDER + "mystyle.css");
        css_writer.write(STYLE_CSS);
        css_writer.close();
        File css_file = new File(TEMP_FOLDER + "mystyle.css");
		byte[] css_byte = FileUtils.readFileToByteArray(css_file);
    	String myme_type_css = MediaTypeUtil.getMediaTypeFromExt("css");
    	Content cs = new Content(myme_type_css, "mystyle.css", css_byte);
        book.addContent(cs);
        
		EpubWriter writer = new EpubWriter();
	    writer.writeEpubToFile(book, filename);
	    
	    deleteDirectory(folder);
	}
}
