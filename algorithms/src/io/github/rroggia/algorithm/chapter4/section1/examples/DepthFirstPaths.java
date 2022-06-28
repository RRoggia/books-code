package io.github.rroggia.algorithm.chapter4.section1.examples;

import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class DepthFirstPaths implements Paths {

	private int source;
	private boolean[] marked;
	private int[] edgeTo;

	public DepthFirstPaths(Graph g, int s) {
		marked = new boolean[g.vertices()];
		edgeTo = new int[g.vertices()];
		this.source = s;
		dfs(g, s);
	}

	private void dfs(Graph g, int s) {
		marked[s] = true;

		for (Integer adj : g.adjacent(s)) {
			if (!marked[adj]) {
				edgeTo[adj] = s;
				dfs(g, adj);
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
