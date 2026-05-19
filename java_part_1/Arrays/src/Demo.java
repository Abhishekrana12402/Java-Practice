import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(list.size()-1));
    }
}
