package com.rroggia.facade;

import com.rroggia.facade.implementation.Facade;

public class Client {

	public static void main(String[] args) {
		new Facade().doSomething(4);
	}
}
