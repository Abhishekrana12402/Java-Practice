import java.util.Arrays;
import java.util.EnumSet;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] nums={0,1,2};
        Arrays.sort(nums);

        int target=3;
        int temp=Integer.MAX_VALUE;int min=0;
        for(int i=0;i<nums.length;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
if(sum<target){
    j++;
}
else if(sum>target){
    k--;
}
else if(sum==target){
    System.out.println(sum);
    return;
}

int closest=Math.abs(target-sum);
if(closest<temp) {
    temp = closest;
    min = sum;
}
            }
        }
        System.out.println(min);
    }
}
