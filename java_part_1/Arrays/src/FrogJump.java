public class FrogJump {
    public static void main(String[] args) {
        int[] nums={5,9,3,2,1,0,2,3,3,1,0,0};
        if(nums[0]==0||nums.length==1){
            System.out.println(0);
            return;
        }
        int step=nums[0];
        int MaxReach=nums[0];
        int jump=0;int temp=0;int index=-1;
        int i=1;int j=nums.length-1;
        while(i<=j){
            while(step!=0){
                if(i<=nums.length-1&&nums[i]+i>=MaxReach){
                    MaxReach=nums[i]+i;
                    temp=nums[i];
                    index=i;
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
                i=index+1;
            }
        }
        System.out.println(jump);
    }
}
