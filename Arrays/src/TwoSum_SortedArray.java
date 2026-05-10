import java.util.*;

public class TwoSum_SortedArray {
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        System.out.println(Arrays.toString(twoSum(numbers, -1)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>map=new HashMap<>();int value=0;
        for(int i=0;i<numbers.length;i++){
            if(!map.containsKey(numbers[i])) {
                map.put(numbers[i], i);
            }
        }
        int start=0;int end=numbers.length-1;int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;

            int number=target-numbers[mid];
            if(map.containsKey(number)&&number!=numbers[mid]){
                value=map.get(target-numbers[mid]);
              return new int[]{Math.min(value+1,mid+1),Math.max(value+1,mid+1)};

            }
            else if(numbers[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return new int[]{-1,-1};

    }
}
