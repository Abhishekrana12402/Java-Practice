package java_part_2.Static;

public class Human {
    int salary;
    String Name;
    int age;
    boolean married;
    static long population;

    public Human(int salary, String name, int age, boolean married) {
        this.salary = salary;
        Name = name;
        this.age = age;
        this.married = married;
        this.population+=1;
    }
    static void message(){
        System.out.println("Hello World"+ population);
    }

   public static void main() {
       message();
    }
}
