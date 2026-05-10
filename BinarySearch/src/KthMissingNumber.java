public class KthMissingNumber {
    public static void main(String[] args) {
        int[] arr={6,8,9,16};
        int k=6;
        int start=0;int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        System.out.println(start+k);
    }
}
