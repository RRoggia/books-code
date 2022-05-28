package com.rroggia.adapter;

import com.rroggia.adapter.implementation.Adaptee;
import com.rroggia.adapter.implementation.AdapterComposition;
import com.rroggia.adapter.implementation.AdapterInheritance;
import com.rroggia.adapter.implementation.Target;

public class Client {

	public static void main(String[] args) {
		System.out.println("AdapterComposition");
		Target apiExposedToClient = new AdapterComposition();
		apiExposedToClient.request();

		System.out.println();
		System.out.println("AdapterInheritance");
		AdapterInheritance adaptee = new AdapterInheritance();
		adaptee.specificRequest("AdapterInheritance (Subclass)");
		request(adaptee);

		apiExposedToClient = adaptee;
		apiExposedToClient.request();

	}

	public static void request(Adaptee adaptee) {
		adaptee.specificRequest("Adaptee (Superclass)");
	}
}
