package test;

import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

public class MyGraphTest {

	public static void main(String[] args) {
		Graph<String, DefaultEdge> graph = new SimpleDirectedGraph<>(DefaultEdge.class);
		String[] stories = new String[5];
		stories[0] = "Storia1";
		stories[1] = "Storia2";
		stories[2] = "Storia3";
		stories[3] = "Storia4";
		stories[4] = "Storia5";
		
		graph.addVertex(stories[0]);
		graph.addVertex(stories[1]);
		graph.addVertex(stories[2]);
		graph.addVertex(stories[3]);
		graph.addVertex(stories[4]);
		
		
		graph.addEdge(stories[0], stories[1]);
		graph.addEdge(stories[0], stories[2]);
		graph.addEdge(stories[2], stories[3]);
		graph.addEdge(stories[2], stories[4]);
		
		System.out.println(graph.toString());
		
		//check cycle
		CycleDetector<String, DefaultEdge> c1 = new CycleDetector<>(graph);
		System.out.println( "Ci sono cicli? " + c1.detectCycles());
		
		//add cycle
		graph.addEdge(stories[1], stories[0]);
		System.out.println(graph.toString());
		
		//check cycle
		CycleDetector<String, DefaultEdge> c2 = new CycleDetector<>(graph);
		System.out.println( "Ci sono cicli? " + c2.detectCycles());
		System.out.println( "Quali sono cicli? " + c2.findCycles());
		
		
		ConnectivityInspector<String, DefaultEdge> conn1 = new ConnectivityInspector<>(graph);
		System.out.println( "Connesso? " + conn1.isConnected());
		
		graph.addVertex("pippa");
		ConnectivityInspector<String, DefaultEdge> conn2 = new ConnectivityInspector<>(graph);
		System.out.println( "Connesso? " + conn2.isConnected() + ". " + conn2.connectedSets());
		
		Graph<String, DefaultEdge> graph2 = new SimpleDirectedGraph<>(DefaultEdge.class);
		String s1 = "Ciaone";
		graph2.addVertex(s1);
		try {
			graph2.addEdge(s1, s1);
		}catch(IllegalArgumentException e) {
			
		}
	}

}
