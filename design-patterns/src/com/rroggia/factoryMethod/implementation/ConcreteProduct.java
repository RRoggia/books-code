package com.rroggia.factoryMethod.implementation;

public class ConcreteProduct implements Product {

	public void operation1() {
		System.out.println("ConcreteProduct operation 1.");
	}

	@Override
	public void operation2() {
		System.out.println("ConcreteProduct operation 2.");
	}

}
