package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
	private Node first;
	private Node last;
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

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int length() {
		return this.size;
	}

	public void enqueue(T item) {
		var oldLast = last;
		last = new Node(item);
		if (this.isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}

		this.size++;
	}

	public T dequeue() {
		this.size--;
		var temp = first;
		first = first.next;
		if (isEmpty()) {
			last = first;
		}
		return temp.item;
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
