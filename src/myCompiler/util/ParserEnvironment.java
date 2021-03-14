package myCompiler.util;

import java.util.Hashtable;
import java.util.LinkedList;

import org.antlr.runtime.Token;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
//import org.jgrapht.alg.connectivity.ConnectivityInspector;
//import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

import myCompiler.util.error.CompilationError;
import myCompiler.util.warning.CompilationWarning;


public class ParserEnvironment {
	public String translation;
	public LinkedList<CompilationError> errorList;
	public LinkedList<CompilationWarning> warningList;
	
	public LibroGame librogame;
	
	public Metadata metadata;
	public LinkedList<Token> chosenStories;
	public LinkedList<String> answers;
	
	/*
	 * tokenStoryTable associa una Story ad un Token.
	 * Controllare se story.isComplete()
	 * Se story e' completa, il Token associato e' il blocco Story in cui e' stata definita
	 * Se story non e' completa, il Token associato e' quello dove compare il nome della storia non ancora definita
	 */
	public Hashtable<Story, Token> tokenStoryTable;
	
	public Graph<Story, DefaultEdge> graph;
	CycleDetector<Story, DefaultEdge> cycle_detector;
	ConnectivityInspector<Story, DefaultEdge> connectivity_inspector;
	//public boolean cyclic;
	//public boolean connected;
	
	public ParserEnvironment() {
		translation = "";
		errorList = new LinkedList<>();
		warningList = new LinkedList<>();
		metadata = new Metadata();
		chosenStories = new LinkedList<>();
		answers = new LinkedList<>();
		
		tokenStoryTable = new Hashtable<>();
		
		librogame = new LibroGame();
		
		graph = new SimpleDirectedGraph<>(DefaultEdge.class);
		//cyclic = false;
		//connected = true;
	}
}
