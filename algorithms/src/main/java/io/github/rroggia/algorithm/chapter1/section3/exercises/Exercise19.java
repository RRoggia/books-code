package io.github.rroggia.algorithm.chapter1.section3.exercises;

import java.util.List;

public class Exercise19 {
	public static void main(String[] args) {
		var x = new Exercise19();
		var stack = x.new Stack<String>();
		var stack2 = x.new Stack<String>();

		List.of("renan".split("")).forEach(s -> stack.addFirst(s));
		List.of("renan".split("")).forEach(s -> stack2.addLast(s));

		System.out.println(stack.getLast());
		System.out.println(stack2.getLast());
		System.out.println(stack.removeLast());
		System.out.println(stack2.removeLast());

	}

	public class Stack<T> {
		private Node first;
		private Node last;

		private class Node {
			public T item;
			public Node next;
		}

		public void addFirst(T item) {
			var temp = first;

			var next = new Node();
			next.next = temp;
			next.item = item;
			first = next;

			if (last == null) {
				last = first;
			}
		}

		public void addLast(T item) {
			var newLast = new Node();
			newLast.item = item;

			if (last == null) {
				last = newLast;
				first = last;
			} else {
				var oldLast = last;
				oldLast.next = newLast;
				last = newLast;
			}
		}

		public T removeLast() {
			var item = last.item;
			if (first == last) {
				first = null;
				last = null;
				return item;
			}
			
			for (Node curr = first; curr != null; curr = curr.next) {
				if (curr.next == last) {
					curr.next = null;
				}
			}
			return item;
		}

		public T getLast() {
			return last.item;
		}
	}
}
