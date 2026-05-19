import java.util.Arrays;

public class CountInversions {
    public static void main(String[] args) {
        long[] arr={2,4,1,3,5};
        System.out.println(MergeSort(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));

    }
    static long MergeSort(long[] arr,long start,long end){
        long mid=start+(end-start)/2;
        int count=0;
        if(start>=end){
            return count;
        }
        count+=MergeSort(arr,start,mid);
       count+=MergeSort(arr,mid+1, end);
       return count+=Merge(arr,start,mid,end);
//        return count;
    }
    static long Merge(long[] arr,long start,long mid,long end){
        long count=0;
        long[] temp=new long[(int) (end-start+1)];int k=0;
        long left=start;long right=mid+1;
        while (left<=mid&&right<=end){
            if(arr[(int) left]<arr[(int) right]){
                temp[k++]=arr[(int) left];
                left++;
            }
            else{
                temp[k++]=arr[(int) right];
                right++;
                count+=mid-left+1;
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
}
