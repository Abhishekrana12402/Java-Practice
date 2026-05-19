import java.util.Scanner;
public class Countnums {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int num= input.nextInt();
        int count=0;int rem;
        while(n>0){
            rem=n%10;
            if(num==rem)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
