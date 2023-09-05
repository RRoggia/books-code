package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.List;

public class ResizingArrayStackClient {
	public static void main(String[] args) {
		var items = new ResizingArrayStack<String>(10);
		List.of("abcdefghij".split("")).forEach(s -> items.push(s));

		for (String item : items) {
			System.out.println(item);
		}

		var resizing = new ResizingArrayStack<String>(1);
		List.of("it was - the best - of times - - - it was - the - -".split(" ")).forEach(s -> {
			if ("-".equals(s)) {
				resizing.pop();
			} else {
				resizing.push(s);
			}
		});

		System.out.println("Exercise 8 - " + resizing.size());
		for(String s: resizing) {
			System.out.println(s);
		}
	}
}
