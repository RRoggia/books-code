package io.github.rroggia.algorithm.chapter2.section4.examples;

public class IndexMinPQ<Item extends Comparable<Item>> {

	int treePosition[]; // <Size, Key>
	int keys[]; // <Key, Size>
	Item items[];
	private int size = 0;

	public IndexMinPQ(int maxN) {
		this.treePosition = new int[maxN];
		this.keys = new int[maxN];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = -1;
		}
		this.items = (Item[]) new Comparable[maxN];
	}

	void insert(int key, Item item) {
		if (contains(key)) {
			throw new RuntimeException("Key already in PriorityQueue");
		}

		if (size != treePosition.length - 1) {
			this.size++;
			items[key] = item;
			treePosition[size] = key; // value (item's index) in the tree position
			keys[key] = size; // three position of item's index
		}
		swim(this.size);
	}

	void change(int key, Item item) {
		if (!contains(key)) {
			throw new RuntimeException("Key not in PriorityQueue");
		}

		this.items[key] = item;

		swim(keys[key]);
		sink(keys[key]);
	}

	boolean contains(int key) {
		return this.keys[key] != -1;
	}

	void delete(int key) {
		if (!contains(key)) {
			throw new RuntimeException("Key not in PriorityQueue");
		}
		int keyPositionInTree = keys[key];
		int lastPositionInTree = this.size;

		int temp = treePosition[keyPositionInTree];
		treePosition[keyPositionInTree] = treePosition[lastPositionInTree];
		treePosition[lastPositionInTree] = temp;

		keys[treePosition[keyPositionInTree]] = keyPositionInTree;
		keys[treePosition[lastPositionInTree]] = lastPositionInTree;
		this.size--;

		swim(keyPositionInTree);
		sink(keyPositionInTree);

		items[key] = null;
		keys[key] = -1;
	}

	Item min() {
		return items[treePosition[1]];
	}

	int minIndex() {
		return treePosition[1];
	}

	int delMin() {
		var minIndex = treePosition[1];

		int keyPositionInTree = 1;
		int lastPositionInTree = this.size;

		int temp = treePosition[1];
		treePosition[keyPositionInTree] = treePosition[lastPositionInTree];
		treePosition[lastPositionInTree] = temp;

		keys[treePosition[keyPositionInTree]] = keyPositionInTree;
		keys[treePosition[lastPositionInTree]] = lastPositionInTree;
		this.size--;
		sink(1);

		items[treePosition[size + 1]] = null;
		keys[treePosition[size + 1]] = -1;

		return minIndex;
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
					&& this.items[treePosition[childNodeIndex]].compareTo(this.items[treePosition[childNodeIndex + 1]]) < 0) {
				childNodeIndex++;
			}

			if (this.items[treePosition[childNodeIndex]].compareTo(this.items[treePosition[parentNodeIndex]]) >= 0) {
				break;
			}

			var temp = this.treePosition[parentNodeIndex];
			this.treePosition[parentNodeIndex] = this.treePosition[childNodeIndex];
			this.treePosition[childNodeIndex] = temp;

			keys[treePosition[parentNodeIndex]] = parentNodeIndex;
			keys[treePosition[childNodeIndex]] = childNodeIndex;

			parentNodeIndex = childNodeIndex;
		}
	}

	private void swim(int childNodeIndex) {
		if (childNodeIndex <= 1) {
			return;
		}
		int parentNodeIndex = childNodeIndex / 2;

		if (this.items[treePosition[childNodeIndex]].compareTo(this.items[treePosition[parentNodeIndex]]) < 0) {
			var temp = this.treePosition[parentNodeIndex];
			this.treePosition[parentNodeIndex] = this.treePosition[childNodeIndex];
			this.treePosition[childNodeIndex] = temp;

			keys[treePosition[parentNodeIndex]] = parentNodeIndex;
			keys[treePosition[childNodeIndex]] = childNodeIndex;

			swim(parentNodeIndex);
		}
	}

}
