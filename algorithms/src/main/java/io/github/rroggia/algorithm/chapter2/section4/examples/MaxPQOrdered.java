package io.github.rroggia.algorithm.chapter2.section4.examples;

public class MaxPQOrdered<Key extends Comparable<Key>> {
	Key items[];
	private int size = 0;

	MaxPQOrdered() {
		this.items = (Key[]) new Comparable[10];
	}

	MaxPQOrdered(int max) {
		this.items = (Key[]) new Comparable[max];
	}

	MaxPQOrdered(Key a[]) {
		for (int i = 0; i < a.length; i++) {
			this.insert(a[i]);
		}
	}

	void insert(Key v) {
		this.items[size] = v;

		for (int i = size - 1; i >= 0; i--) {
			if (v.compareTo(items[i]) < 0) {
				var temp = items[i];
				items[i] = v;
				items[i + 1] = temp;
			} else {
				break;
			}
		}

		this.size++;
	}

	Key max() {
		return this.items[this.size - 1];
	}

	Key delMax() {
		this.size--;
		var temp = this.items[this.size];
		this.items[this.size] = null;
		return temp;
	}

	boolean isEmpty() {
		return this.size == 0;
	}

	int size() {
		return this.size;
	}

}
