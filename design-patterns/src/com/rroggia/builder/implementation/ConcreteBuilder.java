package com.rroggia.builder.implementation;

public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	@Override
	public Builder addPartOne(String partOne) {
		product.setPartOne(partOne);
		return this;
	}

	@Override
	public Builder addPartTwo(String partTwo) {
		product.setPartTwo(partTwo);
		return this;
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
