package io.github.rroggia.algorithm.chapter2.section4.examples;

public class IndexMinPQ<Item extends Comparable<Item>> {

	int keys[];
	Item items[];
	private int size = 0;

	public IndexMinPQ(int maxN) {
		this.keys = new int[maxN];
		this.items = (Item[]) new Comparable[maxN];
	}

	void insert(int k, Item item) {
		this.size++;
		items[k] = item;
		keys[size] = k;
		swim(this.size);
	}

	void change(int k, Item item) {
		this.items[k] = item;
	}

	boolean contains(int k) {
		return this.items[k] != null;
	}

	void delete(int k) {

	}

	Item min() {
		return items[keys[1]];
	}

	int minIndex() {
		return 0;
	}

	int delMin() {
		return 0;
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

		if (this.items[keys[childNodeIndex]].compareTo(this.items[keys[parentNodeIndex]]) > 0) {
			var temp = this.keys[parentNodeIndex];
			this.keys[parentNodeIndex] = this.keys[childNodeIndex];
			this.keys[childNodeIndex] = temp;

			swim(parentNodeIndex);
		}
	}

}
