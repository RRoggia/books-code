package io.github.rroggia.algorithm.chapter4.section1.examples;

public class DFSConnectedComponents implements ConnectedComponents {

	private boolean[] marked;
	private int[] id;
	private int count = 0;

	public DFSConnectedComponents(Graph graph) {
		this.marked = new boolean[graph.vertices()];
		this.id = new int[graph.vertices()];

		for (int i = 0; i < graph.vertices(); i++) {
			if (!marked[i]) {
				dfs(graph, i);
				this.count++;
			}
		}
	}

	private void dfs(Graph g, int s) {
		marked[s] = true;
		id[s] = count;

		for (Integer adj : g.adjacent(s)) {
			if (!marked[adj]) {
				dfs(g, adj);
			}
		}
	}

	@Override
	public boolean connected(int v, int w) {
		return id[v] == id[w];
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int id(int v) {
		return this.id[v];
	}

}
