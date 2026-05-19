import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
       int[] nums1 = {0};int m = 0;int[] nums2 = {1};int n = 1;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int gap = (int)Math.ceil((m + n) / 2.0);

        for(int i=m,j=0;i<nums1.length;i++,j++){
            nums1[i]=nums2[j];
        }
        if (m==0){
            return;
        }
        int left=0;
        int right=gap;
        while(gap>0){
            if(nums1[left]>nums1[right]){
                int temp=nums1[left];
                nums1[left]=nums1[right];
                nums1[right]=temp;
            }
            left++;
            right++;
            if(right>=nums1.length){
                if(gap==1){
                    return;
                }
                left=0;
                gap=(int)Math.ceil(gap/2.0);

                right=gap;

            }



        }
    }
}
