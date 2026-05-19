import java.util.List;
import java.util.ArrayList;
public class NewProb {
    public static void main(String[] args) {
        long[]arr={1,0};
        System.out.println(equilibriumPoint(arr,arr.length));
        long temp= 1000000000+1000000000+1000000000+1000000000;
        System.out.println(temp);
    }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(arr.length==1){
            return 1;
        }
        int left=0;long leftsum=arr[0];long rightsum=arr[n-1];
        int right=arr.length-1;
        while(left<right){
            if(leftsum<rightsum){
                left++;
                leftsum+=arr[left];
            }
            else if(rightsum<leftsum){
                right--;
                rightsum+=arr[right];
            }
            else if(rightsum==leftsum) {
                left++;
                right--;
                leftsum+=arr[left];
                rightsum+=arr[right];



            }
            if(left==right&&leftsum==rightsum){
                return left+1;
            }
        }
        return -1;
    }
}
