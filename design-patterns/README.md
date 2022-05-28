# DesignPatterns
Design Patterns implementation in java

#### 1. [Creational Pattern](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#creational-pattern)
* [Abstract Factory](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#abstract-factory)
* [Builder](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#builder)
* [Factory Method](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#factory-method)
* [Prototype](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#prototype)
* [Singleton](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#singleton)
#### 2. [Structural Pattern](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#structural-pattern)
* [Adapter](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#adapter)
* [Bridge](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#bridge)
* [Composite](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#composite)
* [Decorator](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#decorator)
* [Facade](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#facade)
* [Flyweight](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#flyweight)
* [Proxy](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#proxy)
#### 3. [Behavioral Pattern](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#behavioral-pattern)
* [Chain of Responsibility](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#chain-of-responsibility)
* [Command](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#command)
* [Interpreter](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#interpreter)
* [Iterator](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#iterator)
* [Mediator](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#mediator)
* [Memento](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#memento)
* [Observer](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#observer)
* [State](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#state)
* [Strategy](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#strategy)
* [Template Method](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#template-method)
* [Visitor](https://github.com/RRoggia/DesignPatterns/blob/master/README.md#visitor)

## Creational Pattern

### Abstract Factory
`TODO`

### Builder
* Ease the construction of complex objects
* Good for cases where `Product` can have lots of optionals parameters, the `Builder` makes the API flexible by allowing only to add the required fields

[Builder Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/builder)

Example:

```` java
Builder builder = new ConcreteBuilder();
Director director = new Director(builder);
director.construct();
Product product = builder.getProduct();

System.out.println(product);
````
Output:

```` console
Product [partOne=One, partTwo=Two]
````
### Factory Method
* Decouple the construction of the object of its implementation. 
* The `Creator` provides a hook method to its subclasses implement and decide the `Product` implementation.
* The `Creator.anOperation()` does not know about the `Product` implementations, only the interface.
* The `Product` interface determines the interface the `Creator` will have to work with.
* The `ConcreteCreator` makes the connection between the `Creator` and the `ConcreteProduct` implementation.
 
[Factory Method Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/factoryMethod)

Example:

```` java
Creator creator = new ConcreteCreator();
creator.anOperation();
````
Output:

```` console
ConcreteProduct operation 1.
ConcreteProduct operation 2.
````

### Prototype
`TODO`

### Singleton
* Ensure the `Singleton` class has only one instance
* The `Singleton` itself is responsible for the management of the its instances
* A variation of this pattern, is to have a registry of singletons where subclasses register theirself to the `Singleton`, and the instance to be created is defined in runtime, for example, by a enviroment parameter

[Singleton Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/singleton)

Example:

````java
System.out.print("Get Instance 1st time: ");
System.out.println(Singleton.getInstance());

System.out.print("Get Instance 2nd time: ");
System.out.println(Singleton.getInstance());

System.out.print("Is the instance the same? ");
System.out.println(Singleton.getInstance() == Singleton.getInstance());

System.out.print("Data: ");
System.out.println(Singleton.getInstance().getData());
````

Output:
```` console
Get Instance 1st time: com.rroggia.singleton.implementation.Singleton@7852e922
Get Instance 2nd time: com.rroggia.singleton.implementation.Singleton@7852e922
Is the instance the same? true
Data: Same Data
````

## Structural Pattern

### Adapter
* There is two default ways of implementing it: 
    * The `AdapterInheritance` class implements the `Target`interface and extends the `Adaptee` interface
    * The `AdapterComposition` class is composed by the `Adaptee` and implements the `Target` interface
* The adapter class can also implement behaviours the `Adaptee` interface doesn't support

**AdapterInheritance**
* Easily change the behaviour of the adaptee, by re-implementing the `Adaptee` methods (Line 13 - making the `parameter` uppercase).
* The `AdapterInheritance` will not work with the `Adaptee` subclasses.
* You exposes both the `Target` and the `Adaptee` methods.

**AdapterComposition**
* Works with all the subclasses of `Adaptee`, for example, you can use the `setAdaptee` method to change `Adaptee` implementation.
* You only exposes the `Target` interface.

[Adapter Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/adapter)

Example:

````java
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
````

Output:

````console
AdapterComposition
Adaptee.specificRequest() implementation called from Target (Interface)

AdapterInheritance
Adaptee.specificRequest() implementation called from AdapterInheritance (Subclass)
Adaptee.specificRequest() implementation called from Adaptee (Superclass)
Adaptee.specificRequest() implementation called from Target (Interface)
````

### Bridge
* The `Client` class will consume the `Abstraction` class, which is responsible for define the interface
* The `Abstraction` class "delegates" the processing to a one of the `ConcreteImplementator` that implements the `Implementor` interface
* The `RefinedAbstraction` (Subclass) can enhance the existing interface by:
    * adding new methods in the subclass  (need to use the SubClass instance instead of Superclass instance) 
    * overwriting the Abstraction methods

[Bridge Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/bridge)

Example:

````java
Abstraction abstraction = new Abstraction(1);
abstraction.operation();

Abstraction abstraction2 = new Abstraction(100);
abstraction2.operation();
		
Abstraction abstraction3 = new RefinedAbstraction(10);
abstraction3.operation();		
````

Output:

````console
primitive Operation One - Concrete Implementation A.
primitive Operation Two - Concrete Implementation A.
primitive Operation One - Concrete Implementation B.
primitive Operation Two - Concrete Implementation B.
The refined Abstraction do more things
primitive Operation One - Concrete Implementation B.
primitive Operation Two - Concrete Implementation B.
````

### Composite  
`TODO`

### Decorator 
`TODO`

### Facade
* Provides an unique and simplified interface to several resources of a subsystem. 
* `Facade` can provide an default behavior, making it better to most of the clients that can use the default implementation. For more specific scenarios, client application can still access the `SubsystemClass`.
* Decouples client application from the and `SubsystemClass`. Because, the `Facade` is the entry point of the subsystem, it isolates the client code from the `SubsystemClass`. Loose couple and less classes to the client application to know about, making it easier to use.
* The `Facade` delegates the work to the `SubsystemClass`. It might be required some mapping between the `Facade `interface and the `SubsystemClass`. 

[Facade Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/facade)

Example: 

````java
new Facade().doSomething(4);
````

Output:

````console
SubsystemClassA value is 8
Subsystem class b value is 4.0
````

### FlyWeight
* Intrinsic State: Represents what is in common between the flyweight objects. It's stored in the `ConcreteFlyweight` class. E.g. Characters
* Extrinsic State: Represents the variations that can be combined with the Intrinsic State. The `Client` class injects the Extrinsic State through the signature avaialble in the `Flyweight` interface. E.g. Fonts

[FlyWeight Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/flyweight)

Example:

```` java
flyweight = FlyweightFactory.getFlyweight("Hello");
flyweight.operation("World!.");
flyweight.operation("Darkness my old friend.");
````
Output:

````console
Hello World!.
Hello Darkness my old friend.
````

### Proxy
`TODO`

## Behavioral pattern

### Chain of Responsibility
`TODO`

### Command
`TODO`

### Interpreter
`TODO`

### Iterator
`TODO`

### Mediator
`TODO`

### Memento
`TODO`

### Observer
* Whenever you have to establish an 1:n communication you can consider this pattern
* The `Subject` is an abstract class responsible to handling the `ConcreteSubject`'s `Observer`s through the `attach()` and `detach()` methods
* The `Subject` also specifies a `notifyObservers` method, used to notify all the `Observer`s attached to the `ConcreteSubject`
* The `ConcreteSubject` holds the state of the data, once the data changes either itself can notify the `Observer`s or it can provide a method to a client class do the notification
  * If the `ConcreteSubject` holds several states, it can trigger several times the notify, which can be inefficient
  * If a client class is responsible for the notification, it can notify only once after all the states were updated. However, there is the possibility of the client class forget to call the notify. 
* The `Observer` provides an interface, `update()` used to notify each `ConcreteObserver`
  * Push model: The method provides through its interface the state changed in the `ConcreteSubject`, `update(stateChanged)`, it assumes all `ConcreteObserver` are interested in this information, which may not be true 
  * Pull model: The method solely notifies the `ConcreteSubject`, and the `ConcreteSubject` has to call the `ConcreteSubject` to fetch the changes 

[Observer Implementation](https://github.com/RRoggia/DesignPatterns/tree/master/src/com/rroggia/observer)

Client:

````java
	ConcreteSubject subject = new ConcreteSubject();
	ConcreteObserver observerOne = new ConcreteObserver(subject);
	AnotherConcreteObserver observerTwo = new AnotherConcreteObserver(subject);

	observerOne.showState();
	observerTwo.showState();

	subject.setState("Invalid");

	observerOne.showState();
	observerTwo.showState();
````
Output:

````
ConcreteObserver state is : Valid
AnotherConcreteObserver state is : Valid

change subject's state from 'Valid' to 'Invalid'

ConcreteObserver state is : Invalid
AnotherConcreteObserver state is : Invalid

````

### State
`TODO`

### Strategy
* Enables the `Client` class to choose between the `Strategy` implementations. To choose the behavior the `Client` has to to inject a `ConcreteStrategy` to the `Context`.
* There are two options to send `Context` data to the  `Strategy` implementations:
1. The `Strategy` interface receives the whole `Context` and the `ConcreteStrategy` it's responsible for getting the required data. It creates a coupling between the `Context` and `ConcreteStrategy`.
2. The `Strategy` interface receives only the arguments it requires. It might be necessary to have a generic interface, meaning that eventually a `ConcreteStrategy` might not use all the arguments.

[Strategy Implementation](https://github.com/RRoggia/design-patterns/tree/master/src/com/rroggia/strategy)

Changing Implementation Example: 

````java
Context context = new Context(new ConcreteStrategyA());
System.out.println(context.toUpperCase());

context = new Context(new ConcreteStrategyB());
System.out.println(context.toUpperCase());

````

Output:

````java
ANOTHER STRING
ANOTHER STRING
````

Examples of Context and Strategy Interfaces: 

````java
public interface Strategy {
	//sending whole context
	String toUpperCase(Context context);
	//sending only arguments
	String toUpperCase(String string);
}

````

### Template Method
`TODO`

### Visitor
`TODO`
