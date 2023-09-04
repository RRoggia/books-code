package io.github.rroggia.algorithm.chapter1.section3.examples;

public class FixedCapacityStackOfStrings {

	private String[] strings;

	private int size = 0;

	public FixedCapacityStackOfStrings(int size) {
		this.strings = new String[size];
	}

	public void push(String item) {
		this.strings[this.size++] = item;
	}

	public String pop() {
		return this.strings[--size];
	}
	
	public boolean isFull() {
		return this.size == this.strings.length;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}
}
