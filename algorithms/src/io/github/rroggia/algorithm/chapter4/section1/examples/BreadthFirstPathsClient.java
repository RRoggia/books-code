package io.github.rroggia.algorithm.chapter4.section1.examples;

import edu.princeton.cs.algs4.StdOut;

public class BreadthFirstPathsClient {
	public static void main(String[] args) {
		var graph = new Graph(10);
		graph.addEdge(3, 1);
		graph.addEdge(3, 2);
		graph.addEdge(1, 2);
		graph.addEdge(4, 1);
		graph.addEdge(7, 9);
		graph.addEdge(6, 4);

		int source = 2;
		BreadthFirstPaths search = new BreadthFirstPaths(graph, source);
		for (int i = 0; i < graph.vertices(); i++) {
			StdOut.println(source + " to " + i + ":");
			if (search.hasPathTo(i)) {
				for (int x : search.pathTo(i)) {
					if (x == source) {
						StdOut.print(x);
					} else {
						StdOut.print("-" + x);
					}
				}
				StdOut.println();
			}
		}
	}
}
