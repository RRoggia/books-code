package io.github.rroggia.algorithm.chapter1.section2.examples;

public class SmallDate {
	private final int value;

	public SmallDate(int year, int month, int day) {
		this.value = year * 512 + month * 32 + day;
	}

	public int month() {
		return (value / 32) % 16;
	}

	public int day() {
		return (value % 32);
	}

	public int year() {
		return (value / 512);
	}

}
