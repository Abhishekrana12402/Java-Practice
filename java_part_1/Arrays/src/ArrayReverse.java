import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void Reverse(int[] arr){
       int start=0;
       int end=arr.length-1;
       while(start<end){
           Swap(arr,start,end);
           start++;
           end--;
       }
        }
    static void Swap(int[] arr,int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    }


/*public class ArrayReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Reverse(arr, arr.length);



    }

    static void Reverse(int[] arr, int n) {
        int j = n;
        int[] b = new int[5];
        for (int i = 0; i < n; i++) {
            b[j - 1] = arr[i];
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+" ");
        }
    }

}*/

