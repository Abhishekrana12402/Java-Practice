package Problems;

import java.util.Arrays;

public class TwoStackGame {
    static int TwoStackGames(int x,int[]a ,int[]b ){
        return twostacks(x,a,b,0,0)-1;
        //here we return count-1 because after increasing the count value it had violet the rule i.e. sum>x and hence we will again reduce the count by 1
    }
    private static int twostacks(int x,int[] a,int[] b,int sum,int count){
if(sum>x){
    return count;
}
if(a.length==0||b.length==0){
    return count;
    //any of the stack becomes empty just return the count
}
int ans1=twostacks(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2=twostacks(x, a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
        return Math.max(ans1,ans2);
    }

    public static void main(String[] args) {
int x=8;
int[] a={4,2,6};
int[] b={2,1,8,5};
        System.out.println(TwoStackGames(x,a,b));
    }

}
