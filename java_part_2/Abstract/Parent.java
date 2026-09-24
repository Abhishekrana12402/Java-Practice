package java_part_2.Abstract;

public abstract class Parent {
    int age;
    String name;
    abstract void Career(String name);
    abstract void Partner(int age, String name);
    void HelloWorld(){
        System.out.println("Hello World");
    }
    static void main(String[] args) {

    }
}
