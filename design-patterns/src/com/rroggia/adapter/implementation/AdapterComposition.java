package com.rroggia.adapter.implementation;

public class AdapterComposition implements Target {

	private Adaptee adaptee = new Adaptee();

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void request() {
		adaptee.specificRequest("Target (Interface)");
	}

}
