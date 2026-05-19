package AbstractClasses;

public class Son extends Parent{
   public Son(int age){
       super(age);

   }
    @Override
    public void career() {
        System.out.println("I want to be a doctor");
    }

    @Override
    public void partner() {
        System.out.println("I love Riya  ");
    }
}
