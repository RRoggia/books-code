package io.github.rroggia.algorithm.chapter1.section2.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise2 {
	public static void main(String[] args) {
		int iterations = Integer.parseInt(args[0]);

		Interval1D[] intervals = new Interval1D[iterations];
		for (int i = 0; i < iterations; i++) {
			var first = StdRandom.uniform();
			var second = StdRandom.uniform();

			intervals[i] = new Interval1D(Math.min(first, second), Math.max(first, second));
		}

		for (int i = 0; i < intervals.length; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (intervals[i].intersects(intervals[j])) {
					StdOut.println(intervals[i] + " and " + intervals[j] + "intersects");
				}
			}
		}
	}
}
