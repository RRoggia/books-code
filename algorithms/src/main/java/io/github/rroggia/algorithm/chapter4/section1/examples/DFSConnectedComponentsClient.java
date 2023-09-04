package io.github.rroggia.algorithm.chapter4.section1.examples;

import edu.princeton.cs.algs4.StdOut;
import io.github.rroggia.algorithm.chapter1.section3.examples.Bag;

@SuppressWarnings("unchecked")
public class DFSConnectedComponentsClient {
	public static void main(String[] args) {
		var graph = new Graph(10);
		graph.addEdge(3, 1);
		graph.addEdge(3, 2);
		graph.addEdge(1, 2);
		graph.addEdge(7, 9);
		graph.addEdge(6, 4);
		var cc = new DFSConnectedComponents(graph);

		int total = cc.count();
		StdOut.println(total + " components");

		Bag<Integer>[] components = (Bag<Integer>[]) new Bag[total];

		for (int i = 0; i < total; i++) {
			components[i] = new Bag<Integer>();
		}

		for (int i = 0; i < graph.vertices(); i++) {
			components[cc.id(i)].push(i);
		}

		for (int i = 0; i < components.length; i++) {
			for (int v : components[i]) {
				StdOut.print(v + " ");
			}
			StdOut.println();
		}

	}
}
