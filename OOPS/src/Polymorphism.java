public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.Sum(1,2));
        System.out.println(calc.Sum((float)1.1,(float)2.0));
        System.out.println(calc.Sum(1,2,3));
        deer d=new deer();
        d.eat();
    }
}
class Animals{//method overriding or runtime polymorphism
    void eat(){
        System.out.println("Eats anything");
    }
}
class deer extends Animals{
    void eat(){
        System.out.println("Eats grass");
    }
}
class Calculator{//Method Overloading or compile time polymorphism
    int Sum(int a, int  b){
        return a+b;
    }
    float Sum(float a,float b){
        return a+b;
    }
    int Sum(int a , int b, int c){
        return a+b+c;
    }
}
