package io.github.rroggia.algorithm.chapter2.section2.examples;

public class BottomUpMerge {
	private static Comparable[] aux;
	public static int count = 0;
	public static int swap = 0;

	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];

		for (int size = 1; size < a.length; size *= 2) {
			System.out.println(size);
			for (int i = 0; i < a.length; i += size * 2) {
				int higher = (size * 2) - 1 + i;
				int mid = i + size - 1;
				System.out.println("merge(a, " + i + ", " + mid + ", " + higher + ")");
				merge(a, i, mid, higher);
			}
		}
	}

	private static void merge(Comparable[] a, int lower, int mid, int higher) {
		int leftPointer = lower;
		int rightPointer = mid + 1;

		for (int i = lower; i <= higher; i++) {
			aux[i] = a[i];
			count++;
		}

		for (int i = lower; i <= higher; i++) {
			swap++;
			count++;
			if (leftPointer > mid) {
				a[i] = aux[rightPointer];
				rightPointer++;
			} else if (rightPointer > higher) {
				a[i] = aux[leftPointer];
				leftPointer++;
			} else if (aux[leftPointer].compareTo(aux[rightPointer]) <= 0) {
				a[i] = aux[leftPointer];
				leftPointer++;
			} else {
				a[i] = aux[rightPointer];
				rightPointer++;
			}
		}
	}
}
