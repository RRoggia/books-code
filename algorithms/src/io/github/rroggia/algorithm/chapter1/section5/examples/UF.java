package io.github.rroggia.algorithm.chapter1.section5.examples;

public interface UF {
	int find(int p);

	boolean connected(int p, int q);

	int count();

	void union(int p, int q);
}
