package io.github.rroggia.algorithm.chapter2.section4.examples;

import java.util.Arrays;

public class HeapSort {
	public static int count;
	public static int swap;

	public static void sort(Comparable[] a) {
		int size = a.length;
		for (int i = size / 2; i >= 1; i--) {
			count++;
			HeapSort.sink(a, i, size);
		}

		System.out.println(Arrays.toString(a));
		while (size > 1) {
			count++;
			swap++;
			var temp = a[0];
			a[0] = a[size - 1];
			a[size - 1] = temp;
			size--;
			sink(a, 1, size);
		}
	}

	public static void sink(Comparable[] a, int index, int size) {
		int parentIndex = index;
		while (parentIndex * 2 <= size) {
			count++;
			int firstChildrenIndex = parentIndex * 2;
			int secondChildrenIndex = firstChildrenIndex + 1;

			int higherChildrenIndex = firstChildrenIndex;

			if (firstChildrenIndex < size && a[firstChildrenIndex - 1].compareTo(a[secondChildrenIndex - 1]) < 0) {
				higherChildrenIndex = secondChildrenIndex;
			}

			if (a[higherChildrenIndex - 1].compareTo(a[parentIndex - 1]) < 0) {
				break;
			}
			swap++;
			var temp = a[higherChildrenIndex - 1];
			a[higherChildrenIndex - 1] = a[parentIndex - 1];
			a[parentIndex - 1] = temp;
			parentIndex = higherChildrenIndex;

		}
	}
}
