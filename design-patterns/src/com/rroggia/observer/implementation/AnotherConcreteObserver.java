package com.rroggia.observer.implementation;

public class AnotherConcreteObserver implements Observer {

	private String state;
	private ConcreteSubject subject;

	public AnotherConcreteObserver(ConcreteSubject subject) {
		this.subject = subject;
		subject.attach(this);
		state = subject.getState();
	}

	@Override
	public void update() {
		state = subject.getState();
	}

	public void showState() {
		System.out.println("AnotherConcreteObserver state is : " + this.state);
	}

}
