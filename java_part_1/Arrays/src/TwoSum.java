import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};int target=18;
        System.out.println(Arrays.toString(CallTwoSum(arr,target)));

    }
    static int[] CallTwoSum(int[] nums,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int targetSum = target -nums[i];
            if(map.containsKey(targetSum)){
               return new int[]{map.get(targetSum),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

