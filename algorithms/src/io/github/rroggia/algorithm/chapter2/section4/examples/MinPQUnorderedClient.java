package io.github.rroggia.algorithm.chapter2.section4.examples;

import java.util.Arrays;

public class MinPQUnorderedClient {
	public static void main(String[] args) {
		var array = new MinPQUnordered<String>(10);

		int count = 0;
		for (String word : "PQEXAMPLE".split("")) {
			count++;
			array.insert(word);
			System.out.println(Arrays.toString(array.items));
			if (count % 3 == 0) {
				System.out.println(array.delMin());
			}
		}
		System.out.println(Arrays.toString(array.items));
	}
}
