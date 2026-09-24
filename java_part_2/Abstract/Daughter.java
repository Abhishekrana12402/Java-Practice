package java_part_2.Abstract;

public class Daughter extends Parent{
    @Override
    void Career(String name) {
        System.out.println("I want to be a Nurse says : "+ name);
    }

    @Override
    void Partner(int age, String name) {
        System.out.println("My partner age will be "+ age+ "and her name will be "+name);
    }

    @Override
    void HelloWorld() {
        System.out.println("Hello world Daughter");
    }

    public static void main(String[] args) {
        Parent son = new Son();
        son.Career("Abhishek");
        son.Partner(29,"Priyanka");
        Parent daughter = new Daughter();
        daughter.Career("Priyanka");
        daughter.Partner(29,"Abhishek");
        daughter.HelloWorld();

        //abstract method needs to be overidden static method cannot be overidden that's why we cannot have static abstract method
    }
}
