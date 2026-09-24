package java_part_2.Inheritance;

public class BoxWeight extends Box{
    int w;

    public BoxWeight(int w) {
        this.w = w;
    }

    public BoxWeight(int side, int w) {
        super(side);
        this.w = w;
    }

    public BoxWeight(int l, int b, int h, int w) {
        super(l, b, h);
        this.w = w;

    }

    public BoxWeight(Box old, int w) {
        System.out.println("START");
        this.w = w;
        System.out.println("BEFORE SUPER");
        super(old);
        System.out.println("AFTER SUPER");
    }
}
