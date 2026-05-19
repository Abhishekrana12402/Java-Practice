package Polymorphism;

public class OverridingExample {
    //every class even the main class is inherited from the object ByDefault in java hence here we dont have to do
    //public class OverridingExample extends Object
    int num;

    @Override
    public String toString() {
        return "OverridingExample{" +
                "num=" + num +
                '}';
    }

    public OverridingExample(int num) {
this.num=num;

    }

    public static void main(String[] args) {
        OverridingExample number=new OverridingExample(20);
        System.out.println(number);
    }
}
