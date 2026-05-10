package Practice;

public class Students {
    public static void main(String[] args) {
       Student student1= new Student("abhishek", 50);

        System.out.println(student1.name+" "+student1.roll);
        student1.greeting();
        student1.changeName("raj");
        System.out.println(student1.name);
        student1.greeting()
        ;
    }
    static class Student{
         String name;
        int roll;
        void greeting(){
            System.out.println(this.name+" Hello how are you");
        }
        Student(String name,int roll){
            this.name=name;
            this.roll=roll;
        }
        void changeName(String name){
            this.name=name;
        }
    }
}
