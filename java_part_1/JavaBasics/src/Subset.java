import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Subset {
    public static void main(String[] args) {
      int[]arr=  {1, 2, 2};


        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] arr)
    {
        //code here

        List<List<Integer>>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        return Helper(list,arr,0,list1);

    }
    static List<List<Integer>>Helper(List<List<Integer>>list,int[] arr,int index,List<Integer>list1){
       if(index==arr.length){

           List<Integer> newList = new ArrayList<>(list1);
           if(!list.contains(newList)) {
               list.add(newList);
           }
return list;
       }
        int el=arr[index];
        list1.add(el);
          Helper(list,arr,index+1,list1);

        list1.remove(list1.size()-1);
       return Helper(list,arr,index+1,list1);



    }
}
