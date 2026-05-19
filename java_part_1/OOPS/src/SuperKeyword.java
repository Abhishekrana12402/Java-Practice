public class SuperKeyword {
    public static void main(String[] args) {
       LION L=new LION();
        System.out.println(L.COLOR);
      // TIGER T=new TIGER();

    }
}
class JANWAR{
    String COLOR;
  JANWAR(){
      System.out.println("Animal constructor is called");
  }
}
class TIGER extends JANWAR{
    TIGER(){
        System.out.println("TIGER constructor is called ");
    }
}
class LION extends TIGER{
    LION(){

        super();
        super.COLOR="brown";
        System.out.println("LION constructor is called");
    }
}
