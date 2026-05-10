package Basics;

public class Main {

    /* public static void main(String[] args) {
         Student[] students = new Student[5];
         Student student1 = new Student();
 //        student1.roll_no=50;
 //        student1.name="Kunal Kushwaha";
 //        student1.marks= 96.98F;
         System.out.println(student1.roll_no);
         System.out.println(student1.marks);
         System.out.println(student1.name);
         student1.changename("raja");
         student1.greeting();
         Student student2=new Student();
 //        student2.roll_no=36;
 //        System.out.println(student2.roll_no);
     }
 }
    //creation of class
     class Student {
        int roll_no;
        String name;
        float marks;
        void greeting(){
            System.out.println("Hello my name is "+name);
        }
        void changename(String newname){
            this.name=newname;
        }
        Student(){
            this.roll_no=50;
            //in general this.  will be replaced with the student1, student2
            this.name="abhishek rana";
            this.marks=98;
        }


    public static void main(String[] args) {

        Student student = new Student(10,98,"abhishek");
        System.out.println(student.roll_no);
        System.out.println(student.marks);
        System.out.println(student.name);
        Student random=new Student(student);
        System.out.println(random.name);
    }
}
   class Student{
       int roll_no;
       String name;
       float marks;
Student(int rollno,int marks,String name){
    this.roll_no=rollno;
    this.marks=marks;
    this.name=name;
}
Student(Student other){
this.name=other.name;
}


    public static void main(String[] args) {
        Student one=new Student();
       Student two=one;
        one.name="xyz";
        one.changename("abhishek");
        System.out.println(two.name);

    }
}
class Student{
    int roll_no;
    int marks;
    String name;
    void changename(String name){
this.name=name;
    }


    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+","+b);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
//        here a and b value will be swap since they are inside the function but if we will
//                try to print a and b in the main class it will not swap since they are passed as refernce variables
    }


    public static void main(String[] args) {
        final int num=10;
//        num=20;
//        once final is declared it cannot be modified further hence it is giving error and it should always be initialised by some value
In object-oriented programming, the final keyword is used to denote elements (classes, methods, and variables) that cannot be modified or overridden.

Final Classes: When a class is declared as final, it cannot be extended by other classes. It effectively prevents inheritance. This is useful when you want to prevent further modification or extension of a class, typically for security or design reasons.
java
Copy code
final class FinalClass {
    // Class implementation
}
Final Methods: When a method is declared as final, it cannot be overridden by subclasses. This ensures that the method implementation in the parent class remains unchanged in all derived classes.
java
Copy code
class ParentClass {
    final void finalMethod() {
        // Method implementation
    }
}

class SubClass extends ParentClass {
    // Cannot override finalMethod() in SubClass0
}
Final Variables: When a variable is declared as final, its value cannot be changed once assigned. This is often used to create constants or to ensure immutability.
java
Copy code
final int MAX_VALUE = 100;
final String MESSAGE = "Hello, World!";
It's important to note that the final keyword has different meanings depending on the context (class, method, or variable). In general, it provides a way to enforce immutability, prevent modification or extension, and ensure consistency in the behavior of classes and methods.

By using the final keyword appropriately, you can create more robust and secure code in object-oriented programming.

}

     */


    public static void main(String[] args) {
      /* final Student one=new Student();
       one.name="abhishek";
//        one=new Student(); we cannot do this
//        in this case we have provided final to an object(non primitve data types) hence we will be able to make changes wihtin it but we cannot reassign one object to another
        RestOther.Human kunal=new RestOther.Human(23,250000,"kunal kushwaha",true);

        RestOther.Human rahul=new RestOther.Human(23,250000,"kunal kushwaha",true);
        System.out.println(kunal.name);
        System.out.println(RestOther.Human.population);
    //Basically when kunal.population is called its firsts check whether there is population within it(in the object that is created)
//        or not if there is no such population then it will check in class that whether there is some static variables which are common to all and hence it will accordingly update it
    }

       */
        //Basics.Singleton Part continued here
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
//all three reference variables are pointing to only one object


    }

    static void fun() {
        // greeting();
        //this cannot be done as greeting method is not-static and it cannot be refernced from a static context and hence correct way of doing this is by creating an intance of Main
        Main object = new Main();
        object.greeting();
    }

    void greeting() {
        System.out.println("Hello World");
    }
}
