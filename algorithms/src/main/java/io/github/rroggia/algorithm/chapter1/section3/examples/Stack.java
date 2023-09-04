package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
	private Node first;
	private int size;

	private class Node {
		T item;
		Node next;

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}

		public Node(T item) {
			this(item, null);
		}
	}

	// shouldnt exist. only create for exercise 24
	public Node createNode(T item) {
		return new Node(item);
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int length() {
		return this.size;
	}

	public void push(T item) {
		this.size++;
		first = new Node(item, first);
	}

	public T pop() {
		this.size--;
		var temp = first;
		first = first.next;
		return temp.item;
	}

	public T peek() {
		return first.item;
	}

	public boolean find(T item) {
		for (T t : this) {
			if (t.equals(item)) {
				return true;
			}
		}
		return false;
	}

	public T removeAfter(Node node) {
		if (node == null) {
			return null;
		}
		for (var current = first; current != null; current = current.next) {
			if (node.item.equals(current.item) && current.next != null) {
				var item = current.next.item;
				current.next = current.next.next;
				return item;
			}
		}
		return null;
	}

	public void insertAfter(Node node, Node nodeToInsert) {
		if (node == null || nodeToInsert == null) {
			return;
		}

		for (var current = first; current != null; current = current.next) {
			if (node.item.equals(current.item)) {
				var temp = current.next;
				current.next = nodeToInsert;
				nodeToInsert.next = temp;
				break;
			}
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	public class LinkedListIterator implements Iterator<T> {
		private Node position = first;

		@Override
		public boolean hasNext() {
			return position != null;
		}

		@Override
		public T next() {
			var item = position.item;
			position = position.next;
			return item;
		}

	}

}
