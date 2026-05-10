public class Abstraction {
    public static void main(String[] args) {
//        Horse H = new Horse();
//        H.Eat();
//        H.Walks();
//
//        Chicken C = new Chicken();
//        C.Eat();
//        C.Walks();
//        Horse pony=new Horse();
//        System.out.println(pony.Color);
        mustang M=new mustang();
    }
}

    abstract class Animal {
    String Color;
    Animal(){
     Color="brown";
        System.out.println("Animal constructor is called");
    }

        void Eat(){
            System.out.println("Animal eats");
        }
abstract void Walks();
    }
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
   void changecolor(){
    Color="black";
    }
    void Walks(){
        System.out.println("Walks on 4 legs ");
    }
}
class mustang extends Horse{
    mustang(){
        System.out.println("mustang constructor is called");
    }
}
class Chicken extends Animal{
    void Walks(){
        System.out.println("Walks on 2 legs");
    }
}


