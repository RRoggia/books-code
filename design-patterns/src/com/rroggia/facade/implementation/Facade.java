package com.rroggia.facade.implementation;

public class Facade {

	public void doSomething(int value) {
		new SubsystemClassA().doSomething(2 * value);
		new SubSystemClassB().doAnotherThing(new Float(value));
	}

}
