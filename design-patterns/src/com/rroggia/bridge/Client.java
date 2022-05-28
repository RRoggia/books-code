package com.rroggia.bridge;

import com.rroggia.bridge.implementation.Abstraction;
import com.rroggia.bridge.implementation.RefinedAbstraction;

public class Client {

	public static void main(String[] args) {
		
		// 1. The client does not see the difference between the two implementations 
		Abstraction abstraction = new Abstraction(1);
		abstraction.operation();

		Abstraction abstraction2 = new Abstraction(100);
		abstraction2.operation();
		
		// 2. The RefinedAbstraction (Subclass) can enhance the existing interface by:
		// * adding new methods in the subclass  (need to use the SubClass instance instead of Superclass instance) 
		// * overwriting the Abstraction methods

		Abstraction abstraction3 = new RefinedAbstraction(10);
		abstraction3.operation();
		
		// 3. It is possible to have the Implementor as a protected attribute and have its methods used in the subclass. 
		// In this approach, when the interface is changed all the subclasses that use the interface will be impacted.

	}
}
