import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotateByK {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int k=2;

        k=(k%nums.length);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(nums[nums.length-i-1]);
        }
        System.out.println(list);
        for(int i= nums.length,j=0;j< nums.length-k;i--,j++){
            nums[i-1]=nums[i-k-1];
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<k;i++){
            nums[i]=list.get(k-1-i);
        }
        System.out.println(Arrays.toString(nums));
    }
    }

