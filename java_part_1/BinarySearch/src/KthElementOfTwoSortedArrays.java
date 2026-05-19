public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {5,5 ,8 ,8 ,8 ,9 ,11, 11, 11, 11, 11};
        int[] arr2 = {4,4 ,4 ,4 ,6 ,8, 9, 9, 9 ,11, 13};
        int k = 2;
        System.out.println(kthElement(arr1,arr2,arr1.length,arr2.length,k));
    }

    public static long kthElement(int nums1[], int nums2[], int n, int m, int k) {
//int count=0;
//int i=0;int j=0;
//while (i<arr1.length&&j<arr2.length) {
//    if (arr1[i] <= arr2[j]) {
//        i++;
//        count++;
//        if (count == k) {
//            return arr1[i-1];
//        }
//    } else {
//        j++;
//        count++;
//        if (count == k) {
//            return arr2[j-1];
//        }
//    }
//}
//   while (i<arr1.length){
//       count++;
//       if(count==k){
//           return arr1[i-1];
//       }
//       i++;
//   }
//    while (j<arr2.length){
//        count++;
//        if(count==k){
//            return arr1[i-1];
//        }
//        j++;
//    }
//
//        return 0;

        if(n>m){
            return kthElement(nums2,nums1,m,n,k);
            //Swap array in order to perform binary search in shorter array to decrease complexity
        }
        int a=n+m;
        int left=k;int low=Math.max(0,k-m);int high=Math.min(k,n);
        while (low<=high){
            int left1=Integer.MIN_VALUE;int left2=Integer.MIN_VALUE;
            int right1=Integer.MAX_VALUE;int right2=Integer.MAX_VALUE;
            int mid1=(low+high)>>1;
            int mid2=left-mid1;
            if(mid1<m){
                right1=nums1[mid1];
            }
            if (mid2<n){
                right2=nums2[mid2];
            }
            if (mid1-1>=0){
                left1=nums1[mid1-1];
            }
            if(mid2-1>=0){
                left2=nums2[mid2-1];
            }
            if (left1<=right2&&left2<=right1){
                    return Math.max(left1,left2);
            }
            if(left2>right1){
                low=mid1+1;
            }
            else {
                high=mid1-1;
            }
        }
        return 0;
   }
}
