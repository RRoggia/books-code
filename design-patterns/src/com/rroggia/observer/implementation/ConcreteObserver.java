package com.rroggia.observer.implementation;

public class ConcreteObserver implements Observer {

	private String state;
	private ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject) {
		this.subject = subject;
		subject.attach(this);
		state = subject.getState();
	}

	@Override
	public void update() {
		state = subject.getState();
	}

	public void showState() {
		System.out.println("ConcreteObserver state is : " + this.state);
	}

}
