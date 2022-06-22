package io.github.rroggia.algorithm.chapter2.section2.examples;

public class Merge {
	private static Comparable[] aux;
	public static int count = 0;
	public static int swap = 0;

	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lower, int higher) {
		if (higher <= lower) {
			return;
		}

		int mid = lower + (higher - lower) / 2;

		sort(a, lower, mid);
		sort(a, mid + 1, higher);

		merge(a, lower, mid, higher);
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
			}else if (aux[leftPointer].compareTo(aux[rightPointer]) <= 0) {
				a[i] = aux[leftPointer];
				leftPointer++;
			} else {
				a[i] = aux[rightPointer];
				rightPointer++;
			}
		}
	}
}
