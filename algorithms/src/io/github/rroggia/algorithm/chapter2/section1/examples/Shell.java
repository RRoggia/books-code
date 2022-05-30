package io.github.rroggia.algorithm.chapter2.section1.examples;

public class Shell {
	public static void sort(Comparable[] items) {
		int lenght = items.length;
		int incrementalSequence = 1;
		var count = 0;
		var swap = 0;

		while (incrementalSequence < lenght / 3) {
			incrementalSequence = 3 * incrementalSequence + 1;
		}

		while (incrementalSequence >= 1) {
			for (int i = incrementalSequence; i < items.length; i++) {
				count++;
				for (int j = i; j >= incrementalSequence
						&& items[j].compareTo(items[j - incrementalSequence]) < 0; j -= incrementalSequence) {
					count++;
					swap++;
					var temp = items[j - incrementalSequence];
					items[j - incrementalSequence] = items[j];
					items[j] = temp;
					continue;

				}
			}
			incrementalSequence = incrementalSequence / 3;
		}
		System.out.println("For: " + count);
		System.out.println("Swap: " + count);
	}
}
