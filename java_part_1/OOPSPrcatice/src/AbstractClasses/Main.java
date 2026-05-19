package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(20);
        son.career();
        Daughter daughter=new Daughter(17);
        daughter.career();
        System.out.println(daughter.age);
    }
}
