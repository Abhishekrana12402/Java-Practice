public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int[] nums={3,4,3,2,5,4,3};

        int step=nums[0];
        int MaxReach=nums[0];
        int jump=0;int temp=0;
        int i=1;int j=nums.length-1;
        while(i<=j){
            while(step!=0){
                if(i<=nums.length-1&&nums[i]+i>=MaxReach){
                    MaxReach=nums[i]+i;
                    temp=nums[i];
                }
                step--;

                if(i== nums.length-1){
                    System.out.println(jump+1);
                    return;
                }
                i++;
            }

            if(step==0){
                step=temp;
                jump++;
            }
        }
    }
}
