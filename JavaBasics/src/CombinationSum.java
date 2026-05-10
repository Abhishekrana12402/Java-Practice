import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombinationSum {
    public static void main(String[] args) {
        int N = 4;int B=16;
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,2,6, 5));
        System.out.println(combinationSum(numbers,B));
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        // add your code here
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();
        return Helper(A, B, ans, innerList,0,0);
    }
//2,5,6,7
    static ArrayList<ArrayList<Integer>>Helper(ArrayList<Integer>A,int target,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>innerList,int sum,int index){
       if(sum==target){
           ans.add(innerList);
           return ans;
       }
       if (index==A.size()){
           return ans;
       }
        for( int i=index;index<A.size()&&sum<target;i++){
            innerList.add(A.get(i));
          Helper(A,target,ans,innerList,sum+A.get(i),index);
            index+=1;

            innerList.remove(innerList.size()-1);
        }

        return Helper(A,target,ans,innerList,sum-innerList.get(innerList.size()-1),index+1);
    }
}
