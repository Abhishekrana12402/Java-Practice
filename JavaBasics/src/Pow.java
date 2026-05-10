public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(1.0000000000001, -2147483648));
    }

    public static double myPow(double x, int n) {
        double temp;
        if (n == 0) {
            return 1;
        }
        if (n > 0) {

            if (n % 2 != 0) {
                temp = x * myPow(x, n - 1);
                return temp;
            }
            temp = myPow(x, n / 2);
            return temp * temp;
        } else {
            if (n == Integer.MIN_VALUE) {
                if (x == 1 || x == -1) {
                    return 1;
                }
                //return 0;
                return 1 / (myPow(x, -n-1));
            }
            return 1 / (myPow(x, -n));
        }
    }
}

