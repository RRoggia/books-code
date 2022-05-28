package com.rroggia.singleton.implementation;

public class Singleton {

	private static Singleton INSTANCE = null;

	private final String data = "Same Data";

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Singleton();

		return INSTANCE;
	}

	public String getData() {
		return this.data;
	}

}
