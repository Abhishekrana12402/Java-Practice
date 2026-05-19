//linear search
import java.util.Scanner;
public class ElementIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter element to be searched");
        int n = in.nextInt();
       int ans= Index(arr, arr.length, n);
        System.out.println(ans);
    }

    public static int Index(int[] arr, int b, int n) {

        for (int i = 0; i < b; i++) {
            if (n == arr[i]) {
             //   System.out.println("Element found at index :");
             //  System.out.println(i);
                return 1;

            }
        }

        //  System.out.println("Element not found");

return -1;
    }
}


