package myCompiler.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;

import coza.opencollab.epub.creator.EpubConstants;
import coza.opencollab.epub.creator.model.Content;
import coza.opencollab.epub.creator.model.EpubBook;
import coza.opencollab.epub.creator.util.EpubWriter;
import coza.opencollab.epub.creator.util.MediaTypeUtil;

public class EpubHandler {
	private EpubBook book;
	private Metadata meta;
	private String authors;
	private static final String FILENAME_DEFAULT = "./output/output.epub";
	
	public EpubHandler(Metadata meta) {
		this.meta = meta;
		authors = genStringFromAuthors(meta.authors);
		book = new EpubBook("english", "book", meta.title, authors);
	}
	
	//crea cover per il libro
	public static void createCover(Metadata meta) throws IOException {
		String body = "<img src=\"" + meta.cover_path.replace("./output/", "") +"\" alt=\"cover\">\r\n"
					+ "<h1>" + meta.title + "</h1>\r\n"
					+ "<h2>" + genStringFromAuthors(meta.authors) + "</h2>\r\n<br /><br />"
					+ "<h3>" + meta.publisher + "</h3>\r\n"
					+ "<h4>" + meta.year.toString() + "</h4>";
		Object[] args = {meta.title, body};
		MessageFormat fmt = new MessageFormat(EpubConstants.HTML_WRAPPER);
		String fileContent = fmt.format(args);
		BufferedWriter writer = new BufferedWriter(new FileWriter("./output/cover.html"));
	    writer.write(fileContent);
	    writer.close();
	}
	//Crea un file per storia
	public static void createFileFromStory(Story story) throws IOException{
		Object[] args = {story.title, story.text};
		MessageFormat fmt = new MessageFormat(EpubConstants.HTML_WRAPPER);
		String fileContent = fmt.format(args);
		BufferedWriter writer = new BufferedWriter(new FileWriter("./output/" + story.title + ".html"));
	    writer.write(fileContent);
	    writer.close();
	}
	
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
		//Add image to book
		File image_file = new File(meta.cover_path);
		byte[] img_byte = FileUtils.readFileToByteArray(image_file);
    	String myme_type = MediaTypeUtil.getMediaTypeFromExt("jpg");
    	Content c = new Content(myme_type, image_file.getName(), img_byte);
        book.addContent(c);
		
		EpubWriter writer = new EpubWriter();
	    writer.writeEpubToFile(book, filename);
	}
}
