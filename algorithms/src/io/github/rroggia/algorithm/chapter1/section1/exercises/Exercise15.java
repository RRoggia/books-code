package io.github.rroggia.algorithm.chapter1.section1.exercises;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Exercise15 {
	public static void main(String[] args) {
		int[] a = { 0,0,0, 3, 1 ,4 };
		StdOut.println(Arrays.toString(a));
		StdOut.println(Arrays.toString(histogram(a, 5)));		
	}
	
	public static int[] histogram( int[] a, int m ) {
		int[] histogram = new int[m];
		
		for (int i = 0; i < a.length; i++) {
			if( a[i] < m ) {
				histogram[ a[ i ] ] += 1;				
			}
		}
		
		return histogram;
	}
}
