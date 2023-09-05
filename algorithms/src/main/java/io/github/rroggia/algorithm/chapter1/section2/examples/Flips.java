package io.github.rroggia.algorithm.chapter1.section2.examples;

import edu.princeton.cs.algs4.StdOut;

public class Flips {
	public static void main(String[] args) {
		int flips = Integer.parseInt(args[0]);
		var heads = new Counter("heads");
		var tails = new Counter("tails");

		for (int i = 0; i < flips; i++) {
			if (Math.random() * 100 > 50) {
				heads.increment();
			} else {
				tails.increment();
			}
		}
		StdOut.println(heads);
		StdOut.println(tails);
		StdOut.println("delta is " + Math.abs(heads.tally() - tails.tally()));

	}

}
