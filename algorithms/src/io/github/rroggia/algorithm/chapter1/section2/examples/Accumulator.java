package io.github.rroggia.algorithm.chapter1.section2.examples;

public class Accumulator {
	private double total;
	private int N;

	public void addDataValue(double value) {
		this.total += value;
		this.N++;
	}

	public double mean() {
		return total / N;
	}

	public String toString() {
		return "Mean (" + N + " values): " + String.format("%7.5f", mean());
	}

}
