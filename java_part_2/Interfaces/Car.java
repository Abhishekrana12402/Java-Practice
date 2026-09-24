package java_part_2.Interfaces;

public class Car implements Brake,Engine,Media{
    int a =10;
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car Engine");
    }
//classes implementation will always be priority as implemented with default methods in interface
    //we cannot define 2 defaults with same name in interfaces which the current class implements
    //default is used so that we dont define every  methods in class also that implements that interface
    //it will be repetation to define method in interface and impelement in actual class
    @Override
    public void stop() {
        System.out.println("I stop like a normal car Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }

   public static void main(String[] args) {

    }
    //static method cannot be inherited as inheritance means overriding and it deals with object
    //creation or run time polymorphism and hence static does not depends on object and hence cant be inherited
    //static methods in interface thats why must always have a body as it can be inherited and called via interface name
}
