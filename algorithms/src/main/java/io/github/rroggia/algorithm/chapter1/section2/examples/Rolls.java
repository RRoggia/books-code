package io.github.rroggia.algorithm.chapter1.section2.examples;

import java.util.Random;

import edu.princeton.cs.algs4.StdOut;

public class Rolls {
	public static void main(String[] args) {
		int numberOfRolls = Integer.parseInt(args[0]);
		int SIDES = 6;
		Counter[] rolls = new Counter[SIDES + 1];
		var random = new Random();

		for (int i = 1; i <= SIDES; i++) {
			rolls[i] = new Counter("Side " + i);
		}

		for (int i = 0; i < numberOfRolls; i++) {
			var number = random.nextInt(SIDES) + 1;
			rolls[number].increment();
		}

		for (int i = 1; i <= SIDES; i++) {
			StdOut.println(rolls[i]);
		}
	}
}
