package com.rroggia.strategy.implementation;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public String toUpperCase() {
		return strategy.toUpperCase(this);
	}

	public String getString() {
		return "another string";
	}

}
