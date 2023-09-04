package io.github.rroggia.algorithm.chapter1.section1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
	public static void main(String[] args) {
		StdOut.println(lg(10));
	}

	public static int lg(int n) {
		int logInt = 0;

		while (n > 0) {
			logInt++;

			n /= 2;
		}

		return logInt - 1;
	}
}
