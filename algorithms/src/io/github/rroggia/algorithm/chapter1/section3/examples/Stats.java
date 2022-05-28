package io.github.rroggia.algorithm.chapter1.section3.examples;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;

public class Stats {
	public static void main(String[] args) {
		Bag<Double> bag = new Bag<>();

		for (int i = 0; i < args.length; i++) {
			bag.add(Double.parseDouble(args[i]));
		}
		
		int N = bag.size();

		double sum = 0;
		for (double item : bag) {
			sum += item;
		}

		double mean = sum / N;
		StdOut.printf("Mean is %.2f\n", mean);

		sum = 0.0;
		for (double item : bag) {
			sum += (item - mean) * (item - 2);
		}

		double std = Math.sqrt(sum / (N - 1));
		StdOut.printf("Standard Deviation is %.2f\n", std);
	}
}
