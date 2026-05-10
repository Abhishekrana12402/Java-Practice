package Polymorphism;

public class PolymorphismMain  {
    //Act of representing single thing into more than 1 form
    public static void main(String[] args) {
//        Polymorphism.Shape shapes=new Polymorphism.Shape();
//        Polymorphism.Shape square=new Polymorphism.Square();
//        Polymorphism.Shape circle=new Inheritance.Circle();
//        Polymorphism.Triangle triangle =new Polymorphism.Triangle();
//        shapes.area();
//        circle.area();
//        triangle.area();
        //Parent Object=new Child() here which method will be called depends on the child This is called Upcasting
//        if we haven't written any function of area for any child class then it will print the content of parent class
       /* Overloading example
       Overloading refers to the ability to define multiple methods in a class with the same name but different parameters. In other words, you can have multiple methods with the same name but different argument lists or types within a single class. The compiler determines which method to execute based on the number, type, and order of the arguments passed to it. Key points about method overloading include:

The methods must have the same name but different parameter lists.
The return type of the method doesn't play a role in overloading.
Overloading allows you to provide multiple ways to perform a similar operation with different inputs.
Example of method overloading:

java
Copy code
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
Overriding Example:
Overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass. It involves creating a method in a subclass with the same name, return type, and parameters as the method in the superclass. The purpose is to change the behavior of the method in the subclass to suit its specific needs. Key points about method overriding include:

The methods must have the same name, return type, and parameters.
Overriding is only applicable to inherited methods from a superclass.
The method in the subclass must have the same or a more accessible visibility modifier than the method in the superclass.
Example of method overriding:

java
Copy code
public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
Dynamic method dispatch: Dynamic method dispatch, also known as runtime polymorphism, is a mechanism in object-oriented programming where the appropriate implementation of a method is determined dynamically at runtime based on the actual type of the object being referenced. It allows a subclass to override a method defined in its superclass and provide its own implementation.

Here's how dynamic method dispatch works:

Inheritance: Dynamic method dispatch relies on the concept of inheritance, where a subclass inherits methods from its superclass. The subclass can override these inherited methods to provide its own implementation.

Polymorphism: Polymorphism refers to the ability of an object to take many forms. In the context of dynamic method dispatch, it means that a variable of a superclass type can refer to an object of either the superclass or any of its subclasses.

Method Invocation: When a method is invoked on an object through a superclass reference, the actual type of the object is determined at runtime. The JVM checks the actual type of the object being referenced and dynamically binds the method invocation to the appropriate implementation in the object's class.
        */

    }
}
