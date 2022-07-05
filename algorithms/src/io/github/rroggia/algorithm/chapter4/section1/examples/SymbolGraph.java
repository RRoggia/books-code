package io.github.rroggia.algorithm.chapter4.section1.examples;

public interface SymbolGraph {
	boolean contains(String key);

	int index(String key);

	String name(int v);

	Graph getGraph();
}