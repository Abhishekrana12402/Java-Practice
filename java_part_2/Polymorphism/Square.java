package java_part_2.Polymorphism;

public class Square extends Shape {
    private int getter = -1;
    static void area(){
        System.out.println("Area is side ^2");
    }
    public int GetterFunc(){
        return getter;
    }
}
