package com.rroggia.adapter.implementation;

public class Adaptee {

	public void specificRequest(String parameter) {
		System.out.println("Adaptee.specificRequest() implementation called from " + parameter);
	}

}
