package com.rroggia.builder.implementation;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		constructPartOne("One");
		constructPartTwo("Two");
	}

	public void constructPartOne(String partOne) {
		builder.addPartOne(partOne);
	}

	public void constructPartTwo(String partTwo) {
		builder.addPartTwo(partTwo);
	}

}
