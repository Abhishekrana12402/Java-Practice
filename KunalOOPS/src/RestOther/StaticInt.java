package RestOther;

public class StaticInt {
    static int a=4;
    static int b;
    //it will only run once when 1st object is created i.e. when the class is loaded for the first time
    static {
        System.out.println("Hello World");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);
        StaticInt.b+=5;
        System.out.println(StaticInt.a+" "+StaticInt.b);
    }
}
