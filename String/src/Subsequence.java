import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array
        int MOD = 1000000007;
        int left = 0, right = nums.length - 1;
        int count = 0;

        // Precompute powers of 2 up to nums.length
        int[] powerOfTwo = new int[nums.length];
        powerOfTwo[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            powerOfTwo[i] = (powerOfTwo[i-1] * 2) % MOD;
        }
        System.out.println(Arrays.toString(powerOfTwo));
        // Step 2: Use two-pointer technique to count valid subsequences
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                // All subsequences formed with nums[left] to nums[right] are valid
                count = (count + powerOfTwo[right - left]) % MOD;
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }

        return count;

    }
    public static void main(String[] args) {
       int[] nums = {3,5,6,7,10,12};
        System.out.println(numSubseq(nums,9));
    }
}
