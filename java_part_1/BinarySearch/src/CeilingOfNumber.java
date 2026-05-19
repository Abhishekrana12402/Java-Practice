public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,9,14,16,18};
        int target=2;
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(start);
    }
}
