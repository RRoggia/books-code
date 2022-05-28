package com.rroggia.builder;

import com.rroggia.builder.implementation.Builder;
import com.rroggia.builder.implementation.ConcreteBuilder;
import com.rroggia.builder.implementation.Director;
import com.rroggia.builder.implementation.Product;

public class Client {

	public static void main(String[] args) {

		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.getProduct();

		System.out.println(product);
	}

}
