package Problems;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
       int  N = 3;
      int [][]  M = {{0 ,1 ,0},
            {0 ,0 ,0,},
            {1 ,0, 0}};
        System.out.println(celebrity(M,N));
    }
    static int celebrity(int M[][], int n)
    {
        // code here
        int count=0;int celebrity=0;
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(M[i][j]==1){
                    stack.push(j);
                }
                else {
                    count++;
                }
            }
            if(count==n){
              celebrity=i;
            }
            count=0;
        }
        if(stack.isEmpty()){
            return -1;
        }

        while (!stack.isEmpty()){
            if (celebrity==stack.pop()){
              count++;
            }
        }
        if(count==n-1){
            return celebrity;
        }
return -1;
    }
}
