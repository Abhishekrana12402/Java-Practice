import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
      int[]  nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int curr=nums[0];int count=0;int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curr){
                continue;

            }
            else{
                curr=nums[i];
                nums[++index]=curr;
                count++;
            }


        }
        return count+1;
    }
}
