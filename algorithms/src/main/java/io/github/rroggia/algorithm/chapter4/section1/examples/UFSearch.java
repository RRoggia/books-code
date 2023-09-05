package io.github.rroggia.algorithm.chapter4.section1.examples;

import io.github.rroggia.algorithm.chapter1.section5.examples.UFWeightedQuickUnion;

public class UFSearch implements Search {
	private UFWeightedQuickUnion uf;
	private Integer source;

	UFSearch(Graph g, int s) {
		this.uf = new UFWeightedQuickUnion(g.vertices());
		this.source = s;

		for (int i = 0; i < g.vertices(); i++) {
			var adjs = g.adjacent(i);
			for (Integer adj : adjs) {
				if (!uf.connected(adj, s)) {
					uf.union(i, adj);
				}
			}
		}
	}

	public boolean marked(int v) {
		return uf.connected(source, v);
	}

	public int count() {
		return 0; // missing implementation
	}
}
