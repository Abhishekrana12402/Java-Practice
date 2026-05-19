public class MinimumDaysToFormMBouquets {
    public static void main(String[] args) {
int[] bloomDay={1,10,3,10,2};
int m=3;int k=1;
        System.out.println(minDays(bloomDay,m,k));
    }
    public static int minDays(int[] bloomDay, int m, int k){
        int low=bloomDay[0];int high=bloomDay[0];
        if(m*k>bloomDay.length){
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        System.out.println(low+" "+high);
        int temp=-1;
        while (low <= high) {
          int mid=low+(high-low)/2;
        int ans= Check(mid,bloomDay,m,k);
            if(ans==1){
                temp=mid;
                high=mid-1;
            } else if (ans==2) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return temp;
    }
    static int Check(int mid,int[] bloomDay,int m,int k){
        int count=k;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count--;
                if(count==0){
                    count=k;
                    m--;
                }
            }


            else {
                count=k;
            }
        }
        if(m<=0){
            return 1;
        }
        if(m>0){
            return 2;
        }
        return -1;

    }
}
