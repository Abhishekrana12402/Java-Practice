package RestOther;

public class Human {

   int age;
   int salary;
   boolean married;
   String name;
static long  population;

   public Human(int age, int salary, String name, boolean married) {
this.age=age;
this.married=married;
this.name=name;
this.salary=salary;
Human.population+=1;
   }


}


