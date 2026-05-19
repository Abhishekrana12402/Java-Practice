import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums={1,2,0,1};
        Arrays.sort(nums);
        int count=0;int longest=0;int left_smaller=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==left_smaller){
                left_smaller=nums[i];
                count+=1;
            }
            else if(nums[i]==left_smaller);

            else{
                left_smaller=nums[i];
                count=1;
            }
            longest=Math.max(longest,count);
        }
        System.out.println(longest);
    }
}
