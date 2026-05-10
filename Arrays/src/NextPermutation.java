import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2};
        int index = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,arr.length-1);
            return;
        }
        System.out.println(index);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr,index+1,arr.length-1);
    }
        static void reverse(int[] arr,int beg,int end){
            while(beg<=end){
                int temp=arr[beg];
                arr[beg]=arr[end];
                arr[end]=temp;
                beg++;
                end--;
            }
            System.out.println(Arrays.toString(arr));
        }


}
