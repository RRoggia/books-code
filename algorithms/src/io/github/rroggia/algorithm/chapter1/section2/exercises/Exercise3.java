package io.github.rroggia.algorithm.chapter1.section2.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise3 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[1]);
		int max = Integer.parseInt(args[2]);

		StdRandom.uniform(min, max);

		Interval2D[] intervals = new Interval2D[number];
		for (int i = 0; i < number; i++) {
			var first = StdRandom.uniform();
			var second = StdRandom.uniform();

			var third = StdRandom.uniform();
			var fourth = StdRandom.uniform();

			intervals[i] = new Interval2D(new Interval1D(Math.min(first, second), Math.max(first, second)),
					new Interval1D(Math.min(third, fourth), Math.max(third, fourth)));
		}
		for (int i = 0; i < intervals.length; i++) {
			var i1 = intervals[i];
			i1.draw();
			for (int j = i + 1; j < intervals.length; j++) {
				if (i1.intersects(intervals[j])) {
					StdOut.println(intervals[i] + " and " + intervals[j] + " intersects");
				}
			}
		}
	}
}
