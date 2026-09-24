package java_part_2.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {
//    public class CustomGenericArrayList<T extends Number> { Wild card example more restrictive
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    private void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i=0; i<= data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T num){
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

CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
//list.add("Hello") give error generic type check
        list.add(6);
        list.add(10);
        System.out.println(list);
        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
//list.add("Hello") give error generic type check
        list2.add("Hello");
        list2.add("World");
        System.out.println(list2);

    }
}
