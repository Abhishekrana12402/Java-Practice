package AbstractClasses;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);

    }

    @Override
    public void career() {
        System.out.println("I want to be a coder");
    }

    @Override
    public void partner() {
        System.out.println("I love Rohit");
    }
}
