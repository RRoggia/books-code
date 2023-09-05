package io.github.rroggia.algorithm.chapter1.section3.examples;

public class FixedCapacityStack<T> {
	private T[] items;

	private int size = 0;

	public FixedCapacityStack(int size) {
		this.items = (T[]) new Object[size];
	}

	public void push(T item) {
		this.items[this.size++] = item;
	}

	public T pop() {
		return this.items[--size];
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}

}
