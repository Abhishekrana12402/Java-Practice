import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] a={-13 ,0 ,6 ,15, 16, 2 ,15, -12, 17, -16, 0, -3, 19 ,-3, 2, -9, -6};int k=15;
        System.out.println(longestSubarrayWithSumK(a,k));
    }
    public static int longestSubarrayWithSumK(int []arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();int max=-1;
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<arr.length;i++){

         sum+=arr[i];
         arr[i]=sum;
         if(!map.containsKey(arr[i])) {
             map.put(arr[i], i);
         }
         int num=arr[i]-k;
            if(map.containsKey(num)){
                max=Math.max(max,i-map.get(num));
            }
        }
        return max;
    }
    }


