package io.github.rroggia.algorithm.chapter1.section4.examples;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class DoublingTest {
	public static void main(String[] args) {
		for (int i = 250; true; i += i) {
			double time = timeTrial(i);
			System.out.println("Time for iteration " + i + " is " + time);
		}
	}

	public static double timeTrial(int N) {
		var ints = new int[N];

		int MAX = 1000000;
		for (int i = 0; i < N; i++) {
			ints[i] = StdRandom.uniform(-MAX, MAX);
		}

		var stop = new Stopwatch();
		ThreeSum.count(ints);
		return stop.elapsedTime();

	}

}
