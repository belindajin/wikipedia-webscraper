package nets150_hw5;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Graph {
	
	private HashMap<String, HashSet<String>> adjMap;

	public Graph() {
		adjMap = new HashMap<String, HashSet<String>>();
	}
	
	/**
	 * 
	 * @param name of vertex to add
	 * 
	 * adds vertex to graph
	 */
	public void addVertex(String name) {
		adjMap.put(name, new HashSet<String>());
	}
	
	/**
	 * 
	 * @param n1: start node of edge
	 * @param n2: end node of edge
	 * 
	 * adds directed edge to graph
	 */
	public void addEdge(String n1, String n2) {
		if(adjMap.containsKey(n1) && adjMap.containsKey(n2)){
			adjMap.get(n1).add(n2);
		}
		else {
			throw new IllegalArgumentException("Vertex doesn't exist");
		}
	}
	
	/**
	 * 
	 * @param vertex name
	 * @return set of vertices the given vertex points to
	 */
	public HashSet<String> getAdjacent(String vertex) {
		HashSet<String> toReturn = adjMap.get(vertex);
		return toReturn;
	}
	
	/**
	 * 
	 * @param vertex
	 * @return whether or not graph contains vertex
	 */
	public boolean contains(String vertex) {
		return adjMap.containsKey(vertex);
	}
	
	/**
	 * prints out list of vertices followed by set of each vertex's edges
	 */
	public void printGraph() {
		for (String vertex: adjMap.keySet()) {
			System.out.println("Vertex: " + vertex);
			System.out.println("Edges: " + adjMap.get(vertex).toString());
		}
	}
}
