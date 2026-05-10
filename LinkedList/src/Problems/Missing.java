package Problems;

import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {
        int[]arr={3,24, 22, 7, 10 ,34, 27, 29, 13, 2, 11, 23, 9 ,26 ,32 ,12 ,1 ,14, 4, 8 ,6, 19, 17, 15, 30, 28, 20, 31, 5 ,16, 25, 18, 9 ,33};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }
  static   int[] findTwoElement(int arr[], int n) {
        // code here
        int count=0;
        while(count<arr.length){
            int correct=arr[count]-1;
            if(count!=correct&&arr[correct]==arr[count]){
                return new int[]{arr[correct],count+1};
            }
            else if(arr[correct]!=arr[count]){
                int temp=arr[correct];
                arr[correct]=arr[count];
                arr[count]=temp;
            }
            else{
                count++;
            }
            int[] temp=arr;
        }
        return new int[]{-1,-1};
    }
}
