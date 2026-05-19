import java.util.List;
import java.util.ArrayList;
class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        Helper(list,inner,candidates,target,0,0);
        return list;
    }
   static void Helper(List<List<Integer>> list,List<Integer> inner,int[] candidates,int target,int currSum,int index){
        if(currSum==target){
            List<Integer> temp=new ArrayList<>(inner);
            list.add(temp);
            return;
        }
        if(currSum>target){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            inner.add(candidates[i]);
            Helper(list,inner,candidates,target,currSum+candidates[i],i);
            inner.remove(inner.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};int target = 7;
        System.out.println(combinationSum(candidates,target));
    }
}