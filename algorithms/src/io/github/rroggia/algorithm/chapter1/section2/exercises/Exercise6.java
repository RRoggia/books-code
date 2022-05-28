package io.github.rroggia.algorithm.chapter1.section2.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Exercise6 {
	public static void main(String[] args) {
		String s = "ACTGACG";
		String t = "TGACGAC";
		if (s.length() == t.length() && (s + s).contains(t)) {
			StdOut.print("Is equal");
		}else {
			StdOut.print("Is not equal");
		}
	}

}
