package java_part_2.Interfaces.NestedInterface;

public class Main {
    static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.is_odd(3));
    }
    //nested interfaces can be declared as private public or default
    //whereas top level interface needs to be declared as default or public
}
