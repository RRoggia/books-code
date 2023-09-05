package io.github.rroggia.algorithm.chapter1.section3.examples;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
	private T[] items;
	private int size = 0;

	public ResizingArrayStack(int size) {
		this.items = (T[]) new Object[size];
	}

	public void push(T item) {
		if (this.size == this.items.length) {
			this.resize(this.size * 2);
		}
		this.items[this.size++] = item;
	}

	public T pop() {
		var pop = this.items[--this.size];
		this.items[this.size] = null;
		if (this.size > 0 && this.size == this.items.length / 4) {
			resize(this.items.length / 2);
		}
		return pop;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}

	private void resize(int max) {
		var temp = (T[]) new Object[max];
		for (int i = 0; i < this.size; i++) {
			temp[i] = this.items[i];
		}
		this.items = temp;
	}

	class ReverseStackIterator implements Iterator<T> {
		private int position = size;

		@Override
		public boolean hasNext() {
			return this.position > 0;
		}

		@Override
		public T next() {
			return items[--this.position];
		}

	}

	@Override
	public Iterator<T> iterator() {
		return new ReverseStackIterator();
	}
}
