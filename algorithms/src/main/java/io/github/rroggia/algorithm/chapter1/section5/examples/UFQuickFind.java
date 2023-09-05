package io.github.rroggia.algorithm.chapter1.section5.examples;

public class UFQuickFind implements UF {
	private int components;
	private int[] id;

	public UFQuickFind(int N) {
		this.components = N;
		this.id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		if (this.connected(p, q)) {
			return;
		}
		int pId = this.id[p];
		for (int i = 0; i < id.length; i++) {
			if (pId == this.id[i]) {
				this.id[i] = this.id[q];
			}
		}
		this.components--;
	}

	public int find(int p) {
		return this.id[p];
	}

	public boolean connected(int p, int q) {
		return this.find(p) == this.find(q);
	}

	public int count() {
		return this.components;
	}
}
