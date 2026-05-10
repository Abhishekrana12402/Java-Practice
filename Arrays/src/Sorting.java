import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
   /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        BubbleSort(arr, arr.length);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr, int n) {
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
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int[] arr=new int[5];
       for(int i=0;i<arr.length;i++){
           arr[i]=in.nextInt();
       }
       SelectionSort(arr,arr.length);
   }
    static void SelectionSort(int[] arr,int n){int min;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int[] arr={5,4,3,2,1};
       InsertionSort(arr,arr.length);
   }
   static void InsertionSort(int[] arr,int n){
       for(int i=1;i<n;i++) {
           int curr = arr[i];
           int prev = i-1;
           while (prev >= 0&& arr[prev]>curr){
               arr[prev+1]=arr[prev];
               prev--;
           }
           arr[prev+1]=curr;
       }
       System.out.println(Arrays.toString(arr));
   }
   public static void main(String[] args) {
       int[] arr = {5, 5,1,1,2,2,2,3};
       CountingSort(arr, arr.length);
   }
       static void CountingSort(int[] arr,int n){
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++) {
           max = Math.max(max, arr[i]);
       }
       int[] count=new int[max+1];
       for(int i=0;i<arr.length;i++){
           count[arr[i]]++;
       }
       int j=0;
       for(int i=0;i<count.length;i++) {
           while (count[i] > 0) {
               arr[j] = i;
               j++;
               count[i]--;

           }
       }
       System.out.println(Arrays.toString(arr));
   }


   public static void main(String[] args) {
       int[] arr={};
       CyclicSort(arr);
   }
static void CyclicSort(int[] arr){
       int i=0;
           while(i<arr.length){
              int correct =arr[i]-1;
              if(arr[i]!=arr[correct]){
                  int temp=arr[i];
                  arr[i]=arr[correct];
                  arr[correct]=temp;
              }
              else{
                  i++;
              }
           }
    System.out.println(Arrays.toString(arr));
}

    */

}

