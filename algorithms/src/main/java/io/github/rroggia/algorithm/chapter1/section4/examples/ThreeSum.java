package io.github.rroggia.algorithm.chapter1.section4.examples;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSum {
	public static void main(String[] args) {
		var stop = new Stopwatch();
		var stream = new In("./resources/1Kints.txt");
		System.out.println(count(stream.readAllInts()));
		System.out.println(stop.elapsedTime());
		
		stop = new Stopwatch();
		var stream2 = new In("./resources/2Kints.txt");
		System.out.println(count(stream2.readAllInts()));
		System.out.println(stop.elapsedTime());
		
		stop = new Stopwatch();
		var stream4 = new In("./resources/4Kints.txt");
		System.out.println(count(stream4.readAllInts()));
		System.out.println(stop.elapsedTime());
		
		stop = new Stopwatch();
		var stream8 = new In("./resources/8Kints.txt");
		System.out.println(count(stream8.readAllInts()));
		System.out.println(stop.elapsedTime());
	}

	public static int count(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						count++;
					}
				}
			}

		}
		return count;
	}
}
