package AbstractClasses;

public class Son extends Parent{
    public Son(int age) {
        super(age);
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am going to doctor");
    }
    @Override
    void partner() {
        System.out.println("I love riya she is 22 years old");
    }
}
