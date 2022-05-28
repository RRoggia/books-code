package com.rroggia.flyweight;

import com.rroggia.flyweight.implementation.Flyweight;
import com.rroggia.flyweight.implementation.FlyweightFactory;

public class Client {
	public static void main(String[] args) {
		// 1. usage of package private does not allow the instantiation of a
		// ConcreteFlyweight. It enforces the usage of the factory. code below won't
		// compile
		// new ConcreteFlyweight();

		// 2. The factory contains a pool of objects, and only creates a new object in
		// case it does not exist.
		// Since the object instance is the same, you can use the "==" for comparison
		Flyweight flyweight = FlyweightFactory.getFlyweight("Hello");
		Flyweight flyweight1 = FlyweightFactory.getFlyweight("Hello");

		if (flyweight == flyweight1)
			System.out.println("They are equal, only one object was created.");

		// 3. A new object will be instantiated in case of a different key is sent to
		// the factory
		flyweight = FlyweightFactory.getFlyweight("Hello");
		flyweight1 = FlyweightFactory.getFlyweight("Hallo");

		if (flyweight != flyweight1)
			System.out.println("They are not equal, only another object was created.");

		// 4. The intrinsicContext will not change once the object was created, you
		// should inject the extrinsicContext through the interface parameters.
		flyweight = FlyweightFactory.getFlyweight("Hello");
		flyweight.operation("World!.");
		flyweight.operation("Darkness my old friend.");

	}
}
