import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraysWithSumK {
    public static void main(String[] args) {
        int[] arr={1,1,1};int prefix_sum=0;int count=0;int target_sum=2;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(prefix_sum,1);
        for(int i=0;i<arr.length;i++){
            prefix_sum+=arr[i];
            int result_sum=prefix_sum-target_sum;
            if(map.containsKey(result_sum)){
                count+=map.get(result_sum);
            }
                map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        System.out.println(count);
    }
}
