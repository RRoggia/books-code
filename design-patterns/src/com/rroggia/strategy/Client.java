package com.rroggia.strategy;

import com.rroggia.strategy.implementation.ConcreteStrategyA;
import com.rroggia.strategy.implementation.ConcreteStrategyB;
import com.rroggia.strategy.implementation.ConcreteStrategyC;
import com.rroggia.strategy.implementation.Context;

public class Client {

	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrategyA());
		System.out.println(context.toUpperCase());

		context = new Context(new ConcreteStrategyB());
		System.out.println(context.toUpperCase());

		context = new Context(new ConcreteStrategyC());
		System.out.println(context.toUpperCase());
	}

}
