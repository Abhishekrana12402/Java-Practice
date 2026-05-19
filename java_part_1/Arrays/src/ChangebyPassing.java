import java.util.Arrays;
import java.util.Scanner;
public class ChangebyPassing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
      Random(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void Random(int[] arr){
        arr[0]=99;

    }
}
