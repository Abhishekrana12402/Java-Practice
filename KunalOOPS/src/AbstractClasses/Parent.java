package AbstractClasses;
public abstract class Parent {
abstract void career();
abstract void partner();
    int age;
    public Parent(int age) {
        this.age = age;
    }
    //cannot create abstract constructors into abstract classes also cannot create abstract static methods
    // If a class contains abstract methods then it itself should be abstract
    //Every child class will override all the methods declared or initiated in the parent class because in parent class this method doesn't have any body
    //Imp Note:We cannot create objects of an abstract classes for example Parent Mom=new Parent(); this cannot be done
//we cannot create abstract constructors
}
