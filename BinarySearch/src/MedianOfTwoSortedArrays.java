public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,3};int[] nums2={4,5};
        //System.out.println(findMedianSortedArrays(nums1,nums2));
        System.out.println(findMedianSortedArraysAnotherMethod(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;int count=0;int index2=n/2;
        int index1=n/2-1;int i=0;int j=0;int el1=-1;int el2=-1;
        while (i<nums1.length&&j<nums2.length){
           if(nums1[i]<=nums2[j]){
               if(count==index1){
                   el1=nums1[i];
               }
               if (count==index2){
                   el2=nums1[i];
               }
               count++;
               i++;
           }
           else {
               if(count==index1){
                   el1=nums2[j];
               }
               if (count==index2){
                   el2=nums2[j];
               }
               count++;
               j++;
           }
        }
while (i<nums1.length){
    if(count==index1){
        el1=nums1[i];
    }
    if (count==index2){
        el2=nums1[i];
    }
    count++;
    i++;
}
while (j<nums2.length){
    if(count==index1){
        el1=nums2[j];
    }
    if (count==index2){
        el2=nums2[j];
    }
    count++;
    j++;
}
if(n%2==1){
    return el2;
}
return (el1+el2)/2.0;
    }
    public static double findMedianSortedArraysAnotherMethod(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2){
            return findMedianSortedArraysAnotherMethod(nums2,nums1);
            //Swap array in order to perform binary search in shorter array to decrease complexity
        }
        int n=n1+n2;
        int left=(n1+n2+1)/2;int low=0;int high=n1;
        while (low<=high){
            int left1=Integer.MIN_VALUE;int left2=Integer.MIN_VALUE;
            int right1=Integer.MAX_VALUE;int right2=Integer.MAX_VALUE;
            int mid1=(low+high)>>1;
            int mid2=left-mid1;
            if(mid1<n1){
                right1=nums1[mid1];
            }
            if (mid2<n2){
                right2=nums2[mid2];
            }
            if (mid1-1>=0){
                left1=nums1[mid1-1];
            }
            if(mid2-1>=0){
                left2=nums2[mid2-1];
            }
            if (left1<=right2&&left2<=right1){
                if (n % 2 == 1) {
                    return Math.max(left1,left2);
                }
                return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
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
