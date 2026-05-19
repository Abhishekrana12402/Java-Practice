package Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Student Rahul = new Student(12, 89.76f);
        Student Abhishek = new Student(5, 99.78f);
        Student Arpit = new Student(10, 100f);
        Student Anurag = new Student(9, 86.21f);
        Student Sanjay = new Student(7, 76.772f);
        Student Sid= new Student(1, 87.9f);
        Student[] list={Rahul,Abhishek,Arpit,Anurag,Sanjay,Sid};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        if (Abhishek.compareTo(Rahul)>0) {
            System.out.println("Abhishek has more marks");
        }
    }
}
