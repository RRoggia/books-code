package com.rroggia.flyweight.implementation;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static Map<String, Flyweight> flyweights = new HashMap<>();

	public static Flyweight getFlyweight(String key) {
		Flyweight flyweight = null;

		if (flyweights.containsKey(key)) {
			flyweight = flyweights.get(key);
		} else {
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}

}
