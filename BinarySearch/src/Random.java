public class Random {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};int[] cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int j=0;int i=0;int n=gas.length;int max=Integer.MIN_VALUE;
        for(i=j;i<n;i++){
            int remaining=gas[i]-cost[i];
            if(remaining>max){
                max=remaining;
                j=i;
            }
        }
i=j;
        int reach=gas[j];
        while(true){
            reach=reach-cost[j%n]+gas[(j+1)%n];
            j++;
            if(reach<cost[j%n]){
                return -1;
            }
            if(j%n==i){
                return j%n;
            }
        }



    }
}
