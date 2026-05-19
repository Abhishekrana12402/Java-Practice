import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
       int min_index=0;
       int max_index=arr.length-1;
       int max=arr[arr.length-1]+1;
       for(int i=0;i<arr.length;i++){

           if(i%2==0){
               arr[i]=(arr[max_index]%max)*max+arr[i];
               max_index--;
           }
           else {
               arr[i]=(arr[min_index]%max)*max+arr[i];
               min_index++;
           }
       }
       for (int i=0;i<arr.length;i++){
           arr[i]/=max;
       }
        System.out.println(Arrays.toString(arr));
    }
}
