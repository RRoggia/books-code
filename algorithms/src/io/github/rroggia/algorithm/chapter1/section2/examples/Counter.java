package io.github.rroggia.algorithm.chapter1.section2.examples;

public class Counter {
	
	private String name;
	private int counter = 0;

	public Counter(String name) {
		this.name = name;
	}
	
	void increment() {
		this.counter++;
	}
	
	int tally() {
		return this.counter;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", counter=" + counter + "]";
	}
}
