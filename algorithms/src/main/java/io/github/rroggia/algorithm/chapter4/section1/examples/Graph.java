package io.github.rroggia.algorithm.chapter4.section1.examples;

import edu.princeton.cs.algs4.In;
import io.github.rroggia.algorithm.chapter1.section3.examples.Bag;

public class Graph {
	private int vertices = 0;
	private int edges = 0;
	private Bag<Integer>[] adjacent;

	public Graph(int vertices) {
		this.vertices = vertices;
		this.adjacent = (Bag<Integer>[]) new Bag[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacent[i] = new Bag<Integer>();
		}
	}

	public Graph(In in) {

	}

	public int vertices() {
		return this.vertices;
	}

	public int edges() {
		return this.edges;
	}

	public void addEdge(int v, int w) {
		this.adjacent[v].push(w);
		this.adjacent[w].push(v);
		this.edges++;
	}

	public Iterable<Integer> adjacent(int v) {
		return this.adjacent[v];
	}

	public String toString() {
		String s = this.vertices + " vertices, " + this.edges + " edges\n";
		for (int v = 0; v < this.vertices; v++) {
			s += v + ": ";
			for (int w : this.adjacent(v))
				s += w + " ";
			s += "\n";
		}
		return s;
	}
}
