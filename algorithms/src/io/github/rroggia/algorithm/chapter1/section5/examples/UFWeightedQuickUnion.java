package io.github.rroggia.algorithm.chapter1.section5.examples;

public class UFWeightedQuickUnion implements UF {

	private int components;
	private int[] id;
	private int[] size;

	public UFWeightedQuickUnion(int N) {
		this.components = N;
		this.id = new int[N];
		this.size = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}

	public void union(int p, int q) {
		int pRoot = find(p);
		int qRoot = find(q);

		if (pRoot == qRoot) {
			return;
		}
		
		if (this.size[pRoot] >= this.size[qRoot]) {
			this.id[qRoot] = pRoot;
			this.size[pRoot] += this.size[qRoot];
		} else {
			this.id[pRoot] = qRoot;
			this.size[qRoot] += this.size[pRoot];
		}

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
