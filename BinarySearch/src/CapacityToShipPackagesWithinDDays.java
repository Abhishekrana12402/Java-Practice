public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
      int[] weights={1,2,3,1,1};
      int days=4;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
int sum=0;int max=Integer.MIN_VALUE;
for(int i=0;i<weights.length;i++){
    sum+=weights[i];
    max=Math.max(max,weights[i]);
}
int start=max;int end=sum;
while (start<=end){
    int mid=start+(end-start)/2;
    int ans=Check(mid,weights,days);
    if (ans==1){
        end=mid-1;
    }
    else {
        start=mid+1;
    }
}
return start;
    }
    static int Check(int mid,int[] weights,int days){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>mid){
                days--;
                sum=weights[i];
            }
        }
        if(days>0){
            return 1;
        }
        return -1;
    }
}
