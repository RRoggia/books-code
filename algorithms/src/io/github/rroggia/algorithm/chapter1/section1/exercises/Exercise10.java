package io.github.rroggia.algorithm.chapter1.section1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Exercise10 {
	public static void main(String[] args) {
		boolean[][] array = { { true, true, false }, { false, false, false, true } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if( array[ i ][ j ] ) {
					StdOut.print('*');
				}else {
					StdOut.print(' ');
				}
			}
			StdOut.println();
		}
	}
}
