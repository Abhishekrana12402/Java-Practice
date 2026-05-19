package generics;

import java.util.Arrays;

public class GenericLists<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public GenericLists(){
        data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)(data[size--]);
        return removed;
    }
    public void  set(int index,T value){
        data[index]=value;
    }
    public T get(int index){
        return (T)data[index];
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
//        generics.CustomArrayLists lists=new generics.CustomArrayLists();
//        lists.add(3);
//        lists.add(5);
//        lists.add(9);
//        for(int i=0;i<14;i++){
//            lists.add(2*i);
//        }
//        System.out.println(lists);
       GenericLists<Integer> list=new GenericLists<>();
       for(int i=0;i<15;i++){
           list.add(2*i);
       }
        System.out.println(list);

    }

}
