package classobj;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student kunal = new Student(50,"Abhishek",99f);

        System.out.println(kunal.marks);
        kunal.ChangeName("kunal");
        kunal.greeting();
        Student stud2 = new Student(kunal);
        System.out.println(stud2.roll_no);

        System.out.println(Arrays.toString(students));
    }
}
