package io.github.rroggia.algorithm.chapter2.section1.examples;

public class Example {
	public static boolean isSorted(Comparable[] items) {
		var _isSorted = true;
		for (int i = 1; i < items.length; i++) {
			if (items[i].compareTo(items[i - 1]) < 0) {
				_isSorted = false;
			}
		}
		return _isSorted;
	}
}
