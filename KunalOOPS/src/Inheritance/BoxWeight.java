package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(double length,double height,double width,double weight) {
        super(length, height, width);//it calls the parent class constructor
        //use to initialise the values present in the parent class
        //Note: all the variables which are declared as private that won't be able accessed outside that particular file
        //suppose weight variable is also defined in Inheritance.Box constructor then in case in order to
//        access weight of child class(Inheritance.BoxWeight) we will use this.weight but if we want to access
//                the parent weight then we can use  super.weight
        this.weight = weight;
//child class variables are written in this format whereas super or parent class variables are defined in the super()


    }

    static void greeting(){
        System.out.println("Hello I am in the Inheritance.BoxWeight");
    }





}
