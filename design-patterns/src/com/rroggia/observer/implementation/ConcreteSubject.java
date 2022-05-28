package com.rroggia.observer.implementation;

public class ConcreteSubject extends Subject {
	private String state = "Valid";

	public void setState(String state) {
		System.out.println();
		System.out.println("change subject's state from " + this.state + " to " + state);
		System.out.println();
		this.state = state;
		this.notifyObservers();
	}

	public String getState() {
		return this.state;
	}

}
