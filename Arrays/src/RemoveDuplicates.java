import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
       int[] A={1,2,2,4};
       int i=0;
       for(int j=1;j<A.length;j++){
           if(A[i]!=A[j]){
               A[i+1]=A[j];
               i++;
           }
       }
    }
}
