import java.util.Scanner;

public class Patterns {
    /*
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <=2*n; i++) {
            if(i>=n){
                for (int j = 0; j <=2* n-i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int row=0;row<=2*n;row++) {
            int Totalcol=row>n? 2*n-row:row;
            int TotalSpace=n-Totalcol;
            for (int space = 0; space <= TotalSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= Totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n-i;j++){
                System.out.print("  ");
        }
            int Totalcol = 2 * i + 1;
            for (int j = 0; j < Totalcol; j++) {
                if (j < i) {
                    System.out.print((i-j+1)+" ");
                } else {
                    System.out.print((j-i+1)+" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int og=n;
        n=2*n;
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <=n; j++) {
                int AtEveryIndex=og-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(AtEveryIndex+" ");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println(Prime(5));
    }
    static boolean Prime(int n){
        if(n<=1){
            return false;

        }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
   return true; }

     */
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n){
        for(int i=0;i<2*n;i++){
            int totalspace=i<=n? n-i-1:i-n;
            for(int j=0;j<totalspace;j++){
                System.out.print(" ");
            }
            int totalcol= i<n? i+1:2*n-i;
            for(int j=0;j<totalcol;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}






