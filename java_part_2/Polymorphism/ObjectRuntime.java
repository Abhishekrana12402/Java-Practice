package java_part_2.Polymorphism;

public class ObjectRuntime {
    int num;
    public ObjectRuntime(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectRuntime{" +
                "num=" + num +
                '}';
    }

    public static void main() {
        ObjectRuntime obj = new ObjectRuntime(12);
        System.out.println(obj);
    }
}
