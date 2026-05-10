public class Animals {
   static void live(){
        System.out.println("Live On Earth");
    }
     void random() {
       live();
    }

    public static void main(String[] args) {


Animals newAnimal=new Animals();
        newAnimal.live();

        Animals crow=new Birds();
        crow.live();
    }

}
