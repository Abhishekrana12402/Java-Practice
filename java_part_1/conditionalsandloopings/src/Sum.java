import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       /* int n=in.nextInt();int num=2;int sum=0;int a=0;int b=1;
        System.out.println(a);
        System.out.println(b);
        while(num<n){
             sum=a+b;
            System.out.println(sum);
             a=b;
             b=sum;
             num++;


        }
       // System.out.println(sum);
    }
}*/
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

            System.out.println("Sum of  numbers are: "+sum);

    }
}