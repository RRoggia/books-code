package io.github.rroggia.algorithm.chapter4.section1.examples;

public class DepthFirstSearch implements Search {
	int source;
	boolean[] markedVertices;
	int count = 0;

	public DepthFirstSearch(Graph g, int s) {
		this.source = s;
		this.markedVertices = new boolean[g.vertices()];
		dfs(g, s);
	}

	private void dfs(Graph g, int vertex) {
		markedVertices[vertex] = true;
		count++;

		for (Integer adj : g.adjacent(vertex)) {
			if (!markedVertices[adj]) {
				dfs(g, adj);
			}
		}
	}

	@Override
	public boolean marked(int v) {
		return markedVertices[v];
	}

	@Override
	public int count() {
		return count;
	}

}
