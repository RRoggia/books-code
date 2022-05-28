package io.github.rroggia.algorithm.chapter2.section1.examples;

public class Insertion {
	public static void sort(Comparable[] items) {
		var count = 0;
		var swap = 0;
		for (int i = 1; i < items.length; i++) {
			count++;
			for (int j = i; j > 0 && items[j].compareTo(items[j - 1]) < 0; j--) {
				count++;
				swap++;
				var temp = items[j - 1];
				items[j - 1] = items[j];
				items[j] = temp;
				continue;

			}
		}
		System.out.println("For: " + count);
		System.out.println("Swap: " + count);
	}
}
