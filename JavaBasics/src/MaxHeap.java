public class MaxHeap {
    public static void main(String[] args) {
        int n = 6;
       int[] arr= {9, 15, 10, 7, 12, 11};
        System.out.println(Ans(arr,n));
    }
    static int Ans(int[] arr,int n){
        for(int i=0;i<n/2;i++){
            if(2*i+1<n&&arr[2*i+1]>arr[i]){
                return 0;
            }
            if(2*i+2<n&&arr[2*i+2]>arr[i]){
                return 0;
            }
        }
        return 1;

    }
}
