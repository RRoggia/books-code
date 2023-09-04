package io.github.rroggia.algorithm.chapter1.section3.exercises;

import java.util.List;

public class Exercise20 {
	public static void main(String[] args) {
		var x = new Exercise20();
		var stack = x.new Stack<String>();
		var stack2 = x.new Stack<String>();

		List.of("renan".split("")).forEach(s -> stack.addFirst(s));
		List.of("renan".split("")).forEach(s -> stack2.addLast(s));

		System.out.println(stack.getLast());
		System.out.println(stack2.getLast());
		System.out.println(stack.delete(3));
		System.out.println(stack2.delete(3));

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

		public T delete(int index) {
			var current = first;

			if (index == 0) {
				var item = first.item;
				first = first.next;
				return item;
			}

			T item = null;
			for (int i = 0; i < index; i++) {
				if (i + 1 == index) {
					item = current.next.item;
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}
			return item;
		}

		public T getLast() {
			return last.item;
		}
	}
}
