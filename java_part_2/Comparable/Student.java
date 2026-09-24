package java_part_2.Comparable;

public class Student implements Comparable<Student>{
    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    int roll_no;
    float marks;

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks-o.marks);
    }
}
