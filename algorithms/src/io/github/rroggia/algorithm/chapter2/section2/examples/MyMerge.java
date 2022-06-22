package io.github.rroggia.algorithm.chapter2.section2.examples;

import io.github.rroggia.algorithm.chapter2.section1.examples.Example;

public class MyMerge {
	public static int count = 0;
	public static int swap = 0;

	public static void sort(Comparable[] items) {
		if (items.length == 1) {
			return;
		} else if (items.length == 2) {
			if (items[0].compareTo(items[1]) > 0) {
				var temp = items[0];
				items[0] = items[1];
				items[1] = temp;
				swap++;
			}
			return;
		}
		int size = items.length / 2;
		int oddRemainder = items.length % 2;
		var left = new Comparable[size];
		var right = new Comparable[size + oddRemainder];
		for (int i = 0; i < items.length; i++) {
			count++;
			if (i < size) {
				left[i] = items[i];
			} else {
				right[i - size] = items[i];
			}
		}
		sort(left);
		sort(right);

		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = 0; i < items.length; i++) {
			count++;
			if (leftIndex >= left.length) {
				swap++;
				items[i] = right[rightIndex];
				rightIndex++;
				continue;
			} else if (rightIndex >= right.length) {
				swap++;
				items[i] = left[leftIndex];
				leftIndex++;
				continue;
			}

			if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
				swap++;
				items[i] = left[leftIndex];
				leftIndex++;
			} else {
				swap++;
				items[i] = right[rightIndex];
				rightIndex++;
			}

		}

	}

	public static void main(String[] args) {
		var array = "imagineumtextomuitograndeemaiiordoquevocepoderiaescreverparatestarmosquyantoscountsseraoexcecuytadfisoaacadaalgoritmo"
				.split("");
		System.out.println("N: " + array.length);
		System.out.println("N²: " + array.length * array.length);
		System.out.println("N²/2: " + array.length * array.length / 2);
		System.out.println("log N:" + (int) Math.log(array.length) / Math.log(2));
		System.out.println("N * log N:" + (int) (array.length * (Math.log(array.length / Math.log(2)))));

		sort(array);
		System.out.println("Is sorted? " + Example.isSorted(array));
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("For: " + count);
		System.out.println("Swap: " + swap);
	}
}
