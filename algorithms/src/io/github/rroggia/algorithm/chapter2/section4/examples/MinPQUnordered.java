package io.github.rroggia.algorithm.chapter2.section4.examples;

public class MinPQUnordered<Key extends Comparable<Key>> {
	Key items[];
	private int size = 0;

	MinPQUnordered() {
		this.items = (Key[]) new Comparable[10];
	}

	MinPQUnordered(int max) {
		this.items = (Key[]) new Comparable[max];
	}

	MinPQUnordered(Key a[]) {
		for (int i = 0; i < a.length; i++) {
			this.insert(a[i]);
		}
	}

	void insert(Key v) {
		this.items[size] = v;
		this.size++;
	}

	Key min() {
		return this.items[this.size - 1];
	}

	Key delMin() {
		var lowerIndex = 0;
		for (int i = 1; i < size; i++) {
			if (this.items[lowerIndex].compareTo(this.items[i]) > 0) {
				lowerIndex = i;
			}
		}
		var lowerKey = this.items[lowerIndex];
		this.size--;
		if (lowerIndex != size) {
			this.items[lowerIndex] = this.items[size];
		}
		this.items[size] = null;
		return lowerKey;
	}

	boolean isEmpty() {
		return this.size == 0;
	}

	int size() {
		return this.size;
	}

}
