import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 1; i < 5; i++) {
            arr[i] = in.nextInt();
        }
            MaxValue(arr);
        }
        static void MaxValue(int[] arr){
        int max=arr[0];
        for (int i = 1; i < 5; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max number in the given array is : "+ max);
    }
}
