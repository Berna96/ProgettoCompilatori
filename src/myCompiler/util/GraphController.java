package myCompiler.util;

import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

public abstract class GraphController<T> {
	private Graph<T, DefaultEdge> graph;
	private CycleDetector<T, DefaultEdge> cycle_detector;
	private ConnectivityInspector<T, DefaultEdge> connectivity_inspector;
	private boolean cyclic;
	private boolean connected;
	
	public GraphController() {
		graph = new SimpleDirectedGraph<>(DefaultEdge.class);
		cycle_detector = new CycleDetector<>(graph);
		connectivity_inspector = new ConnectivityInspector<>(graph);
		cyclic = false;
		connected = true;
	}
	
	private void updateParams(boolean cyclic, boolean connected) {
		this.cyclic = cyclic;
		this.connected = connected;
	}
	
	public void addNode(T nodo) {
		graph.addVertex(nodo);
		updateParams(cycle_detector.detectCycles(),
				 connectivity_inspector.isConnected());
	}
	public void addArch(T nodo1, T nodo2) {
		graph.addEdge(nodo1, nodo2);
		updateParams(cycle_detector.detectCycles(),
				 connectivity_inspector.isConnected());
	}
	
	public boolean isCyclic() {
		return cyclic;
	}
	public boolean isConnected() {
		return connected;
	}
}
