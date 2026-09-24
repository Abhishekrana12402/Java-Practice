package java_part_2.Static;


public class Main {

   public static void main() {
      Human abhi = new Human(2000,"Abhishek",23,false);
      Human Kunal = new Human(2000,"Abhishek",23,false);
       System.out.println(abhi.population);
       System.out.println(Kunal.population);
//       greeting(); cannot call non static method in static main
       fun();

    }
    static void fun() {
//        greeting(); cannot call non static functions in static as static does
        //not requires object creation and hence how we can include something that requires object creation

        Main main = new Main();
        main.greeting();
//        After creating instance we can call non static in static method
    }
    void greeting(){
        System.out.println("Greeting! How are you");
    }
}
