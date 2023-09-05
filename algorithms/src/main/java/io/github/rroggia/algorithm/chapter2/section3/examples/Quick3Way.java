package io.github.rroggia.algorithm.chapter2.section3.examples;

import edu.princeton.cs.algs4.StdRandom;

public class Quick3Way {
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lower, int higher) {
		if(higher <= lower) {
			return;
		}
		
		int lowerThanPointer = lower;
		int higherThanPointer = higher;

		Comparable partitionKey = a[lower];
		for (int i = lower + 1; i <= higherThanPointer;) {
			if (partitionKey.compareTo(a[i]) > 0) {
				var temp = a[lowerThanPointer];
				a[lowerThanPointer] = a[i];
				a[i] = temp;
				lowerThanPointer++;
				i++;
			} else if (partitionKey.compareTo(a[i]) < 0) {
				var temp = a[higherThanPointer];
				a[higherThanPointer] = a[i];
				a[i] = temp;
				higherThanPointer--;
				//does'nt increment i 
			} else {
				i++;
			}
		}
		sort(a, lower, lowerThanPointer - 1);
		sort(a, higherThanPointer + 1, higher);
	}
}
