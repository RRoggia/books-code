package io.github.rroggia.algorithm.chapter1.section3.exercises;

import java.util.List;

import edu.princeton.cs.algs4.Queue;
import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class Exercise4 {
	public static void main(String[] args) {
		var braces = new Stack<String>();
		var parentesis = new Stack<String>();
		var curlyBraces = new Stack<String>();
		
		new Queue<String>();

		List.of("[()]{}{[()()]()}".split("")).forEach(s -> {
			switch (s) {
			case "[": {
				braces.push(s);
				break;
			}
			case "(": {
				parentesis.push(s);
				break;
			}
			case "{": {
				curlyBraces.push(s);
				break;
			}
			case "]": {
				braces.pop();
				break;
			}
			case ")": {
				parentesis.pop();
				break;
			}
			case "}": {
				curlyBraces.pop();
				break;
			}
			}
		});
		if (braces.length() > 0 || parentesis.length() > 0 || curlyBraces.length() > 0) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}
