package io.github.rroggia.algorithm.chapter1.section2.examples;

public class BasicDate {
	private final int year;
	private final int month;
	private final int day;

	public BasicDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int year() {
		return year;
	}

	public int month() {
		return month;
	}

	public int day() {
		return day;
	}

	@Override
	public String toString() {
		return year + "/" + month + "/" + day;
	}

}
