package com.rroggia.bridge.implementation;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void primitiveOperationOne() {
		System.out.println("primitive Operation One - Concrete Implementation B.");
	}

	@Override
	public void primitiveOperationTwo() {
		System.out.println("primitive Operation Two - Concrete Implementation B.");
	}

}
