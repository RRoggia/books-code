package io.github.rroggia.algorithm.chapter1.section2.examples;

import edu.princeton.cs.algs4.StdOut;

public class FlipsMax {
	public static void main(String[] args) {
		int flips = Integer.parseInt(args[0]);
		var heads = new Counter("heads");
		var tails = new Counter("tails");

		for (int i = 0; i < flips; i++) {
			if (Math.random() * 100 > 50) {
				heads.increment();
			} else {
				tails.increment();
			}
		}
		if( heads.tally() == tails.tally()) {
			StdOut.println("Tie!!");
		}else {
			StdOut.println(max( heads, tails) + " wins !!");
		}
	}
	
	public static Counter max(Counter x, Counter y){
		return x.tally() > y.tally() ? x : y;
	}
}
