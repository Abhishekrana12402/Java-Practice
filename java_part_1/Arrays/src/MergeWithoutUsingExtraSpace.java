import java.util.Arrays;

public class MergeWithoutUsingExtraSpace {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};
//        int left=arr1.length-1;
//        int right=0;
//        while (left>=0&&right<arr2.length){
//            if(arr1[left]>arr2[right]){
//                int temp=arr1[left];
//                arr1[left]=arr2[right];
//                arr2[right]=temp;
//            }
//            left--;
//            right++;
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
       int m=arr1.length;
       int n=arr2.length;
       int total=m+n;
       int gap=total/2+total%2;
       while (true) {
           int left = 0;
           int right = left + gap;
           while (right < total) {

               if (left < m && right >= m) {
Swap(arr1,arr2,left,right-m);
               } else if (left <= m && right <= m) {
                   Swap(arr1,arr1,left,right);
               } else {
                   Swap(arr2,arr2,left-m,right-m);
               }
               left++;
               right++;
           }
           if(gap==1){
               break;
           }
           gap=gap/2+gap%2;
       }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }
    static void Swap(int[] arr1,int[] arr2,int left,int right){
if(arr1[left]<arr2[right]){
    return;
}
    int temp=arr1[left];
arr1[left]=arr2[right];
arr2[right]=temp;
    }
}
