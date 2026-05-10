import java.util.Arrays;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,4};int count=0;
//       while (count< arr.length){
//           int correct=arr[count]-1;
//           if(arr[count]!=arr[correct]){
//               int temp=arr[count];
//               arr[count]=arr[correct];
//               arr[correct]=temp;
//           }
//           else {
//               count++;
//           }
//       }
//       for(int i=0;i<arr.length;i++){
//           if(arr[i]!=i+1){
//               int[] ans=new int[]{arr[i],i+1};
//               System.out.println(Arrays.toString(ans));
//               return;
//           }
//       }
//        System.out.println(Arrays.toString(arr));

        long n=arr.length;
        long s1n=(n*(n+1))/2;
        long s2n=(n*(n+1)*2*n+1)/6;
        long s1=0;
        long s2=0;
        for(int i=0;i<arr.length;i++){
           s1+=arr[i];
           s2+=arr[i]*arr[i];
        }
        long val1=s1-s1n;
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        long[] ans=new long[]{x,y};
        System.out.println(Arrays.toString(ans));
    }


}
