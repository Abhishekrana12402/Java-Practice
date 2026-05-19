import java.util.Map;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-2};
       // int[] arr={-1,-2,-3};
        int sum=0;int max=0;int max2=Integer.MIN_VALUE;int start=-1;int end=-1;
        for(int i=0;i<arr.length;i++){
            if(sum<0){
                sum=0;
            }
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>max) {
               max=sum;
                end=i;
            }
        }
        if(sum<0){
            System.out.println(max2);
        }else {
            System.out.println(max);
        }
        System.out.println("Starting index is "+start);
        System.out.print("Ending Index is "+end);
    }
}
