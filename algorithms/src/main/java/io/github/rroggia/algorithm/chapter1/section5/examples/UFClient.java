package io.github.rroggia.algorithm.chapter1.section5.examples;

import java.util.function.Function;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class UFClient {
	public static void main(String[] args) {
		System.out.println("## Quick Find");
		runUf("Tiny", a -> new UFQuickFind(a));
		runUf("Medium", a -> new UFQuickFind(a));
//		runUf("Large", a -> new UFQuickFind(a)); //disabled because takes too much time

		System.out.println("## Quick Union");
		runUf("Tiny", a -> new UFQuickUnion(a));
		runUf("Medium", a -> new UFQuickUnion(a));
//		runUf("Large", a -> new UFQuickUnion(a)); //disabled because takes too much time

		System.out.println("## Weighted Quick Union");
		runUf("Tiny", a -> new UFWeightedQuickUnion(a));
		runUf("Medium", a -> new UFWeightedQuickUnion(a));
		runUf("Large", a -> new UFWeightedQuickUnion(a));
	}

	public static void runUf(String description, Function<Integer, ? extends UF> fun) {
		System.out.println(description);
		var stream = new In("./resources/" + description.toLowerCase() + "UF.txt");
		var ints = stream.readAllInts();
		Integer numberOfPairs = Integer.valueOf(ints[0]);

		var watch = new Stopwatch();
		var uf = fun.apply(numberOfPairs);
		for (int i = 1; i <= ints.length - 1; i += 2) {
			var p = ints[i];
			var q = ints[i + 1];
			if (uf.connected(p, q)) {
				continue;
			}
			uf.union(p, q);
		}
		System.out.println(uf.count() + " components");
		System.out.println(watch.elapsedTime());

	}
}
