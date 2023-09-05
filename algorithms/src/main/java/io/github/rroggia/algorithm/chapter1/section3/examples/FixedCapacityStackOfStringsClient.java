package io.github.rroggia.algorithm.chapter1.section3.examples;

import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStringsClient {
	public static void main(String[] args) {
		var stack = new FixedCapacityStackOfStrings(args.length);

		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			if ("-".equals(s)) {
				StdOut.print(stack.pop() + " ");
			} else {
				stack.push(s);
			}
		}
		StdOut.println("(" + stack.size() + " left on stack)");
	}
}
