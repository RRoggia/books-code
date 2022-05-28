package io.github.rroggia.algorithm.chapter1.section1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Exercise03 {
	public static void main(String[] args) {
		if (args[0].equals(args[1]) && args[1].equals(args[2])) {
			StdOut.print("equal");
		} else {
			StdOut.print("not equal");
		}
	}
}
