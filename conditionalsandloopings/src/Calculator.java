import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;

        while (true) {
            System.out.println("enter any operator");
            char a = input.next().trim().charAt(0);
            if (a == '+' || a == '-' || a == '%' || a == '/' || a == '*') {
                System.out.println("enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (a == '+') {
                    res = num1 + num2;
                }
                if (a == '-') {
                    res = num1 - num2;
                }
                if (a == '*') {
                    res = num1 * num2;
                }
                if (a == '/') {
                    res = num1 / num2;
                }
                if (a == '%') {
                    res = num1 % num2;
                }} else if (a =='x'||a=='X') {
                    break;
                } else {
                    System.out.println("invalid operation");

            }


            System.out.println(res);
        }
    }
}
