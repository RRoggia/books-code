package io.github.rroggia.algorithm.chapter4.section1.examples;

public interface Paths {
	boolean hasPathTo(int v);

	Iterable<Integer> pathTo(int v);
}
