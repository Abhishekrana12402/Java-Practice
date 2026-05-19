import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0;int b=1;int sum;int num=0;
        int n=input.nextInt();
        for(num=0;num<=n;num++) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;




        }




    }
}
