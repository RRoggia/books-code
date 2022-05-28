package com.rroggia.observer.implementation;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {

	private Set<Observer> observers = new HashSet<>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
