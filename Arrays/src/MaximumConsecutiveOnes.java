public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1};
        int max=Integer.MIN_VALUE;int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else {
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        System.out.println(max);
    }
}
