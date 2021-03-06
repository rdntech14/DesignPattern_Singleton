Singleton Design Pattern in Java
=====

# What is Singleton Design Pattern

It is a creational pattern.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

# Where to use

1) Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.

2) The singleton class must provide a global access point to get the instance of the class.

3) Singleton pattern is used for logging, drivers objects, caching and thread pool.

# How to implement

1) Private constructor to restrict instantiation of the class from other classes.

2) Private static variable of the same class that is the only instance of the class.

3) Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.