public class SecondLargest {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,6};
        int largest=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }int SecondLargest=-1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]!=largest&&arr[i]>SecondLargest){
              SecondLargest=arr[i];
          }
        }
        System.out.println(SecondLargest);
    }
}
