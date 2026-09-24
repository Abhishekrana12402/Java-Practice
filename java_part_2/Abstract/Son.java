package java_part_2.Abstract;

public class Son extends Parent{
    @Override
    void Career(String name) {
        System.out.println("I want to be a Doctor says : "+ name);
    }

    @Override
    void Partner(int age, String name) {
        System.out.println("My partner age will be "+ age+ "and her name will be "+name);
    }

    public static void main(String[] args) {
       Parent son = new Son();
        son.Career("Abhishek");
        son.Partner(29,"Priyanka");
    }
}
