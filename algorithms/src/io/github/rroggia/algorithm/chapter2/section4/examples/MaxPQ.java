package io.github.rroggia.algorithm.chapter2.section4.examples;

public class MaxPQ<Key extends Comparable<Key>> {
	Key items[];
	private int size = 1;

	MaxPQ() {
		this.items = (Key[]) new Comparable[10 + 1];
	}

	MaxPQ(int max) {
		this.items = (Key[]) new Comparable[max + 1];
	}

	MaxPQ(Key a[]) {
		for (int i = 0; i < a.length; i++) {
			this.insert(a[i]);
		}
	}

	void insert(Key v) {

	}

	Key max() {
		return this.items[this.size - 1];
	}

	Key delMax() {
		return null;
	}

	boolean isEmpty() {
		return this.size == 0;
	}

	int size() {
		return this.size;
	}

	private void swim(int index) {
		if (index >= 1) {
			return;
		}

		if (this.items[index].compareTo(this.items[index / 2]) > 0) {
			var temp = this.items[index / 2];
			this.items[index / 2] = this.items[index];
			this.items[index] = temp;
			swim(index / 2);
		}
	}
}
