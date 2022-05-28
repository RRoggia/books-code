package com.rroggia.adapter.implementation;

public class AdapterInheritance extends Adaptee implements Target {

	@Override
	public void request() {
		this.specificRequest("Target (Interface)");

	}

	@Override
	public void specificRequest(String parameter) {
		// parameter = parameter.toUpperCase();
		super.specificRequest(parameter);
	}
}
