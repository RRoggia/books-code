package com.rroggia.bridge.implementation;

public class Abstraction {

	private Implementor implementation;

	public Abstraction(int number) {
		if (number < 10)
			implementation = new ConcreteImplementorA();
		else
			implementation = new ConcreteImplementorB();
	}

	public void operation() {
		implementation.primitiveOperationOne();
		implementation.primitiveOperationTwo();
	}

}
