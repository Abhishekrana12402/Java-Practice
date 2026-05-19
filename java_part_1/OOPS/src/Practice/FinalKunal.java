package Practice;

public class FinalKunal {
    public static void main(String[] args) {
final A stud=new A("raj");
        System.out.println(stud.name);
        stud.name="abhishek";
        System.out.println(stud.name);
       // stud=new A("deepak"); cannot reassign
    }
   static class A{
        String name;
        public A(String name){
            this.name=name;
        }
    }
}
