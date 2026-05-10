package Inheritance;

import Polymorphism.Shape;

public class Circle extends Shape {
    //this basically runs when an object of child class is created and hence it overrides parent class

   // @Override this is called annotation
    void area(){
        System.out.println("Area is pie*r*r");
    }
}
