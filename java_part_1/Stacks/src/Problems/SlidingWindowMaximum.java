package Problems;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
      int[]  nums = {1,-1};
      int k=1;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

    }
    public  static int[] maxSlidingWindow(int[] nums, int k) {
        int index=0;int max=Integer.MIN_VALUE;
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if (i<k){
                max=Math.max(max,nums[i]);
                if(i==k-1){
                    ans[index++] = max;
                }
            }

            else {
                max = Math.max(max, nums[i]);
                ans[index++] = max;

            }
        }

        return ans;
    }
}
