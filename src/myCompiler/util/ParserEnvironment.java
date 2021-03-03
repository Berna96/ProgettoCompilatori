package myCompiler.util;

import java.util.LinkedList;

import org.antlr.runtime.Token;
import org.jgrapht.Graph;
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
	//public LinkedList<String> chosenStories;
	public LinkedList<Token> chosenStories;
	public LinkedList<String> answers;
	
	public Graph<Story, DefaultEdge> graph;
	public boolean cyclic;
	public boolean connected;
	
	public ParserEnvironment() {
		translation = "";
		errorList = new LinkedList<>();
		warningList = new LinkedList<>();
		metadata = new Metadata();
		chosenStories = new LinkedList<>();
		answers = new LinkedList<>();
		
		librogame = new LibroGame();
		
		graph = new SimpleDirectedGraph<>(DefaultEdge.class);
		/*
		cycle_detector = new CycleDetector<>(graph);
		connectivity_inspector = new ConnectivityInspector<>(graph); // non si aggiorna in tempo reale
		*/
		cyclic = false;
		connected = true;
	}
}
