package io.github.rroggia.algorithm.chapter2.section1.examples;

public class Selection {
	public static void sort(Comparable[] items) {
		var count = 0;
		var swap = 0;
		for (int i = 0; i < items.length; i++) {
			count++;
			int smallestIndex = i;
			for (int j = i + 1; j < items.length; j++) {
				count++;
				if (items[smallestIndex].compareTo(items[j]) > 0) {
					smallestIndex = j;
				}
			}
			if (smallestIndex == i) {
				continue;
			} else {
				swap++;
				var temp = items[i];
				items[i] = items[smallestIndex];
				items[smallestIndex] = temp;
			}
		}
		System.out.println("For: " + count);
		System.out.println("Swap: " + swap);
	}
}
