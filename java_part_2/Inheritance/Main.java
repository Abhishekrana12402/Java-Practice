package java_part_2.Inheritance;

public class Main {
    public static void main() {
//        System.out.println("Hii");
        Box box = new Box();
        System.out.println("Length "+ box.l+ " " +"Breadth "+ box.b+" "+"Height "+ box.h);
        Box box2 = new Box(4);
        System.out.println("Length "+ box2.l+ " " +"Breadth "+ box2.b+" "+"Height "+ box2.h);
        Box box3 = new Box(4,5,6);
        System.out.println("Length "+ box3.l+ " " +"Breadth "+ box3.b+" "+"Height "+ box3.h);
        Box box4 = new Box(box2);
        System.out.println("Length "+ box4.l+ " " +"Breadth "+ box4.b+" "+"Height "+ box4.h);
        BoxWeight box5 = new BoxWeight(10);
        System.out.println("Length "+ box5.l+ " " +"Breadth "+ box5.b+" "+"Height "+ box5.h+" "+"Weight "+ box5.w) ;
//        BoxWeight box6 = new Box();
//        this cant be done as we are creating object of parent and referencing it to child but parent don't know anything about child (dog --->animal)
        Box box7 = new BoxWeight(9,10,9,10);
//        this can be done as when BoxWeight object is created it have all reference to instance variable coming from super Box as well as own
    }
}
