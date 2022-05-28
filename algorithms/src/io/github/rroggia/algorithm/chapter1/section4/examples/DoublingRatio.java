package io.github.rroggia.algorithm.chapter1.section4.examples;

public class DoublingRatio {
	public static void main(String[] args) {

		double prev = DoublingTest.timeTrial(125);
		System.out.printf("%6d %7.1f ", 125, prev);
		System.out.println();

		for (int i = 250; true; i += i) {
			double time = DoublingTest.timeTrial(i);
			System.out.printf("%6d %7.1f ", i, time);
			System.out.printf("%5.1f\n", time / prev);
			prev = time;
		}
	}
}
