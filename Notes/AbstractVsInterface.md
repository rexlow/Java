<!-- First -->
Consider using abstract classes if :

You want to share code among several closely related classes.
You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
You want to declare non-static or non-final fields.
Consider using interfaces if :

You expect that unrelated classes would implement your interface. For example,many unrelated objects can implement Serializable interface.
You want to specify the behaviour of a particular data type, but not concerned about who implements its behaviour.
You want to take advantage of multiple inheritance of type.
In simple terms, I would like to use

interface: To implement a contract by multiple unrelated objects

abstract class: To implement the same or different behaviour among multiple related objects

<!-- Second -->
An interface consists of singleton variables (public static final) and public abstract methods. We normally prefer to use an interface in real time when we know what to do but don't know how to do it.

This concept can be better understood by example:

Consider a Payment class. Payment can be made in many ways, such as PayPal, credit card etc. So we normally take Payment as our interface which contains a makePayment() method and CreditCard and PayPal are the two implementation classes.

<!-- go to Interface.java -->

In the above example CreditCard and PayPal are two implementation classes /strategies. An Interface also allows us the concept of multiple inheritance in Java which cannot be accomplished by an abstract class.

We choose an abstract class when there are some features for which we know what to do, and other features that we know how to perform.

Consider the following example:

<!-- go to Abstract.java -->

If we add methods (concrete/abstract) in the future to a given abstract class, then the implementation class will not need a change its code. However, if we add methods in an interface in the future, we must add implementations to all classes that implemented that interface, otherwise compile time errors occur.
