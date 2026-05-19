import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,1};
       // int[] arr={1,0,2,3,2,0,0,4,5,1};
//        int j=-1;
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] == 0) {
//                j = i;
//                break;
//            }
//        }
//        for(int i=j+1;i<arr.length;i++){
//            if(arr[i]!=0){
//                arr[j]=arr[i];
//                arr[i]=0;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
