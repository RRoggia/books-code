package com.rroggia.singleton;

import com.rroggia.singleton.implementation.Singleton;

public class Client {

	public static void main(String[] args) {

		System.out.print("Get Instance 1st time: ");
		System.out.println(Singleton.getInstance());

		System.out.print("Get Instance 2nd time: ");
		System.out.println(Singleton.getInstance());

		System.out.print("Is the instance the same? ");
		System.out.println(Singleton.getInstance() == Singleton.getInstance());

		System.out.print("Data: ");
		System.out.println(Singleton.getInstance().getData());

	}

}
