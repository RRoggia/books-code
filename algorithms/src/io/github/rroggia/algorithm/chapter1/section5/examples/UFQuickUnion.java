package io.github.rroggia.algorithm.chapter1.section5.examples;

public class UFQuickUnion implements UF {
	private int components;
	private int[] id;

	public UFQuickUnion(int N) {
		this.components = N;
		this.id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		int pRoot = find(p);
		int qRoot = find(q);

		if (pRoot == qRoot) {
			return;
		}

		this.id[pRoot] = qRoot;
		this.components--;

	}

	public int find(int p) {
		while (p != id[p]) {
			p = id[p];
		}
		return p;
	}

	public boolean connected(int p, int q) {
		return this.find(p) == this.find(q);
	}

	public int count() {
		return this.components;
	}
}
