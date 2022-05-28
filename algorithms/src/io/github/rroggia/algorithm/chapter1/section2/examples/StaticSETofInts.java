package io.github.rroggia.algorithm.chapter1.section2.examples;

import java.util.Arrays;

public class StaticSETofInts {

	private int[] keys;

	public StaticSETofInts(int[] keys) {
		this.keys = new int[keys.length];
		for (int i = 0; i < keys.length; i++) {
			this.keys[i] = keys[i];
		}
		Arrays.sort(this.keys);
	}

	public boolean contains(int key) {
		return this.rank(key) >= 0;
	}

	private int rank(int key) {
		int lower = 0;
		int higher = this.keys.length - 1;

		while (lower <= higher) {
			int mid = lower + (higher - lower) / 2;
			if (this.keys[mid] > key) {
				higher = mid - 1;
			} else if (this.keys[mid] < key) {
				lower = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
