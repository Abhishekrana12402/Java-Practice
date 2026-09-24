package java_part_2.Access;

public class Testing {
    private int num;
    int[] arr;
    String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Testing(int num, String name) {
        this.num = num;
        this.arr = new int[num];
        this.name = name;
    }
}
