package io.github.rroggia.algorithm.chapter1.section2.examples;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {
	public static void main(String[] args) {
		int times = Integer.parseInt(args[0]);

		var acc = new Accumulator();
		for (int i = 0; i < times; i++) {
			acc.addDataValue(StdRandom.uniform());
		}
		StdOut.println(acc);
	}
}
