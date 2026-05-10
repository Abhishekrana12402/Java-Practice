package AccessModifier1;

public class Main {
    public void main(String[] args) {
        A obj=new A(10,"raj",new int[5]);
        System.out.println(obj.getNum());
        System.out.println(obj.num);
        B obj2=new B(10,"raj",new int[5]);
        System.out.println(obj2.num);
    }
    public class B extends A{

        public B(int num, String name, int[] arr) {
            super(num, name, arr);
        }


    }
}
