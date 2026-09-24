package java_part_2.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public int remove(){
       int removed = data[--size];
       return removed;
    }

    private void resize(){
        int[] temp = new int[data.length*2];
        for (int i=0; i<= data.length;i++){
         temp[i] = data[i];
        }
        data = temp;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int num){
        data[index] = num;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(45);
//        list.remove(0);
//        list.set(1,22);
//        System.out.println(list);
CustomArrayList list = new CustomArrayList();
list.add(5);
        System.out.println(list);
list.add(10);
        System.out.println(list);
list.remove();
        System.out.println(list);
list.set(7,10);
        System.out.println(list);


    }
}
