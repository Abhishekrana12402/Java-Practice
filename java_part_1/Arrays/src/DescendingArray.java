import java.util.Scanner;
import java.util.Arrays;
public class DescendingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
               for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
        }
            Descending(arr, arr.length);
        System.out.println("Sorted array is :");
            System.out.println(Arrays.toString(arr));
        }
    static void Descending(int[] arr, int n) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j< arr.length-1-i; j++) {
                if(arr[j] >arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }

        }
    }
}

