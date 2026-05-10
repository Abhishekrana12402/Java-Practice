public class Temp {
    public static void main(String[] args) {
       Student S1 = new Student("Abhishek");
        Student S2 = new Student();
        System.out.println(S1.name);
       Student S3=new Student(50);
        System.out.println(S3.roll);

    }
}
    class Student {

        String name;
        int roll;

    Student(String name) {//Parameterized  Constructor
        this.name=name;
    }
        Student(){//Non Parameterized Constructor
            System.out.println("Constructor is created");
        }
         Student(int roll){
        this.roll=roll;
        }
    }
