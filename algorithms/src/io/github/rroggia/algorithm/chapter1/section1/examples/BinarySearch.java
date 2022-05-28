package io.github.rroggia.algorithm.chapter1.section1.examples;

public class BinarySearch {
	public static int rank(int key, int[] items) {
		int lower = 0;
		int higher = items.length - 1;

		while (lower <= higher) {
			int mid = lower + (higher - lower) / 2;
			if (key < items[mid]) {
				higher = mid - 1;
			} else if (key > items[mid]) {
				lower = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
