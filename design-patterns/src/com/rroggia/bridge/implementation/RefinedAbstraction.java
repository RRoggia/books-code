package com.rroggia.bridge.implementation;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(int number) {
		super(number);
	}

	@Override
	public void operation() {
		System.out.println("The refined Abstraction do more things");
		super.operation();
	}

	public void specificOperation() {
		System.out.println("Do something specific for the refined abstraction.");
	}
}
