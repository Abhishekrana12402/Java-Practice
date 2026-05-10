import java.util.Arrays;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
//        int[] arr={1,2,3,1,1,1,1,4,2,3};
//        int target_sum=2;
//        int max=0;int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=0;
//            for(int j=i;j<arr.length;j++){
//                sum+=arr[j];
//                if(sum==target_sum){
//                    max=Math.max(max,j-i+1);
//                }
//                if(sum>target_sum){
//                    break;
//                }
//            }
//        }
//        System.out.println("Longest SubArray for the target sum "+max);
        int[] arr={1,2,3,1,1,1,1,4,2,3};int max=0;int count=0;
        int sum=arr[0]; int target_sum=6;
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
       // System.out.println(Arrays.toString(arr));
        int i=0;int j=0;
        while(i<=j){
            if(j<arr.length) {
                if (arr[j] - arr[i] > target_sum) {
                    i++;
                } else if (arr[j] - arr[i] == target_sum || arr[j] == target_sum) {
                    max = Math.max(max, j - i);
                    count++;
                }
                else {
                    j++;
                }

            }
            else{
                i++;
            }

        }
        System.out.println(count);
        System.out.println(max);

    }
}
