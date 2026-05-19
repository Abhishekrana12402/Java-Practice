package Comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    int roll_no;
    float  marks;

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+" ";
    }

    @Override
    public int compareTo(@NotNull Student o) {
       int diff= (int) (this.marks-o.marks);
     //  if diff is 0 then both have same marks and if diff is negative indicates that o marks is greater else o is smaller
       return diff;
    }
}
