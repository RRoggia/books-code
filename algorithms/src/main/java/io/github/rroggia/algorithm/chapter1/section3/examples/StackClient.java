package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.List;

public class StackClient {
	public static void main(String[] args) {
		var stack = new Stack<String>();
		var letters = "abcdefghij".split("");
		List.of(letters).forEach(s -> stack.push(s));
		System.out.println(stack.peek());

		System.out.println(stack.isEmpty());
		System.out.println(stack.length());

		for (String s : stack) {
			System.out.println(s);
		}

		for (int i = 0; i < letters.length; i++) {
			System.out.println(stack.pop());
		}

		System.out.println(stack.isEmpty());
		System.out.println(stack.length());

		var secondStack = new Stack<String>();
		var words = "it was - the best - of times - - - it was - the - -".split(" ");
		List.of(words).forEach(s -> {
			if ("-".equals(s)) {
				System.out.println(secondStack.pop());
			} else {
				secondStack.push(s);
			}
		});

	}
}
