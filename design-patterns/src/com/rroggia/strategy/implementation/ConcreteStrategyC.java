package com.rroggia.strategy.implementation;

public class ConcreteStrategyC implements Strategy {

	@Override
	public String toUpperCase(Context context) {
		return this.toUpperCase(context.getString());
	}

	@Override
	public String toUpperCase(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLowerCase(string.charAt(i))) {
				string = string.replace(string.charAt(i), Character.toUpperCase(string.charAt(i)));
			}
		}
		return string;
	}

}
