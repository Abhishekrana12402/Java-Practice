package AccessModifier1;

public class A {
    int num;
    String name;
    int[] arr;

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
