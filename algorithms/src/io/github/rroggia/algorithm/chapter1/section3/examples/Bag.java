package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
	private Node first;
	private int size;

	private class Node {
		T item;
		Node next;

		public Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
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

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	public class LinkedListIterator implements Iterator<T> {
		private Node position = first;

		@Override
		public boolean hasNext() {
			return position.next != null;
		}

		@Override
		public T next() {
			var item = position.item;
			position = position.next;
			return item;
		}

	}

}
