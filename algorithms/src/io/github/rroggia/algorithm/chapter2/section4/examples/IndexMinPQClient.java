package io.github.rroggia.algorithm.chapter2.section4.examples;

import java.util.Arrays;

public class IndexMinPQClient {
	public static void main(String[] args) {
		var minPQ = new IndexMinPQ<String>(15);
		int count = 0;
		for (String word : "INDEXMINPQEXAM".split("")) {
			count++;
			minPQ.insert(count, word);
			System.out.println(Arrays.toString(minPQ.treePosition));
			if (count % 3 == 0) {
				System.out.println(minPQ.min());
				System.out.println(minPQ.delMin());
			}
		}
	}

}
