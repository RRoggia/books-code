package com.rroggia.strategy.implementation;

public class ConcreteStrategyB implements Strategy {

	@Override
	public String toUpperCase(Context context) {
		String string = context.getString();
		return toUpperCase(string);
	}

	@Override
	public String toUpperCase(String string) {
		String upperCase = "";
		for (char letter : string.toCharArray()) {
			upperCase += Character.toUpperCase(letter);
		}

		return upperCase;
	}

}
