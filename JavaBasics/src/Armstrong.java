import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 1000; i++) {
            Arms(i);

        }
    }

    static void Arms(int n) {
        int rem;
        int sum = 0;
        int digit = 0;
        int temp = n;
        while (n > 0) {
            n =n/ 10;
            digit++;
        }
        n=temp;
        while (n > 0) {
            rem = n % 10;

            sum += Math.pow(rem, digit);

            n = n / 10;
        }
            if(temp==sum){
                System.out.println(temp);


            }

        }
    }





