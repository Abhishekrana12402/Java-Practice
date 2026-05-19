import java.util.Arrays;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(MergeSort(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));

    }
    static int  MergeSort(int[] arr,int start,int end){
        int mid=start+(end-start)/2;
        int count=0;
        if(start>=end){
            return count;
        }
        count+=MergeSort(arr,start,mid);
        count+=MergeSort(arr,mid+1, end);
        return count+=Merge(arr,start,mid,end);

    }
    static long Merge(int[] arr,int start,int mid,int end){
        int count=0;
        int[] temp=new int[(end-start+1)];int k=0;
        int left=start;int right=mid+1;
        count=CalculateCount(arr,start,mid,end);
        while (left<=mid&&right<=end){
            if(arr[(int) left]<arr[(int) right]){
                temp[k++]=arr[(int) left];
                left++;
            }
            else{
                temp[k++]=arr[(int) right];
                right++;

               }
            }

        while(left<=mid){
            temp[k++]=arr[(int) left++];
        }
        while(right<=end){
            temp[k++]=arr[(int) right++];
        }

        for(long i=start, j=0;j<temp.length;i++,j++){
            arr[(int) i]=temp[(int) j];
        }
        return count;
    }
    static int CalculateCount(int[] arr,int start,int mid,int end) {
        int count=0; int right=mid+1;
        for(int i=start;i<=mid;i++){
            while (right<=end&&arr[i] > 2 * (long)arr[right]) {
                right++;
            }
            count+=right-(mid+1);

        }
        return count;
    }
}
