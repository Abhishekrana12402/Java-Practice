public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3};int h=4;
        System.out.println(minEatingSpeed(piles,h));

    }
      static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int temp=-1;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
          System.out.println(max);
        int low =0;int high=max;
        if(h==piles.length){
            return max;
        }
        while (low<=high){
            int mid= low+(high-low)/2;
            int ans=Check(piles,mid);
            if(ans<=h){
                temp=mid;
            }
             if(ans>h){
               low=mid+1;
            }
            else {
               high=mid-1;
            }
        }
        return temp;
      }
      static int Check(int[] piles,int mid){
        int count=0;
        for(int i=0;i<piles.length;i++){

            count=count+Math.ceilDiv(piles[i],mid);
        }
        return count;
      }
}

