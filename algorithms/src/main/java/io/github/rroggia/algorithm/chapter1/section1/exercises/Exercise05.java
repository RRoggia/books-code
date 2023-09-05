package io.github.rroggia.algorithm.chapter1.section1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Exercise05 {
	public static void main(String[] args) {
		double x = 0.30;
		double y = 1.01;
		
		if( ( x >= 0.0 && x <= 1.0 ) && ( y >= 0.0 && y <= 1.0) ) {
			StdOut.print(true);
		} else {
			StdOut.print(false);
		}
	}
}
