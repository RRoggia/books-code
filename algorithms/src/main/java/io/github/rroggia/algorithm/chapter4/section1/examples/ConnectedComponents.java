package io.github.rroggia.algorithm.chapter4.section1.examples;

public interface ConnectedComponents {
	boolean connected(int v, int w);

	int count();

	int id(int v);
}
