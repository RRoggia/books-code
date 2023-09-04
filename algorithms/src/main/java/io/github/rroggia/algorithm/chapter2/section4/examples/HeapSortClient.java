package io.github.rroggia.algorithm.chapter2.section4.examples;

import io.github.rroggia.algorithm.chapter2.section1.examples.Example;

public class HeapSortClient {
	public static void main(String[] args) {
		var array = "imagineumtextomuitograndeemaiiordoquevocepoderiaescreverparatestarmosquyantoscountsseraoexcecuytadfisoaacadaalgoritmo"
				// var array = "SORTEXAMPLE"
				.split("");
		System.out.println("N: " + array.length);
		System.out.println("N²: " + array.length * array.length);
		System.out.println("N²/2: " + array.length * array.length / 2);
		System.out.println("log N:" + (int) Math.log(array.length) / Math.log(2));
		System.out.println("N * log N:" + (int) (array.length * (Math.log(array.length / Math.log(2)))));

		HeapSort.sort(array);
		System.out.println("Is sorted? " + Example.isSorted(array));
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("For: " + HeapSort.count);
		System.out.println("Swap: " + HeapSort.swap);
	}
}
