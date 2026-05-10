package AccessModifier2;

import AccessModifier1.A;

public class Main extends A {
    public Main(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        A obj=new A(10,"rana",new int[5]);
        System.out.println(obj.getNum());
       // System.out.println(obj.num);

    }
}
