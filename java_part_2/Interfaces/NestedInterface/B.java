package java_part_2.Interfaces.NestedInterface;

public class B {
    public interface nested{
        boolean is_odd(int num);
    }
}
class  A implements B.nested{

    @Override
    public boolean is_odd(int num) {
        return num%2!=0;
    }
}
