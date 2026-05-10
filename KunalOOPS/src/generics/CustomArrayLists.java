package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayLists {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayLists(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
       int[] temp=new int[data.length*2];
       for (int i=0;i<data.length;i++){
           temp[i]=data[i];
       }
       data=temp;
    }
    public int remove(){
        int removed=data[size--];
        return removed;
    }
    public int  set(int index,int value){
     return data[index]=value;
    }
    public int get(int index){
       return data[index];
    }
    public int size(){
        return size;
    }

    private boolean isFull(){
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayLists{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
     // ArrayList list=new ArrayList();
CustomArrayLists lists=new CustomArrayLists();
lists.add(3);
lists.add(5);
        lists.add(9);
        for(int i=0;i<14;i++){
            lists.add(2*i);
        }
        System.out.println(lists);
    }
}
