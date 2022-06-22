package io.github.rroggia.algorithm.chapter4.section1.examples;

public class GraphClient {
	public static void main(String[] args) {
		var graph = new Graph(10);
		graph.addEdge(3, 0);
		graph.addEdge(3, 2);
		graph.addEdge(0, 2);
		graph.addEdge(7, 9);
		graph.addEdge(6, 4);
		
		System.out.println(graph);
	}
}
