package com.rroggia.bridge.implementation;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void primitiveOperationOne() {
		System.out.println("primitive Operation One - Concrete Implementation A.");
	}

	@Override
	public void primitiveOperationTwo() {
		System.out.println("primitive Operation Two - Concrete Implementation A.");
	}
}
