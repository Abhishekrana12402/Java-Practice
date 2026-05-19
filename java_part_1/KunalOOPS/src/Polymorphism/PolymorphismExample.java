package Polymorphism;

public class PolymorphismExample {
    int sum(int a,int b){
        return a=+b;
    }
    int sum(int a,int b,int c){
        return a+b;
    }
    double sum(double a,double b){
        return  a+b;
    }

    public static void main(String[] args) {
        PolymorphismExample number=new PolymorphismExample();
        number.sum(2,3,4);
        number.sum(2,3);
        number.sum(2,4);
    }
}
