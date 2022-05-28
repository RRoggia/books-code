package com.rroggia.strategy.implementation;

public class ConcreteStrategyA implements Strategy {

	@Override
	public String toUpperCase(Context context) {
		return toUpperCase(context.getString());
	}

	@Override
	public String toUpperCase(String string) {
		return string.toUpperCase();
	}

}
