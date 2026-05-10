import java.util.Arrays;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] histogram={2,1,5,6,2,3,1};
        int[] leftsmall=new int[histogram.length];
        int n=histogram.length;
        int[] rightsmall=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<histogram.length;i++){
           while(!stack.isEmpty()&&histogram[stack.peek()]>=histogram[i]){
               stack.pop();
           }

           if(stack.isEmpty()){
               leftsmall[i]=0;
           }
           else {
               leftsmall[i]=stack.peek()+1;
           }
           stack.push(i);
        }
        System.out.println(Arrays.toString(leftsmall));
        while (!stack.isEmpty()){
            stack.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&histogram[stack.peek()]>=histogram[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rightsmall[i]=n-1;
            }
            else {
                rightsmall[i]=stack.peek()-1;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(rightsmall));
        int Max_Area=Integer.MIN_VALUE;
for (int i=0;i<n;i++){
   Max_Area=Math.max(Max_Area,(rightsmall[i]- leftsmall[i]+1)*histogram[i]);

}
        System.out.println(Max_Area);
    }
}
