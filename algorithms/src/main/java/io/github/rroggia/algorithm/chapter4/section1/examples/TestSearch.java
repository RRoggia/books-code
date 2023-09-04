package io.github.rroggia.algorithm.chapter4.section1.examples;

import edu.princeton.cs.algs4.StdOut;

public class TestSearch {
	public static void main(String[] args) {
		var graph = new Graph(13);
		graph.addEdge(0, 5);
		graph.addEdge(4, 3);
		graph.addEdge(0, 1);
		graph.addEdge(9, 12);
		graph.addEdge(6, 4);
		graph.addEdge(5, 4);
		graph.addEdge(0, 2);
		graph.addEdge(11, 12);
		graph.addEdge(9, 10);
		graph.addEdge(0, 6);
		graph.addEdge(7, 8);
		graph.addEdge(9, 11);
		graph.addEdge(5, 3);

		System.out.println("UF");
		runSearch(new UFSearch(graph, 0), graph);
		StdOut.println("DFS");
		runSearch(new DepthFirstSearch(graph, 0), graph);

	}

	public static void runSearch(Search search, Graph graph) {
		for (int v = 0; v < graph.vertices(); v++) {
			if (search.marked(v)) {
				StdOut.print(v + " ");
			}
		}
		StdOut.println();
		System.out.println(search.count());
		if (search.count() != graph.vertices()) {
			StdOut.print("NOT ");
		}
		StdOut.print("connected");
		StdOut.println();
	}
}
