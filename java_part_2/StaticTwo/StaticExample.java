package java_part_2.StaticTwo;

public class StaticExample {

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
   public static void main() {
        Test a = new Test("kunal");
        Test b = new Test("kunal");
        int[] arr = {12,34};
       System.out.println(arr);
       System.out.println(a);

    }
}
