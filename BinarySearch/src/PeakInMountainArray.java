public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
int start=0;int end=arr.length-1;
int mid=-1;
while(start<end) {
mid=start+(end-start)/2;
if (arr[mid]>arr[mid+1]){
    end=mid;
}
else{
    start=mid+1;
}
}
        System.out.println(end);
    }
}
