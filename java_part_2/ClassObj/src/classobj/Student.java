package classobj;

public class Student {
int roll_no;
String name;
float marks;
Student(int roll_no,String name, Float marks){
    this.roll_no = roll_no;
    this.name = name;
    this.marks = marks;
}
void greeting(){
    System.out.println("Hii my name is:"+ name);
}
void ChangeName(String newname){
    name = newname;
}
Student(Student other){
    this.name = other.name;
    this.roll_no = other.roll_no;
    this.marks = other.marks;
}
}
