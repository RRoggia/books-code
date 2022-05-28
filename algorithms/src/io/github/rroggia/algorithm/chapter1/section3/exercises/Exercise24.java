package io.github.rroggia.algorithm.chapter1.section3.exercises;

import java.util.List;

import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class Exercise24 {
	public static void main(String[] args) {
		var stack = new Stack<String>();
		List.of("renan".split("")).forEach(s -> stack.push(s));

		System.out.println(stack.removeAfter(stack.createNode("e")));
	}
}
