import java.util.Arrays;
import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        int k=in.nextInt();
        int[] arr={1,2,3,4,5,6,7};
         k=k%arr.length;
        int j=0;
        for(int i=k;i<arr.length;i++){
            arr[j]=arr[i]*10+arr[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=j,l=0;i<arr.length;i++,l++){
           arr[i]=(arr[l]%10)*10+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
