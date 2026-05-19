package AbstractClasses;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
        this.age=age;
    }

    void career(){
        System.out.println("I am going to be coder");
    }
    void partner(){
        System.out.println("I love rahul ans he is 23 years old");
    }
    //if two classes have same functions and then if we inherit both the classes and call the particular function that was common in both the classes hence java will confused which function the respective classes should be called
    //hence java doesn't supports multilevel inheritance
    //In abstract classes we don't provide method body in the parent class instead we write the method body in child class
}
