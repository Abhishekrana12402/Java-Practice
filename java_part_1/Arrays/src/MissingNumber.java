import java.util.Scanner;

public class MissingNumber {
//    public static void main(String[] args) {
//        int[] arr={1,2,4,5};
//        int n=arr.length+1;
//        int sum1=(n*(n+1))/2;
//        int sum2=0;
//        for(int i=0;i<arr.length;i++){
//            sum2+=arr[i];
//        }
//        System.out.println(sum1-sum2);
//    }
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter till which element you want to find missing " );
    int n=in.nextInt();
    int[] arr={1,2,4,5};
    int Xor1=0;
    int Xor2=0;
    for(int i=0;i<n-1;i++){
        Xor1=Xor1^(i+1);
        Xor2=Xor2^arr[i];
    }
    Xor1=Xor1^n;
    System.out.println(Xor1^Xor2);
}
}
