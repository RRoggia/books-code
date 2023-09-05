package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;

public class DijkstraEvaluation {
	public static void main(String[] args) {
		Stack<String> operations = new Stack<>();
		Stack<Double> values = new Stack<>();

		String stringToEvaluate = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )".replace(" ", "");
		for (int i = 0; i < stringToEvaluate.length(); i++) {
			char a = stringToEvaluate.charAt(i);

			switch (a) {
			case '(':
				continue;
			case '+':
			case '-':
			case '*':
			case '/':
				StdOut.println("adiciona na pilha de operacao:  " + a);
				operations.push(String.valueOf(a));
				continue;
			case ')':
				String lastOperation = operations.pop();
				StdOut.println("remove na pilha de operacoes " + lastOperation);
				double value = values.pop();
				StdOut.println("remove na pilha de valores " + value);
				switch (lastOperation) {
				case "+":
					value = values.pop() + value;
					StdOut.println("remove na pilha de valores e soma com valor, resultado " + value);
					StdOut.println("adiciona na pilha de valores" + value);
					values.push(value);
					continue;
				case "-":
					value = values.pop() - value;
					StdOut.println("remove na pilha de valores e subtrai com valor, resultado " + value);
					StdOut.println("adiciona na pilha de valores" + value);
					values.push(value);
					continue;
				case "*":
					value = values.pop() * value;
					StdOut.println("remove na pilha de valores e multiplica com valor, resultado " + value);
					StdOut.println("adiciona na pilha de valores" + value);
					values.push(value);
					continue;
				case "/":
					value = values.pop() + value;
					StdOut.println("remove na pilha de valores e divide com valor, resultado " + value);
					StdOut.println("adiciona na pilha de valores" + value);
					values.push(value);
					continue;
				}
			default:
				StdOut.println("adiciona na pilha de valores" + a);
				values.push(Double.parseDouble(String.valueOf(a)));
			}
		}
		StdOut.print(values.pop());
	}
}
