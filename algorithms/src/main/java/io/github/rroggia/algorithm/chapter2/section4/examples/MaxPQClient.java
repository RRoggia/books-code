package io.github.rroggia.algorithm.chapter2.section4.examples;

import java.util.Arrays;

public class MaxPQClient {
	public static void main(String[] args) {
		var maxPQ = new MaxPQ<String>();

		int count = 0;
		for (String word : "PQEXAMPLE".split("")) {
			count++;
			maxPQ.insert(word);
			System.out.println(Arrays.toString(maxPQ.items));
			if (count % 3 == 0) {
				System.out.println(maxPQ.delMax());
			}
		}
	}
}
