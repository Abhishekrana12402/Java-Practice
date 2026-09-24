package java_part_2.Inheritance;

public class Box {
    int l;
    int b;
    int h;
//    int w;
    Box(){
        this.h = -1;
        this.b = -1;
        this.l = -1;
//        this.w =-1;
    }
    Box (int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    Box(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
//        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
    public void information(){

        System.out.println("Running the box");
    }

    public static void main() {
        BoxWeight box = new BoxWeight(10,10,10,10);
        BoxWeight box2= new BoxWeight(box,12);
        System.out.println(box2.w);
    }
}
