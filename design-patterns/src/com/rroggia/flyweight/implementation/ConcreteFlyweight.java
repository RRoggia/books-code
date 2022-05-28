package com.rroggia.flyweight.implementation;

public class ConcreteFlyweight implements Flyweight {

	private String intrinsicContext;

	ConcreteFlyweight(String intrinsicContext) {
		this.intrinsicContext = intrinsicContext;
	}

	@Override
	public void operation(String extrinsicContext) {
		System.out.println(intrinsicContext + " " + extrinsicContext);
	}

	public String getIntrinsicContext() {
		return intrinsicContext;
	}

}
