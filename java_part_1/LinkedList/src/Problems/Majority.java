package Problems;
import java.util.List;
import java.util.ArrayList;

public class Majority {
    public static void main(String[] args) {
        int[] v={2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majorityElement(v));
    }
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        List<Integer> list=new ArrayList<>();
       
        int count1=0,count2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++){
            if(count1==0&&v[i]!=el2){
                el1=v[i];
                count1=1;
            }

            if(count2==0&&v[i]!=el1){
                el2=v[i];
                count2=1;
            }
            else if(v[i]==el1){
                count1++;
            }
            else if(v[i]==el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }

        }
        System.out.println(el1);
        System.out.println(el2);
        count1=0;count2=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==el1){
                count1++;
            }
            else if(v[i]==el2){
                count2++;
            }
            if(count1>Math.floor(v.length/3)){
                list.add(el1);
                count1=0;
            }
           else if(count2>Math.floor(v.length/3)){
                list.add(el2);
               count2=0;
            }


        }
        return list;
    }
}
