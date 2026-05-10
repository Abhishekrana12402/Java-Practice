public class LivingBeings {
    double lifespan;
    String Food;
    int child;
    String WhereTheyLive;
    LivingBeings(){
        this.Food="food";
        this.WhereTheyLive="Earth";
        this.child=2;
        this.lifespan=60;

    }
       LivingBeings(double lifespan,String Food,int child ,String WhereTheyLive){
       this.lifespan=lifespan;
       this.Food=Food;
       this.child=child;
       this.WhereTheyLive=WhereTheyLive;
   }
   LivingBeings(LivingBeings other){
       this.lifespan=other.lifespan;
       this.WhereTheyLive=other.WhereTheyLive;
       this.child=other.child;
       this.Food=other.Food;
   }
     void information(){
       System.out.println("Lives in Earth");
   }
    public static void main(String[] args) {
        LivingBeings human=new LivingBeings(80,"rice",2,"House");
        System.out.println(human.lifespan);
        LivingBeings Animals=new LivingBeings(human);
        System.out.println(Animals.child);
        Humans Raju=new Humans();
        System.out.println(Raju.salary);
        System.out.println(Raju.hobbies);
        System.out.println(Raju.child);
        LivingBeings Ajay=new Humans();
        System.out.println(Ajay.lifespan);
        Raju.information();
        Ajay.information();
        Humans Brijesh=new Humans(20,"rice",2,"Dahisar",40000,"dancing");
        System.out.println(Brijesh.hobbies);

    }
}
 class Humans extends LivingBeings {
int  salary;
String hobbies;
Humans(){
    this.salary=250000;
    this.hobbies="playing";
    this.child=5;
}
Humans(double lifespan,String Food,int child ,String WhereTheyLive,int salary,String hobbies){
  super( lifespan, Food, child , WhereTheyLive);
  this.hobbies=hobbies;
  this.salary=salary;
}
//@Override
 void information(){
    System.out.println("Lives in their respective house");
}

}
