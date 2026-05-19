import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
       int[] nums = {100,4,200,1,3,2,5};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
Set<Integer> set=new HashSet<>();
for(int i=0;i<nums.length;i++){
    set.add(nums[i]);
}

int max=1;int count=0;
for(int num:set) {
    if (!set.contains(num - 1)) {
        int currentNum=num;
        count = 1;
        while (set.contains(currentNum+1)) {

            currentNum++;
            count++;

        }
        max = Math.max(count, max);

    }
}
        System.out.println(set);
return max;
    }
}
