import java.util.Arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int prefix=0;int suffix=0;int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix<0){
                prefix=0;
            }
            if(suffix<0){
                suffix=0;
            }
            prefix+=nums[i];
            suffix+=nums[nums.length-1-i];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        System.out.println(max);
    }
}
