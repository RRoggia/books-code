package io.github.rroggia.algorithm.chapter4.section1.examples;

import io.github.rroggia.algorithm.chapter1.section3.examples.Queue;
import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class BreadthFirstPaths implements Paths {
	private int source;
	private boolean[] marked;
	public int[] edgeTo;

	public BreadthFirstPaths(Graph graph, int source) {
		this.source = source;
		this.marked = new boolean[graph.vertices()];
		this.edgeTo = new int[graph.vertices()];
		bfs(graph, source);
	}

	private void bfs(Graph g, int vertex) {
		Queue<Integer> queue = new Queue<>();
		marked[vertex] = true;
		queue.enqueue(vertex);

		while (!queue.isEmpty()) {
			int parent = queue.dequeue();
			for (int adj : g.adjacent(parent)) {
				if (!marked[adj]) {
					queue.enqueue(adj);
					marked[adj] = true;
					edgeTo[adj] = parent;
				}
			}
		}
	}

	@Override
	public boolean hasPathTo(int v) {
		return marked[v];
	}

	@Override
	public Iterable<Integer> pathTo(int v) {
		if (!hasPathTo(v)) {
			return null;
		}
		Stack<Integer> path = new Stack<Integer>();
		for (int x = v; x != this.source; x = this.edgeTo[x]) {
			path.push(x);
		}
		path.push(this.source);
		return path;

	}

}
