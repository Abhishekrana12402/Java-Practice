import java.util.Scanner;
import java.util.Arrays;
public class Main {
   /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[8];
        int[] temp = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= a.length; i++) {
            for (int j = i; j <= a.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
        int sum = 0;int count=0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = i; j < temp.length; j++) {

                sum += a[j];

                if(sum==7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
   public static void main(String[] args) {
       int[] arr={1,-4,3,2,1};int CurrSum=Integer.MIN_VALUE;int sum=0;
       for(int i=0;i<arr.length;i++){
           sum=0;
           for(int j=i;j<arr.length;j++){
               sum+=arr[j];
              CurrSum=Math.max(CurrSum,sum);
           }
       }
       System.out.println(CurrSum);
   }
   public static void main(String[] args) {
       int[] arr={1,-4,3,2,1};
       int n= arr.length;
       Kadanes(arr,n);
   }
   static void Kadanes(int[] arr, int n){
       int sum=0;int CurrSum=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          if(sum<0){
              sum=0;
          }
          CurrSum=Math.max(CurrSum,sum);
      }
       System.out.println(sum);
   }
   public static void main(String[] args) {
       int[] arr={4,-4,6,6,-10,11,12};
       int WrapSum;
       int TotalSum=0;
       for(int i=0;i<arr.length;i++){
           TotalSum+=arr[i];
           arr[i]=-arr[i];
       }
       System.out.println(TotalSum);
       int sum=0;int CurrSum=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++) {
           sum += arr[i];
           if (sum < 0) {
               sum = 0;
           }
           CurrSum = Math.max(CurrSum, sum);
       }
           System.out.println(CurrSum);
       WrapSum=TotalSum+CurrSum;
       System.out.println(WrapSum);
       //System.out.println(Math.max(WrapSum,CurrSum));
   }
   public static void main(String[] args) {
       int[] arr={1,3,5,2,2};
       int start=0;int end=arr.length-1;int SumA=0;int SumB=0;
       while(start<=end){
          if(arr[start]>arr[end]){
              SumB+=arr[end];
              end--;
          }
          else if(arr[end]>arr[start]){
              SumA+=arr[start];
              start++;
          }
          if(arr[start]==arr[end]){
              System.out.println(start);
              return;
          }
       }
   }*/
   public static void main(String[] args) {
       int[] arr = {100, 180, 260, 310, 40, 535, 695};
       int Max = Integer.MIN_VALUE;
       int[] temp = new int[arr.length];
       int count = 0;
       for (int i = 0; i < arr.length; i++) {
           Max = Math.max(arr[i], Max);
           temp[i] = Max;
       }
           System.out.println(Arrays.toString(temp));
           System.out.println(Arrays.toString(arr));
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] != temp[i]) {
                   count++;
                   if (count >= 2) {
                       System.out.println(temp[i]);
                   }
                   System.out.println(arr[i]);
               }
                   if (i == arr.length - 1) {
                       System.out.println(temp[arr.length - 1]);
                   }
           }
       }
   }
