package io.github.rroggia.algorithm.chapter1.section3.exercises;

import java.util.List;

import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class Exercise25 {
	public static void main(String[] args) {
		var stack = new Stack<String>();
		List.of("renan".split("")).forEach(s -> stack.push(s));
		
		for (String s : stack) {
			System.out.print(s);
		}

		stack.insertAfter(stack.createNode("e"), stack.createNode("g"));
		System.out.println();
		for (String s : stack) {
			System.out.print(s);
		}
	}
}
