package Comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i+1);
        }
       // list.forEach((item)-> System.out.println(item*2));
        //lambda function
        Consumer<Integer> fun=(item)-> System.out.println(item*2);
        list.forEach(fun);
        //another syntax
        Operation sum=(a,b)->a+b;
        Operation sub=(a,b)->a-b;
        Operation mul=(a,b)->a*b;
LambdaFunctions temp=new LambdaFunctions();
        System.out.println(temp.opt(5,3,sum));
        System.out.println(temp.opt(5,3,sub));
        System.out.println(temp.opt(5,3,mul));
    }
//    int sum(int a,int b){
//        return a+b;
//    }
    private int opt(int a,int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}
