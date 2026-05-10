import java.util.Arrays;

public class SortArrayOfZerosOnesAndTwos {
    public static void main(String[] args) {
        int[] nums = {2, 0,1};
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (nums[mid] == 0) {
                Swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }
            else {
                Swap(nums,mid,high);
                high--;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
        static void Swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }

}
