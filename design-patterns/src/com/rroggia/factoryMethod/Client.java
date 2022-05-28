package com.rroggia.factoryMethod;

import com.rroggia.factoryMethod.implementation.ConcreteCreator;
import com.rroggia.factoryMethod.implementation.Creator;

public class Client {

	public static void main(String[] args) {

		Creator creator = new ConcreteCreator();
		creator.anOperation();

	}

}
