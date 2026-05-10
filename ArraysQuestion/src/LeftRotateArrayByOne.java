import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=arr[0];
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
