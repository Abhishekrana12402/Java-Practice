import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }


            Swap(arr, arr[3], arr[1]);
        }

     static void Swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[3];
        arr[3] = arr[1];
        arr[1] = temp;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}


