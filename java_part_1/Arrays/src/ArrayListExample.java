import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> revlist = new ArrayList<>();
        list.add(0);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
int m=list.get(2);
        System.out.println(m);

       // System.out.println(list);
        //list.set(0, 5);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        Collections.reverse(list);

       /* for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }*/
int n= list.size();


    }
    }


