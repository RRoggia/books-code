package com.rroggia.factoryMethod.implementation;

public class ConcreteCreator extends Creator {

	@Override
	protected Product createProduct() {
		return new ConcreteProduct();
	}

}
