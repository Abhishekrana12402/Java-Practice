package Problems;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
int FastPointer=n;
int SlowPointer=n;
do{
   SlowPointer=findSquares(SlowPointer);
   FastPointer=findSquares(findSquares(FastPointer));
}
while (SlowPointer!=FastPointer);{
            if (SlowPointer == 1 || FastPointer == 1) {
                return true;
            }
        }
        return false;
    }
    public static int findSquares(int number){
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum+=rem*rem;
            number/=10;
        }
        return sum;
    }
}
