package java_part_2.Override;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    void SayHelloWord(){
        System.out.println("Hello World");
    }

    //@Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

   static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12);
       System.out.println(obj1.hashCode());
       ObjectDemo obj2 = new ObjectDemo(12);
       System.out.println(obj2.hashCode());
       System.out.println(obj1.equals(obj2));
       System.out.println(obj1 instanceof Object);
       System.out.println(obj1.getClass().getAnnotations());
    }
}
