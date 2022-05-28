package com.rroggia.builder.implementation;

public interface Builder {

	public Builder addPartOne(String partOne);

	public Builder addPartTwo(String partTwo);

	public Product getProduct();

}
