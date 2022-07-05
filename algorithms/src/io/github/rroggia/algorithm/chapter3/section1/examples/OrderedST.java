package io.github.rroggia.algorithm.chapter3.section1.examples;

public interface OrderedST<Key extends Comparable<Key>, Value> extends ST<Key, Value> {
	Key min();

	Key max();

	Key floor(Key key);

	Key ceiling(Key key);

	int rank(Key key);

	Key select(int k);

	void deleteMin();

	void deleteMax();

	int size(Key lower, Key higher);

	Iterable<Key> keys(Key lower, Key higher);

}
