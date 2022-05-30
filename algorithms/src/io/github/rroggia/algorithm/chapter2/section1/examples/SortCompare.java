package io.github.rroggia.algorithm.chapter2.section1.examples;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
	public static void main(String[] args) {
		var alg1 = "shell";
		var alg2 = "insertion";

		var arraySize = 1000;
		var times = 1000;
		var t1 = timeRandomInput(alg1, arraySize, times);
		var t2 = timeRandomInput(alg2, arraySize, times);

		StdOut.printf("For %d random Doubles\n", arraySize);
		if (t1 < t2) {
			StdOut.printf("%s is %.1f times faster than %s\n", alg1, t2 / t1, alg2);
		}else {
			StdOut.printf("%s is %.1f times faster than %s\n", alg2, t1 / t2, alg1);
		}
	}

	public static double timeRandomInput(String alg, int arraySize, int times) {
		double total = 0.0;
		Double[] array = new Double[arraySize];
		for (int t = 0; t < times; t++) {
			for (int i = 0; i < arraySize; i++) {
				array[i] = StdRandom.uniform();
			}
			total += time(alg, array);
		}
		return total;
	}

	public static double time(String alg, Double[] a) {
		Stopwatch stopwatch = new Stopwatch();
		switch (alg.toLowerCase()) {
		case "insertion":
			Insertion.sort(a);
			break;
		case "selection":
			Selection.sort(a);
			break;
		case "shell":
			Shell.sort(a);
			break;
		}
		return stopwatch.elapsedTime();
	}

}
