public class PredictTheWinner {
    public static void main(String[] args) {
        int[] nums={1,5,233,7};
        System.out.println(predictTheWinner(nums));
    }
    public static boolean predictTheWinner(int[] nums) {
 return Helper(0,0,0,nums.length-1,nums,0);
    }

static boolean Helper(int player1,int player2,int start,int end,int[] nums,int count){
        if(start>end){
            return player1>player2;
        }
        if(count%2==0){
            if(nums[start]>nums[end]){
                player1+=nums[start];
                start++;
            }
            else {
                player1+=nums[end];
                end--;
            }
        }
        else {
            if(nums[start]>nums[end]){
                player2+=nums[start];
                start++;
            }
            else {
                player2+=nums[end];
                end--;
            }
        }
        count++;

        return Helper(player1,player2,start,end,nums,count);

}
}
