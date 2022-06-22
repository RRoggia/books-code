package io.github.rroggia.algorithm.chapter2.section3.examples;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;

public class Quick {

	public static int count = 0;
	public static int swap = 0;

	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lower, int higher) {
		if (higher <= lower) {
			return;
		}
		int mid = partition(a, lower, higher);
		sort(a, lower, mid - 1);
		sort(a, mid + 1, higher);
	}

	private static int partition(Comparable[] a, int lower, int higher) {
		var toBeSorted = a[lower];
		int left = lower;
		int right = higher;

		for (; left < right;) {
			count++;
			for (left++; left <= right; left++) {
				count++;
				if (toBeSorted.compareTo(a[left]) < 0) {
					break;
				}
			}
			for (; right >= left; right--) {
				count++;
				if (toBeSorted.compareTo(a[right]) >= 0) {
					break;
				}
			}
			if (left >= right) {
				break;
			}
			swap++;
			var temp = a[left];
			a[left] = a[right];
			a[right] = temp;
		}
		swap++;
		var temp = a[lower];
		a[lower] = a[right];
		a[right] = temp;
		return right;
	}

}
