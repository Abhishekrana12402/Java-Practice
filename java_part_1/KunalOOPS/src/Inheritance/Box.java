package Inheritance;

public class Box {
    double length;
    double height;
    double width;
    static void greeting(){
        System.out.println("Hello I am in the Inheritance.Box");
    }
    //static method cannot be overridden as they don't depend on the objects , Overridden depends on the object
    //and static doesn't depends on the object therefore static method cannot be overridden but it can be inherited
    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    //cube
    Box(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }
    Box(double length, double height, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    Box(Box old) {
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }
    public void information() {
        System.out.println("Running the Inheritance.Box");
    }
}


