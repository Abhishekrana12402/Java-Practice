package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(19);
son.career();
Daughter daughter=new Daughter(23);
daughter.career();
//Parent mom=new Parent() we cannot create an object of a parent class directly
     // abstract static void hello(){
        //    System.out.println("My name is Abhishek");
        //} we will not able to create abstract static methods because we use abstract methods to be overridden and static methods cant be overridden hence they conflict with each other



    }
}
