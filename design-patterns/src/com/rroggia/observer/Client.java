package com.rroggia.observer;

import com.rroggia.observer.implementation.AnotherConcreteObserver;
import com.rroggia.observer.implementation.ConcreteObserver;
import com.rroggia.observer.implementation.ConcreteSubject;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observerOne = new ConcreteObserver(subject);
		AnotherConcreteObserver observerTwo = new AnotherConcreteObserver(subject);

		observerOne.showState();
		observerTwo.showState();

		subject.setState("Invalid");

		observerOne.showState();
		observerTwo.showState();
	}

}
