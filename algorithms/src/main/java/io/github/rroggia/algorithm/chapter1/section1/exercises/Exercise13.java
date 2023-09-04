package io.github.rroggia.algorithm.chapter1.section1.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
	public static void main(String[] args) {
		final int M = 10; // rows
		final int N = 20; // columns

		int[][] initialArray = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 } };

		printList(initialArray);
		int[][] newArray = new int[N][M];
		for (int row = 0; row < initialArray.length; row++) {
			for (int column = 0; column < initialArray[row].length; column++) {
				newArray[column][row] = initialArray[row][column];
			}
		}
		printList(newArray);

	}

	public static void printList(int[][] array) {
		StdOut.println(array.length);
		StdOut.println(array[0].length);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				StdOut.print(array[i][j]);
			}
			StdOut.println();
		}
		StdOut.println();
		StdOut.println();

	}
}
