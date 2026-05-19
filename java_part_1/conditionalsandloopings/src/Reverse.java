
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rem;
        int temp = n;

        int num = 0;
        while (n > 0) {
            rem = n % 10;

            num = num * 10 + rem;
            n = n / 10;


            }
            System.out.println(num);
            if (num == temp) {
                System.out.println("number is  palindrome");}
                else{
                    System.out.println("not palindrome");
                }



        }
    }