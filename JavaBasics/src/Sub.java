import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sub {
    public static void main(String[] args) {
       int[] arr={1,2,3};
       List<Integer>list=new ArrayList<>();
       List<List<Integer>>ans=new ArrayList<>();
      ans=Solve(arr,list,ans,0);

        System.out.println(ans);
    }
    static List<List<Integer>>Solve(int[] arr,List<Integer>list,List<List<Integer>>ans,int index){
       if (index==arr.length){
           ans.add(new ArrayList<>(list));
           return ans;
       }
        list.add(arr[index]);
       Solve(arr,list,ans,index+1);
list.remove(list.size()-1);
       return Solve(arr,list,ans,index+1);
    }

}
