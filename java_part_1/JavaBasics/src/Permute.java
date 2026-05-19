import java.util.List;
import java.util.ArrayList;
public class Permute {
    public static void main(String[] args) {
int[] nums={1,2,2};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>ans=new ArrayList<>();
while (true){
    List<Integer>num=new ArrayList<>();

      for(int i=0;i<nums.length;i++){
          num.add(nums[i]);
      }
    if (ans.contains(num)){
        return ans;
    }
    else {
        ans.add(num);
        Permutation(nums);
    }

}

    }
    public static void Permutation(int[] nums){
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(0, nums.length - 1, nums);
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(index + 1, nums.length - 1, nums);
    }


    static void reverse(int start,int end,int[] nums){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}