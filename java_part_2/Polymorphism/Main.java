package java_part_2.Polymorphism;

public class Main {
   public static void main() {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Square square = new Square();
       System.out.println(square.GetterFunc());

       circle.area();
       //it will give circle area as there's confusion that all the variables function
       //are defined based on left hand side or reference variable so ideally it
       //should give shape area but this is not case because remember 1 thing what
       //variable and function which can be accessed depends on reference type left hand side
       //but what it is actually implemented or invoked depends on object type as
       //object type variable and functions are overridden
       //Parent obj = new child() which method will be called depends on child dynamic run dispatch

       //Static method cannot be overidden and hence now if we make fun
       //as static now it will call the shape area
       //overriding depends on object static does not depends on object and hence static cant be overridden
    }
}
