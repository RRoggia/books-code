package io.github.rroggia.algorithm.chapter2.section4.examples;

public class MaxPQ<Key extends Comparable<Key>> {
	Key items[]; // <Size, Key>
	private int size = 0;

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
		this.size++;
		items[size] = v;
		swim(this.size);
	}

	Key max() {
		return this.items[1];
	}

	Key delMax() {
		var max = this.items[1];
		this.items[1] = this.items[this.size];
		this.items[this.size] = null;
		this.size--;
		sink(1);
		return max;
	}

	boolean isEmpty() {
		return this.size == 0;
	}

	int size() {
		return this.size;
	}

	private void sink(int parentNodeIndex) {
		while (2 * parentNodeIndex <= this.size) {
			int childNodeIndex = 2 * parentNodeIndex;

			// determine which child node is the lower
			if (childNodeIndex < this.size
					&& this.items[childNodeIndex].compareTo(this.items[childNodeIndex + 1]) < 0) {
				childNodeIndex++;
			}

			if (this.items[childNodeIndex].compareTo(this.items[parentNodeIndex]) <= 0) {
				break;
			}

			var temp = this.items[parentNodeIndex];
			this.items[parentNodeIndex] = this.items[childNodeIndex];
			this.items[childNodeIndex] = temp;

			parentNodeIndex = childNodeIndex;
		}
	}

	private void swim(int childNodeIndex) {
		if (childNodeIndex <= 1) {
			return;
		}
		int parentNodeIndex = childNodeIndex / 2;

		if (this.items[childNodeIndex].compareTo(this.items[parentNodeIndex]) > 0) {
			var temp = this.items[parentNodeIndex];
			this.items[parentNodeIndex] = this.items[childNodeIndex];
			this.items[childNodeIndex] = temp;

			swim(parentNodeIndex);
		}
	}
}
