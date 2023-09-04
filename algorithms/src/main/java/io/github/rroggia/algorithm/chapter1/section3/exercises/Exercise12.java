package io.github.rroggia.algorithm.chapter1.section3.exercises;

import java.util.List;

import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class Exercise12 {
	public static void main(String[] args) {
		var stack = new Stack<String>();
		List.of("renan".split("")).forEach(s -> stack.push(s));
		var copyOfStack = copy(stack);

		System.out.println(copyOfStack.peek());
		System.out.println(stack.peek());
	}

	public static Stack<String> copy(Stack<String> stack) {
		var copy = new Stack<String>();
		for (var item : stack) {
			copy.push(item);
		}
		return copy;
	}
}
