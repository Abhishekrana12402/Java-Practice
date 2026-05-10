import java.util.Arrays;

public class MaximumProfitStocks {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int[] nums=new int[prices.length];int maximum=0;
        int minimum=prices[0];
        for(int i=0;i<prices.length;i++){
            minimum=Math.min(prices[i],minimum);
            nums[i]=minimum;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<prices.length;i++){
            maximum=Math.max(maximum,prices[i]-nums[i]);
        }
        System.out.println(maximum);
    }
}
