package io.github.rroggia.algorithm.chapter1.section3.exercises;

import io.github.rroggia.algorithm.chapter1.section3.examples.Stack;

public class Exercise9 {
	public static void main(String[] args) {
		var expression = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";

		var operands = new Stack<String>();
		var operators = new Stack<String>();

		for (String s : expression.split(" ")) {
			if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {
				operators.push(s);
			} else if (")".equals(s)) {
				var rightOperand = operands.pop();
				var leftOperand = operands.pop();
				operands.push("( " + leftOperand + " " + operators.pop() + " " + rightOperand + " )");
			} else {
				operands.push(s);
			}
		}
		System.out.println(operands.pop());

	}
}
