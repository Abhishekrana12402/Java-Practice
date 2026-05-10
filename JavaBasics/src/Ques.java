public class Ques {
    public static void main(String[] args) {
        double x = 2;int n =10;
        System.out.println(myPow(x,n));
      char ch=(char)('a'+0);
        System.out.println(ch);
    }
    public static double myPow(double x, int n) {

        if(n==0){
            return 1;
        }
        if(n<0){
            return 1/x*(myPow(x,n+1));
        }
        else {
            if (n % 2 == 0) {
                double temp = myPow(x, n / 2);
                return temp * temp;
            }
            return x * myPow(x, n - 1);
        }
    }
}
