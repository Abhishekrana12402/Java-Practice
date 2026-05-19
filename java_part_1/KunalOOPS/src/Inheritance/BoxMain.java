package Inheritance;

public class BoxMain {
    public static void main(String[] args) {
//        Inheritance.Box box=new Inheritance.Box(5,9,8);
//        Inheritance.Box box2=new Inheritance.Box(box);
//        System.out.println(box.length+" "+box.width+" "+box.height );
//Inheritance.BoxWeight box3=new Inheritance.BoxWeight();
//        System.out.println(box3.weight+" "+box3.length+" ");
        Box box5=new BoxWeight(2,3,4,8);

        //Above statement is of reference type Inheritance.Box but creating an object of type Inheritance.BoxWeight
       // and hence it totally depends on the reference type(super class) that what variables or element can be accessed

        System.out.println(box5.length);
        //Similarly opposite of it can be creating a reference type of Inheritance.BoxWeight and
        //object of type Inheritance.Box i.e.

//        Inheritance.BoxWeight box6=new Inheritance.Box(2,3,4); this cannot be done
        //there are many variables in both parent class as well as in the child class
        //since here reference type is Inheritance.BoxWeight and hence we'll be able to access variable
        //lying into it i.e. weight variable this also means that ones you are trying to access can be initialised
//but here, when the object itself is of type parent class  then how we will be able to call the child constructor
// Inheritance.BoxPrice box=new Inheritance.BoxPrice();
        Box.greeting();
        Box BoxNew=new BoxWeight();
       BoxNew.greeting();
    }
}
