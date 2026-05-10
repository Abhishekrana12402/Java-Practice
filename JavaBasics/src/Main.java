import org.w3c.dom.Node;

import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        float r=in.nextFloat();
        float area=3.14f*r*r;
        System.out.println(area);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of pencil you want to buy:");
        int a=5*in.nextInt();
        System.out.println("Enter number of eraser you want to buy:");
        int b=5* in.nextInt();
        System.out.println("Enter number of pen you want to buy:");

int c=5* in.nextInt();
float gst=18f*((a+b+c))/100;
float total=a+b+c+gst;
        System.out.println(total);

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int type= (a>b&&a>c)? (a):((b>c)? b:(c));
        System.out.println(type);
    }
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            int n = in.nextInt();
            int rem;
            int res = 0;
            while(n>0){
rem=n%10;

                res = res * 10 + rem;

                n = n / 10;
            }
            System.out.println(res);

        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //int num=in.nextInt();
        while(true) {
            int n = in.nextInt();
            if (n % 10 == 0) {
                break;
            }
        }
            System.out.println("I am out of the loop");

    }
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if(i%10==0){
                continue;
            }
            System.out.print(i+" ");

        }
    }
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            Prime(i);
        }
    }
    static void Prime(int n){int num=1;int count=0;
        while(num==n){
            if(n%num==0){
                count++;
            }
            num++;

        }
        if(count==2){
            System.out.println();
        }count=0;

    }
    public static void main(String[] args) {


        for (int i = 2; i < 100; i++) {
            int count=0;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    count++;

                }
            }


                if (count == 0) {
                    System.out.println(i);


            }
        }

    }
    public static void main(String[] args) {

        int res = 1;
        for (int i = 1; i <= 10; i++) {
            Factorial(i, res);
        }
    }

    static void Factorial(int n, int res) {
        while (n >= 1) {
            res = res * n;
            n--;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter which table you want:");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int j=8;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char ch='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
ch++;
            }
            System.out.println();

        } }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {int res=1;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                 res=res*j;

            }
            System.out.println(res);
            res=1;

        }
    }
    public static void main(String[] args) {
        Bin(5,2);
    }
    public static void Bin(int n,int r){
        int nF=Fact(n);
        int nr=Fact(r);
        int nmr=Fact(n-r);
        int res=nF/(nr*nmr);
        System.out.println(res);
    }
    static int Fact(int num){int total=1;
        for(int i=1;i<=num;i++){
            total=total*i;
        }

        return total;
    }

    public static void main(String[] args) {


        for(int i=2;i<=100;i++){
            Prime(i);
        }
    }
    static void Prime(int n) {int count=0;
        for(int i=2;i<n;i++){

            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value in binary:");
        int n = in.nextInt();
        int temp = n;
        int rem;
        int ans = 0;
        int m = 0;
        while (n > 0) {
            rem = n % 10;
            ans += rem * Math.pow(2, m);
            n /= 10;
            m++;
        }
        System.out.println(ans);


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value in decimal:");
        int n=in.nextInt();
        int[] binary=new int[5];int rem;int index=0;
        while(n>0) {
            rem = n % 2;
            binary[index++] = rem;
            n /= 2;
        }
            for(int i=index-1;i>=0;i--){
                System.out.print(binary[i]);
            }
    }
    //another method
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);{
            System.out.println("Enter number in decimal:");
            int n=in.nextInt();int rem;int sum=0;int pow=0;
            while(n>0){
                rem=n%2;
                sum+=rem*Math.pow(10,pow);
pow++;
                n=n/2;
            }
            System.out.println(sum);

        }

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter total no of rows");
        int row=in.nextInt();
        System.out.println("Enter total no of columns");
        int col=in.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        for (int i = 1;i<=4;i++) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");

            }
            for (int  j = 1; j <=i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){int sum=0;int temp=1;
        for(int i=1;i<=5;i++){
sum+=i;
            for(int j=temp;j<=sum;j++){
                System.out.print(j+" ");
            }
            System.out.println();
temp=sum+1;
        }
    }
    public static void main(String[] args) {int counter=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {

                if ((i+j)%2==0) {
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 3; i>=0; i--) {
            for (int j = 0; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
            if(i==1||i==5||j==1||j==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp=i;
            for (int j = 1; j <= n - i; j++){

                System.out.print(" ");
        }
            for(int j=1;j<=(2*i)-1;j++){
                if(temp==1||j>i){
                    System.out.print(temp);
                    temp++;
                }
                else {
                    System.out.print(temp);
                    temp--;
                }
            }
            System.out.println();
    }
    }
    //another method
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {

                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=1;j<6-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=4;i>=0;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= (n - 1) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= (n - 1) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n=in.nextInt();
        int num=1;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < n- i; j++) {
                System.out.print(" ");
            }num=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                 num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of rows");
        int n = in.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int a = n - j;
                System.out.print(a + " ");
            }
            for (int j = i; j < ((2 * n) - 1) - i; j++) {
                temp = n - i;

                System.out.print(temp + " ");
            }
            for (int j = 0; j < i; j++) {
                int b = (n + 1) - i + j;
                System.out.print(b + " ");
            }
            System.out.println();
        }
        for (int i = n-2; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                int a = n - j;
                System.out.print(a + " ");
            }
            for (int j = i; j < ((2 * n) - 1) - i; j++) {
                temp = n - i;

                System.out.print(temp + " ");
            }
            for (int j = 0; j < i; j++) {
                int b = (n + 1) - i + j;
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n||j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n=in.nextInt();
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=2*n;j++){
                if(i<=n) {
                    if (j <= i || j >= (2 * n) - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if(i>=n){
                        if(j<=(2*n)-i||j>i){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }}
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=21;i++){
            if(i<=5) {
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) + 5; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= (2 * i) + 5; j++) {
                    System.out.print("*");

                }
            }
        if(i>=6) {
            for (int j = 1; j <= i - 6; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<42-2*i;j++){
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=2*n-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=in.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<i){
                    System.out.print(n-j);
                }
                else {
                    System.out.print(n-i);
                }
                if(j>2*n-i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n=in.nextInt();
        long r=in.nextInt();
        nCr(n,r,1000000007);
    }
    static long nCr(long n,long r,long k){
        long a=Factorial(n,k);
        long b=Factorial(r,k);
        long c=Factorial(n-r,k);
        long d=a/(b*c);
        System.out.println(d);
        return d;
    }
    static long Factorial(long temp,long k) {long res=1;
        while(temp>0){
        res= (res%k*temp%k)%k;

        temp--;
        }
        //System.out.println(res);
        return  res;
    }
    public static void main(String[] args) {
        int[] arr={7 ,10, 4, 3, 20, 15};
        Arrays.sort(arr);
        int k=3; //third smallest

        System.out.println(arr[k-1]);
    }
    public static void main(String[] args) {
        int[] arr = {2 ,6 ,3 ,4 ,7, 2 ,10, 3, 2, 1};int k=5;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i<=arr.length/2){
                arr[i]=arr[i]+k;
            }
            else{
                arr[i]=arr[i]-k;
            }
        }
       int m= arr[arr.length-1]-arr[0];
        System.out.println(m);

    }
     public static void main(String[] args) {
        int D = 3;
        int S = 16;
        for (int i = (int) Math.pow(10, D - 1) + 1; i <= Math.pow(10, D) - 1; i++) {
            SecondSmallest(D, S, i);
        }
    }

    static void SecondSmallest(int D, int S, int count) {
        int sum = 0;int flag=0;


        int temp = count;
        StringBuilder sb = new StringBuilder("");
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
            if (sum == S) {
                flag++;
                 System.out.println(count);
            }
        System.out.println(flag);

        }
    }


    public static void main(String[] args) {
        int D = 1;
        int S = 6;
        int flag = 0;
        int sum = 0;
        for (int i = (int) Math.pow(10, D - 1) + 1; i <= Math.pow(10, D) - 1; i++) {

            int temp = i;
        sum=0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if (sum == S) {
flag++;
            }
            if(flag==2){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,1,2,4,2,0,1,1};int jump=1;int step=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++) {
            if(i==arr.length-1){
                System.out.println(jump);
            }
            max=Math.max(max,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                step=max-i;
            }
        }}


    public static void main(String[] args) {
        int n=9;
        boolean[] arr=new boolean[n+1];
        SeiveOfEratosthenes(n,arr);
    }
    static void SeiveOfEratosthenes(int n,boolean[] arr){
        for(int i=2;i*i<=n;i++){
            //            if arr[i]==false
            if(!arr[i]){
                for(int j=2*i;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=4;i<=n;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        System.out.printf("%.4f",BinarySearchSquareRoot(40,4));
    }
    static double BinarySearchSquareRoot(int n,int p){
        double root=0.0;int mid=0;
     int start=0;int end=n;
     while(start<=end) {
         mid = start + (end - start) / 2;
         if (mid * mid == n) {
             return mid;
         } else if (mid * mid > n) {
             end = (int) (mid - 1);
         } else {
             start = mid + 1;
         }

     }
    root=end;
     double increment=1;
     for(int i=0;i<=p;i++){
         while(root*root<=n) {
             root += increment;
             System.out.println(root);
         }
         root-=increment;
         increment/=10;
     }
   return root; }



    public static void main(String[] args) {

       int[] seats = {0, 0, 1, 0, 0, 0, 1};
        System.out.println(is_possible_to_get_seats(2,7,seats));
    }
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
        if(m==1&&n==1&&seats[0]==0){
            return true;
        }
       if(seats[0]==0&&seats[1]==0){
           seats[0]++;
           n--;
       }
       for(int i=1;i<m-1;i++){
           if(seats[i]==1){
               i++;

           }
           else if(seats[i]==0&&seats[i-1]==0&&seats[i+1]==0){
               seats[i]++;
               n--;
           }
       }
        if(seats[m-1]==0&&seats[m-2]==0){
            n--;
        }
        System.out.println(Arrays.toString(seats));
        if(n<=0){
            return true;
        }


   return false; }


    public static void main(String[] args) {
       int  n = 21;
        int m = 99;
        int[] seats = {0,0, 1, 1, 0 ,0 ,0 ,1, 1, 0, 0, 0, 0, 0 ,0 ,0 ,1 ,1 ,1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 ,0 ,0 ,0 ,0, 1
                ,1 ,0 ,0 ,0, 0, 0, 0, 0, 1, 1, 1 ,1 ,1 ,0 ,0 ,0 ,0, 1 ,1 ,1 ,0 ,0, 0, 0, 0 ,0 ,1 ,1 ,1 ,0 ,0 ,0 ,1 ,1, 1, 1 ,1, 0, 0, 0, 1
                ,1, 1, 1, 1, 0, 0 ,0 ,0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1 ,1 ,1 ,0, 0, 0, 0};
        System.out.println(is_possible_to_get_seats(n,m,seats));
    }
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
        int i=0;
        while (i<m-1){
            if(i<m-1&&seats[i]==0&&seats[i+1]==0){
                n--;

                seats[i]++;
                i++;
            }
            while(i<m-1&&seats[i]==1){
                i++;
            }
            i++;


        }
       System.out.println(Arrays.toString(seats));
        if(seats[m-1]==0&&seats[m-2]==0){
            n--;
        }
        System.out.println(n);
        if(n<=0){
            return true;
        }
        return false; }




    public static void main(String[] args) {
        int n = 4;long[] arr1 = {1, 3, 5, 7} ;
        int m = 5;long[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1,arr2,n,m);
//        System.out.println(Arrays.toString(arr1));
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        int i=0;int j=0;
        while(i<n&&j<m){
            if(arr1[i]>arr2[j]){
                long temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i++;
            }

                if(arr2[j]>arr2[j+1]){
                    long temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;

            }
        }
        System.out.println(Arrays.toString(arr1));
       for(int k=0;k<m-1;k++){
           if(arr2[k]>arr2[k+1]){
               long temp=arr2[k];
               arr2[k]=arr2[k+1];
               arr2[k+1]=temp;
           }
       }
        System.out.println(Arrays.toString(arr2));
         }


    public static void main(String[] args) {
        int N = 7;
        int[] A= {2,4,6,8,9,10,12};
        int[] B = {2,4,6,8,10,12};
        System.out.println(findExtra(A,B,N));
    }
    public static int findExtra(int a[], int b[], int n) {
        // add code here.
        int start=0;int end=a.length-1;
        while(start<=end){
            if(start==end){
                return start;
            }
             int mid=start+(end-start)/2;


            if(a[mid]==b[mid]){
              start=mid+1;
            }
            else{
                end=mid;
            }
        }
  return start;  }


    public static void main(String[] args) {
       int N=3;
       int[][] mat = {{0,1,1},
               {1, 1, 1},
               {0, 1,1}};
        System.out.println(Arrays.toString(findMaxRow(mat, N)));
    }

        public static int[] findMaxRow(int mat[][], int N) {
            // code here
            int[] arr=new int[2];int max=0;
            int start=mat[0][N-1];int count=0;int startrow=0;int endcol=N-1;
            if(start==1){
                count=1;
            }
            while(startrow<N&&endcol>0){

                if(mat[startrow][endcol-1]==1){
                    count++;
                    endcol--;
                }
                else {
                    startrow++;

                    if (startrow < N && mat[startrow][endcol] == 0) {
                        count = 0;
                    }
                }
                if(count>max){
                    arr[0]=startrow;
                    arr[1]=count;
                    max=count;
                }
            }

       return arr; }


    public static void main(String[] args) {
        System.out.println(pattern(16));
    }

    public static ArrayList<Integer> pattern(int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = N;
        return Patterfunction(list, n, N);

    }

    static ArrayList<Integer> Patterfunction(ArrayList<Integer> list, int n, int N) {

        list.add(n);

        if (n -5<0) {
            return Patterfunction2(list,n,N);

        }
       return Patterfunction(list,n-5,N);

    }
    static ArrayList<Integer> Patterfunction2(ArrayList<Integer> list,int n,int N){

        if(n+5==N){
            list.add(N);
            return list;
        }
        list.add(n);
        return Patterfunction(list,n+5,N);
    }


    public static void main(String[] args) {
       int[] nums = {0,1,2,3,4,5};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
       int temp=nums[0];int count=1;int i=1;int j=1;
       while(i<nums.length){
           if(temp!=nums[i]){
               count++;
               temp=nums[i];
               int temp1=nums[j];
               nums[j]=nums[i];
               j++;
           }
           i++;
       }
        System.out.println(Arrays.toString(nums));
    return count;}


    public static void main(String[] args) {
       int[] nums = {1,3,5,6}; int target = 7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
int start=0;int end=nums.length-1;
while(start<=end){
    int mid=start+(end-start)/2;
    if(nums[mid]==target){
        return mid;
    } else if(target<nums[mid]) {
        end=mid;
    }
    else{
        start=mid+1;
    }
}
   return start; }


    public static void main(String[] args) {
        int[] arr = {10,1,9,2,8,3,7,4,6,5};
        int n = arr.length;
        SelectionSort(arr, n);
    }
        static void SelectionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
            System.out.println(Arrays.toString(arr));
        }

    public static void main(String[] args) {
        int[] arr={9,1,2,5,4,8,6,7};
        int n=arr.length;
        QuickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr,int start,int end){
        int PivotIndex=FindPivotIndex(arr,start,end);
        if(start>=end){
            return ;
        }
         QuickSort(arr,start,PivotIndex-1);
        QuickSort(arr,PivotIndex+1,end);
    }
    static int FindPivotIndex(int[] arr,int start,int end){
       int i=-1;int j=0;int pivot=end;
       while(j<pivot){
           if(arr[j]<arr[pivot]){
               i++;
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
           }
           j++;
       }
       i++;
       int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return i;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70};
        int TargetSum=70;
        SumofSubset(arr,0,"",0,TargetSum);
    }
    static void SumofSubset(int[] arr,int index,String set,int sumofsubset,int target){
        if(index==arr.length){
            if(sumofsubset==target) {
                System.out.println(set+".");
            }
                return;

        }

        SumofSubset(arr,index+1,set+arr[index]+",",sumofsubset+arr[index],target);
        SumofSubset(arr,index+1,set,sumofsubset,target);
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of nxn chessboard: ");
        int n=in.nextInt();
    int[][] chess=new int[n][n];
    SolveNqueen(chess,"",0);
    }
    static void SolveNqueen(int[][] chess,String QueenPosition,int row){
        if(row==chess.length){
            System.out.println(QueenPosition);
            return;
        }
        for(int col=0;col< chess.length;col++){
           if( IsItSafeToPlaceQueen(chess,row,col)==true) {
               chess[row][col] = 1;
               SolveNqueen(chess, QueenPosition + row + "-" + col + " ", row + 1);
               chess[row][col] = 0;
           }
        }
    }
    public static Boolean IsItSafeToPlaceQueen(int[][] chess,int row,int col){
    //checking condition for same column
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
              return false;
            }
        }
        //for left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        //for right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }

   return true;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first String ");
        String s1=in.next();
        System.out.println("Enter the second String");
        String s2=in.next();
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        System.out.println(FindLongestSubsequence(s1,s2,dp));
    }
    static int FindLongestSubsequence(String s1,String s2,int[][] dp){
        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[0].length-2;j>=0;j--){
                char c1=s1.charAt(i);
                char c2=s2.charAt(j);
                if(c1==c2){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }

            }

        }
       return dp[0][0];
    }


    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value that can be obtained = " + maxValue);
    }

    public static double getMaxValue(int[] weight, int[] val, int capacity) {
        int n=weight.length;
        double[][] ratio=new double[n][n];
        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)val[i]/weight[i];
        }
        int W=capacity;
        int Total=0;
        Arrays.sort(ratio,Comparator.comparingDouble(a->a[1]));
        for(int i= ratio.length-1;i>=0;i--){
            int index= (int) ratio[i][0];
            if(weight[index]<=W){
                Total+=val[index];
                W-=weight[index];
            }
            else{
                Total+=ratio[i][1]*W;
                capacity=0;
                break;

            }
        }
         return Total;
    }


    public static void main(String[] args) {
        System.out.println(Subsequence("abc",""));
    }
    static ArrayList<String> Subsequence(String s1,String s2){
        if(s1.isEmpty()){
            ArrayList<String>  list=new ArrayList<>();
            list.add(s2);
            return list;
        }
        char ch=s1.charAt(0);

       ArrayList<String> left= Subsequence(s1.substring(1),s2+ch);
       ArrayList<String> right= Subsequence(s1.substring(1),s2);
 left.addAll(right);
 return left;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Subset(arr));
    }

  public static List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> OuterList=new ArrayList<>();
        OuterList.add(new ArrayList<>());
        for(int num:arr){
            int n=OuterList.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> InnerList=new ArrayList<>(OuterList.get(i));
                InnerList.add(num);
                OuterList.add(InnerList);
            }
        }
   return OuterList;
    }


    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(SubsetWithOutDuplicates(nums));
    }

    public static List<List<Integer>> SubsetWithOutDuplicates(int[] nums){
        List<List<Integer>> OuterList=new ArrayList<>();
        OuterList.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                start=end+1;
            }
            end= OuterList.size()-1;
            int n=OuterList.size();
            for(int j=start;j<=end;j++){
                ArrayList<Integer> InnerList=new ArrayList<>(OuterList.get(j));
                InnerList.add(nums[i]);
                OuterList.add(InnerList);
            }
        }
        return OuterList;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

        public static boolean isHappy(int n) {
        int sum=0;int temp=n;boolean flag=false;
  while(true){
    int rem=n%10;
   sum+=Math.pow(rem,2);
   n/=10;

   if(n==0){
       if(sum==1){
           flag=true;
           break;
       }
       if(sum==temp){
           break;
       }
       n=sum;
       sum=0;
   }
}
       return flag; }


    public static void main(String[] args) {
ArrayList<String> list=new ArrayList<>();
        Subsequence("abc","",list);
        System.out.println(list);
    }
    public static void Subsequence(String s1,String s2, ArrayList<String> list){
        if(s1.isEmpty()){
            list.add(s2);
            return;
        }
        char ch=s1.charAt(0);
        Subsequence(s1.substring(1),s2+ch,list);
        Subsequence(s1.substring(1),s2,list);
    }


    public static void main(String[] args) {

        System.out.println(Subsequence("abc",""));

    }
    public static List<String> Subsequence(String s1,String s2){
        if(s1.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(s2);
          return list;
        }
        char ch=s1.charAt(0);
        List<String> left=Subsequence(s1.substring(1),s2+ch);
       List<String> right= Subsequence(s1.substring(1),s2);
       left.addAll(right);
       return left;
    }


    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(Subset(arr));
    }
    public static List<List<Integer>> Subset(int[] arr){
     List<List<Integer>> OuterList=new ArrayList<>();
        OuterList.add(new ArrayList<>());
     for(int i=0;i<arr.length;i++){
         int n= OuterList.size();
         for(int j=0;j<n;j++){
             ArrayList<Integer>InnerList=new ArrayList<>(OuterList.get(j));
             InnerList.add(arr[i]);
             OuterList.add(InnerList);
         }
     }
  return OuterList;
    }


    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(Subset(arr));
    }
    public static List<List<Integer>> Subset(int[] arr) {
        List<List<Integer>> OuterList = new ArrayList<>();
        OuterList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] == arr[i]){
                start=end;
            }

                end = OuterList.size();
            for (int j = start; j <end; j++) {
                ArrayList<Integer> InnerList = new ArrayList<>(OuterList.get(j));
                InnerList.add(arr[i]);
                OuterList.add(InnerList);
            }
        }
        return OuterList;
    }


    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Permutation("", "abc",list);
        System.out.println(list);
    }

    static void Permutation(String s2, String s1,ArrayList<String> list) {
        if (s1.isEmpty()) {
            list.add(s2);
            return;
        }
        char ch = s1.charAt(0);
        for(int i=0;i<=s2.length();i++){
            String first=s2.substring(0,i);
            String second=s2.substring(i,s2.length());
            Permutation(first+ch+second,s1.substring(1),list);
        }
    }


    public static void main(String[] args) {
       String  s = "";String t = "ahbgdc";


        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                  count++;
                  i++;
                }
                if(count==s.length()){
                    return true;
                }
            }
        }
   return false; }


    public static void main(String[] args) {
       String digits = "79";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
List<String> list=new ArrayList<>();
if(digits.isEmpty()){
    return list;
}
        LetterCombination(digits,"",list);
        return list;
    }
    public static void LetterCombination(String s1,String s2, List<String> list ){

        if(s1.isEmpty()){
            list.add(s2);
            return;
        }
        int digit=s1.charAt(0)-'0';
        int start=(digit-2)*3;
        int end=3*(digit-1);
        if(digit>7) {
            start += 1;
        }
        if(digit==7||digit==8){
            end+=1;
        }
        if(digit==9){
            end+=2;
        }
        for(int i=start;i<end;i++){
            char ch=(char) ('a'+i);
            LetterCombination(s1.substring(1),s2+ch,list);
        }
    }


    public static void main(String[] args) {
        System.out.println(LetterCombination("97",""));
    }
    public static ArrayList<String> LetterCombination(String s1,String s2 ){
        if(s1.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(s2);
           return list;
        }
        int digit=s1.charAt(0)-'0';
        int start=(digit-2)*3;
        int end=3*(digit-1);
        if(digit>7) {
            start += 1;
        }
        if(digit==7||digit==8){
            end+=1;
        }
        if(digit==9){
            end+=2;
        }
        ArrayList<String>list=new ArrayList<>();
        for(int i=start;i<end;i++){
            char ch=(char) ('a'+i);
           list.addAll(LetterCombination(s1.substring(1),s2+ch));

        }
  return list;
    }


    public static void main(String[] args) {
      Dice("",4);
    }
    public static void Dice(String s,int target){
     if(target==0){
         System.out.println(s);
         return;
     }
     for(int i=1;i<=6&&i<=target;i++){
         Dice(s+i,target-i);
     }
    }


    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }
    static int[] InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int previous=i-1;
            while(previous>=0&&arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
  return arr;
    }


    public static void main(String[] args) {
        int[] arr={9,1,8,2,7,3,6,4,5};
        MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void MergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
       int mid=start+(end-start)/2;
       MergeSort(arr,start,mid);
       MergeSort(arr,mid+1,end);
       MergedArray(arr,start,end,mid);
    }
    public static void MergedArray(int[] arr,int start,int end,int mid){
        int[] temp=new int[end-start+1];int i=start;int j=mid+1;int k=0;
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
              temp[k]=arr[j];
              j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(int p=0,q=start;p<temp.length;p++,q++){
            arr[q]=temp[p];
        }

    }


    public static void main(String[] args) {
        int[] arr={9,1,8,2,7,3,6,4,5};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int Pivotindex=FindPivot(arr,start,end);
        QuickSort(arr,start,Pivotindex-1);
        QuickSort(arr,Pivotindex+1,end);
    }
    public static int FindPivot(int []arr,int start,int end){
        int i=-1;int Pivot=arr[end];int j=0;
        while(j<end){
            if(arr[j]<Pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        i++;
        int temp=arr[i];
        arr[i]=Pivot;
        arr[j]=temp;
   return i; }


    public static void main(String[] args) {

        int[][] A={{1,2,3},
                {4,5,6},
               {7,8,9}};
        int [][]B={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int[][] C=new int[3][3];
            for(int i=0;i<A.length;i++){
                for(int j=0;j<A[0].length;j++){
                    for(int k=0;k<A.length;k++){
                        C[i][j]+=A[i][k]*B[k][j];
                    }
                }
                System.out.print(Arrays.toString(C[i])+" ");
            }

        }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean[] ans=new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(!ans[i]){
                for(int j=2*i;j<=n;j+=i){
                  ans[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!ans[i]){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        int[] weight={10,20,30};
        int[] value={60,100,120};
        int capacity=50;
        System.out.println(FractionalKnapSack(weight,value,capacity));
    }
    static double FractionalKnapSack(int[] weight,int[] value,int capacity){
        int n=weight.length;
        double[][] ValueByWeight=new double[n][2];
        for(int i=0;i<n;i++){
            ValueByWeight[i][0]=i;
            ValueByWeight[i][1]=(double)value[i]/weight[i];
        }
        double W=capacity;
        Arrays.sort(ValueByWeight, Comparator.comparing(a ->a[1]));
        double total=0;

        for(int i=ValueByWeight.length-1;i>=0;i--){
            int index=(int)ValueByWeight[i][0];
            if(W>=weight[index]){
               total+=value[index];
               W-=weight[index];
            }
            else{
                total+=ValueByWeight[i][1]*W;
                W=0;
                break;
            }
        }
   return total;
    }


    public static void main(String[] args) {
        int N = 17;
        int[] A = {2,2,3,3,4,4,27 ,27, 32 ,32 ,36 ,36 ,41 ,41 ,42, 42, 45};
        System.out.println(search(A,N));
    }

    public static int search(int A[], int N) {
        // your code here
        int start = 0;int mid=0;
        int end = N-1;
        while (start <=end) {

             mid = start + (end - start) / 2;

            if (mid>start&&A[mid] == A[mid - 1]) {
                if ((mid - start) % 2 == 0) {
                    end = mid - 2;
                } else {
                    start = mid + 1;
                }
            }
            else if(mid<end&&A[mid]==A[mid+1]){
                if((end-mid)%2==0){
                    start=mid+2;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                return A[mid];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int N = 9;
        int[] A = {5, 6, 7, 8, 9, 10, 1, 2, 3};
       int key = 5;
       int  l = 0 , h = 8 ;
        System.out.println(search(A,l,h,key));
    }
   static  int search(int A[], int l, int h, int key)
    {
        int PivotIndex=FindPivot(A,l,h);

if(key==A[PivotIndex]){
    return PivotIndex;
}
        if(key>=A[l]&&key<A[PivotIndex]){
            return BinarySearch(A,l,PivotIndex-1,key);
        }
        return BinarySearch(A,PivotIndex+1,h,key);
    }
    static int BinarySearch(int[] A,int start,int end,int key) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (key == A[mid]) {
                return mid;
            } else if (key < A[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            return mid;

    }
    static int FindPivot(int[] A,int l,int h){
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if(A[mid]>A[mid-1]&&A[mid]>A[mid+1]){
                return mid;
            }
            else if(A[mid]>A[l]){
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
  return mid;
    }


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(2, 3, 6, 9, 10, 19, 31, 37, 46, 60, 72, 77, 78, 81, 60, 46, 37, 31, 19, 10, 9, 6, 3, 2));
        System.out.println(findPeakElement(a));
    }

    public static int findPeakElement(List<Integer> a) {
        // Code here
        int mid = 0;
        int l = 0;
        int h = a.size() - 1;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (mid > l && mid < h && a.get(mid) > a.get(mid - 1) && a.get(mid) > a.get(mid + 1)) {
                return a.get(mid);
            } else if (a.get(mid) > a.get(l)) {
                l = mid + 1;
            } else {
                h = mid ;
            }
        }
        return a.get(h);
    }


    public static void main(String[] args) {
       int  n = 2, m = 3;
       String s = "LLLRR";
        System.out.println(isPossible(n,m,s));
    }
    static int isPossible(int n, int m, String s){
        // code here
        int r=m,d=n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                r--;
            }
            if(s.charAt(i)=='R'){
                r++;
            }
            if(s.charAt(i)=='U'){
               d--;
            }
            if(s.charAt(i)=='D'){
               d++ ;
            }
            if(r<=0||r>m||d<=0||d>n){
                return 0;
            }
        }

   return 1;
    }


    public static void main(String[] args) {
        int N=20;
        System.out.println(findNthSkippingDigitsContaining9(N));
    }
   static  long findNthSkippingDigitsContaining9(long N)
    {
       long count=0;long sum=0;
       while(N!=0){
        long rem=N%9;
        sum+=Math.pow(10,count)*rem;
        count++;
        N/=9;
        }
       return sum;
    }


    public static void main(String[] args) {
        int[] arr={5,1,2,4,3};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int previous=i-1;
            while(previous>=0&&arr[previous]>current){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Dice("",4);
    }
    public static void Dice(String s,int target){
        if(target==0){
            System.out.println(s);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            Dice(s+i,target-i);
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first String ");
        String s1=in.next();
        System.out.println("Enter the second String");
        String s2=in.next();
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        System.out.println(FindLongestSubsequence(s1,s2,dp));
    }
    static int FindLongestSubsequence(String s1,String s2,int[][] dp){
        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[0].length-2;j>=0;j--){
                char c1=s1.charAt(i);
                char c2=s2.charAt(j);
                if(c1==c2){
                    dp[i][j]=1+dp[i+1][j+1];

                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }

            }

        }
        return dp[0][0];
    }


    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println( Subsequence("abc","",list));
    }
    static ArrayList<String> Subsequence(String s1,String s2,  ArrayList<String> list){
       if(s1.isEmpty()){
          list.add(s2);
          return list;
       }
       char ch=s1.charAt(0);
       Subsequence(s1.substring(1),s2,list);
       return Subsequence(s1.substring(1),s2+ch,list);
    }


    public static void main(String[] args) {

        System.out.println( Subsequence("abc",""));
    }
    static ArrayList<String> Subsequence(String s1,String s2){
        if(s1.isEmpty()){
ArrayList<String> list=new ArrayList<>();
list.add(s2);
return list;
        }
        char ch=s1.charAt(0);
       ArrayList<String>list1= Subsequence(s1.substring(1),s2);
         ArrayList<String> list2=Subsequence(s1.substring(1),s2+ch);
         list1.addAll(list2);
         return list1;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(Subset(arr));
    }
    static List<List<Integer>> Subset(int[] arr){
      List<List<Integer>> Outerlist=new ArrayList<>();
      Outerlist.add(new ArrayList<>());
      for(int num:arr){
          int size=Outerlist.size();
          for(int j=0;j<size;j++){
              ArrayList<Integer>Innerlist=new ArrayList<>(Outerlist.get(j));
              Innerlist.add(num);
              Outerlist.add(Innerlist);
          }
      }
      return Outerlist;
    }


    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        System.out.println(Subset(arr));
    }
    static List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> Outerlist=new ArrayList<>();
        Outerlist.add(new ArrayList<>());
        int start=0;int end=0;
        for(int i=0;i<arr.length;i++){
           if(i>0&&arr[i]==arr[i-1]){
               start=end;
           }
           end= Outerlist.size();
            for(int j=start;j<end;j++){
                ArrayList<Integer>Innerlist=new ArrayList<>(Outerlist.get(j));
                Innerlist.add(arr[i]);
                Outerlist.add(Innerlist);
            }
        }
        return Outerlist;
    }


    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<>();
        Permutation("abc","",list);
        System.out.println(list);
    }
    static void Permutation (String s1,String s2,ArrayList<String> list){
        if(s1.isEmpty()){
           list.add(s2);
           return;
        }
        char ch=s1.charAt(0);
        for(int i=0;i<=s2.length();i++){
            String first=s2.substring(0,i);
            String second=s2.substring(i);
            Permutation(s1.substring(1),first+ch+second,list);
        }
    }

    public static void main(String[] args) {
        System.out.println(Permutation("abc",""));
    }
    static List<String> Permutation (String s1,String s2){
       List<String> list=new ArrayList<>();
        if(s1.isEmpty()){
           list.add(s2);
           return list;
        }
        char ch=s1.charAt(0);
        for(int i=0;i<=s2.length();i++){
            String first=s2.substring(0,i);
            String second=s2.substring(i);
           list.addAll(Permutation(s1.substring(1),first+ch+second));
//list.addAll(ans);
        }
   return list;
    }


    public static void main(String[] args) {
        System.out.println(Numpad("79",""));
    }
    static List<String> Numpad(String s1,String s2){
        List<String> list=new ArrayList<>();
        if(s1.isEmpty()){
           list.add(s2);
           return list;
        }
        int temp=s1.charAt(0)-'0';
        int start=3*(temp-2);
if(temp>7){
    start++;
}
        int end=start+3;
if(temp==7||temp==9){
    end++;
}
for(int i=start;i<end;i++){
            char ch= (char) ('a'+i);
            list.addAll(Numpad(s1.substring(1),s2+ch));
        }
        return list;
    }


    public static void main(String[] args) {

        System.out.println(DiceProblem("",3,6));
    }
    static List<String> DiceProblem(String s1,int targetsum,int face){
if(targetsum==0){
    List<String> list=new ArrayList<>();
    list.add(s1);
    return list;
}
List<String> list=new ArrayList<>();
for(int i=1;i<=targetsum;i++){
    list.addAll(DiceProblem(s1+i,targetsum-i,face));
}
   return list;
    }


    public static void main(String[] args) {
        System.out.println(MazeProblemFromSourceToDestination(3,3));
    }
    static int MazeProblemFromSourceToDestination(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        int left=MazeProblemFromSourceToDestination(row-1,col);
    int right=MazeProblemFromSourceToDestination(row,col-1);
    return left+right;
    }


    public static void main(String[] args) {
       MazeProblemFromSourceToDestination(3,3,"");
    }
    static void MazeProblemFromSourceToDestination(int row,int col,String s1){
        if(row==1&&col==1){
            System.out.println(s1);
            return ;
        }
        if(row>1) {
            MazeProblemFromSourceToDestination(row - 1, col, s1 + 'D');
        }
        if(col>1) {
             MazeProblemFromSourceToDestination(row, col - 1, s1 + 'R');
        }

    }


    public static void main(String[] args) {
        System.out.println(MazeProblemFromSourceToDestination(3,3,""));
    }
    static List<String> MazeProblemFromSourceToDestination(int row,int col,String s1){
       List<String> list1=new ArrayList<>();
        if(row==1&&col==1){
           List<String> list=new ArrayList<>();
           list.add(s1);
           return list;
        }
        if(row>1) {
          list1.addAll(MazeProblemFromSourceToDestination(row - 1, col, s1 + 'D'));
        }
        if(col>1) {
           list1.addAll(MazeProblemFromSourceToDestination(row, col - 1, s1 + 'R'));
        }

   return list1;
    }


    public static void main(String[] args) {
        System.out.println(MazeProblemFromSourceToDestination(3,3,""));
    }
    static List<String> MazeProblemFromSourceToDestination(int row,int col,String s1){
        List<String> list1=new ArrayList<>();
        if(row==1&&col==1){
            List<String> list=new ArrayList<>();
            list.add(s1);
            return list;
        }
        if(row>1&&col>1){
            list1.addAll(MazeProblemFromSourceToDestination(row-1,col-1,s1+'D'));
        }
        if(row>1) {
            list1.addAll(MazeProblemFromSourceToDestination(row - 1, col, s1 + 'V'));
        }
        if(col>1) {
            list1.addAll(MazeProblemFromSourceToDestination(row, col - 1, s1 + 'H'));
        }

        return list1;
    }

    public static void main(String[] args) {
        int n=3;
        boolean[][] place= new boolean[n][n];
        MazeProblemMovementInAllFourDirections(place,0,0,"",n);
    }
    static void  MazeProblemMovementInAllFourDirections(boolean[][] place,int row,int col,String s1,int n){
        if(row==n-1&&col==n-1){
            System.out.println(s1);
            return;
        }

        if(place[row][col]==true){
            return;
        }
        place[row][col]=true;
        if(row<n-1){
           MazeProblemMovementInAllFourDirections(place,row+1,col,s1+'D',n);
        }
        if(col<n-1){

            MazeProblemMovementInAllFourDirections(place,row,col+1,s1+'R',n);
        }
        if(row>0){
            MazeProblemMovementInAllFourDirections(place,row-1,col,s1+'U',n);
        }
        if(col>0){
            MazeProblemMovementInAllFourDirections(place,row,col-1,s1+'L',n);
        }
        place[row][col]=false;
    }


    public static void main(String[] args) {
        int n=3;
        boolean[][] place= new boolean[n][n];
        int[][] steps=new int[n][n];
        MazeProblemMovementInAllFourDirections(place,0,0,"",n,steps,1);
    }
    static void  MazeProblemMovementInAllFourDirections(boolean[][] place,int row,int col,String s1,int n,int[][] steps,int step){
        if(row==n-1&&col==n-1){
            steps[row][col]=step;
            System.out.println(s1);
            for(int[] arr:steps){
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if(place[row][col]==true){
            return;
        }
        place[row][col]=true;
        steps[row][col]=step;
        if(row<n-1){
            MazeProblemMovementInAllFourDirections(place,row+1,col,s1+'D',n,steps,step+1);
        }
        if(col<n-1){

            MazeProblemMovementInAllFourDirections(place,row,col+1,s1+'R',n,steps,step+1);
        }
        if(row>0){
            MazeProblemMovementInAllFourDirections(place,row-1,col,s1+'U',n,steps,step+1);
        }
        if(col>0){
            MazeProblemMovementInAllFourDirections(place,row,col-1,s1+'L',n,steps,step+1);
        }
        place[row][col]=false;
        steps[row][col]=0;
    }




    public static void main(String[] args) {
        int n=5;
        boolean[][] chess=new boolean[n][n];
        System.out.println(NQueenProblem(chess,0));
    }
    static int  NQueenProblem(boolean[][]chess,int row ){
        if(row==chess.length){
            PrintQueenPositions(chess);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<chess[0].length;col++){
            if(PlacingQueenAtThisPositionIsSafe(chess,row,col)){
                chess[row][col]=true;
                count+=NQueenProblem(chess,row+1);
                chess[row][col]=false;
            }
        }
        return count;
    }
    static void PrintQueenPositions(boolean[][] chess){
        for(boolean[] row:chess){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    static boolean PlacingQueenAtThisPositionIsSafe(boolean[][] chess,int row,int col) {
        //checking if queen lies within same column
        for (int i = row, j = col; i >= 0; i--) {
            if (chess[i][j]) {
                return false;
            }
        }
        //checking if queen lies within left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j]) {
                return false;
            }
        }
        //checking if queen lies within right diagonal
        for (int i = row, j = col; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j]) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int n=4;
        boolean[][] chess=new boolean[n][n];
        System.out.println(NKnightProblem(chess,0,0,4));
    }
    static int NKnightProblem(boolean[][] chess,int row,int col,int knights){
        if(knights==0){
            PrintKnightPosition(chess);
            System.out.println();
            return 1;
        }
        if(row==chess.length-1&&col== chess[0].length){
            return 0;
        }
        if(col==chess.length){
           return NKnightProblem( chess, row+1, 0, knights);

        }
int count=0;
        if(IsSafe(chess,row,col)){
         chess[row][col]=true;
           count+= NKnightProblem( chess, row, col+1, knights-1);
            chess[row][col]=false;
        }
       count+= NKnightProblem( chess, row, col+1, knights);
        return count;
    }
    static boolean IsSafe(boolean[][] chess,int row,int col){
       if(IsValidPlacingAtThisPosition(chess,row-2,col-1)) {
           if (chess[row - 2][col - 1]) {
               return false;
           }
       }
        if(IsValidPlacingAtThisPosition(chess,row-2,col+1)) {
            if (chess[row - 2][col + 1]) {
                return false;
            }
        }
        if(IsValidPlacingAtThisPosition(chess,row-1,col+2)) {
            if (chess[row - 1][col +2]) {
                return false;
            }
        }
        if(IsValidPlacingAtThisPosition(chess,row-1,col-2)) {
          if(chess[row-1][col-2]){
              return false;
          }
        }
//        if(IsValidPlacingAtThisPosition(chess,row+2,col-1)) {
//            if (chess[row + 2][col - 1]) {
//                return false;
//            }
//        }
//        if(IsValidPlacingAtThisPosition(chess,row+2,col+1)) {
//            if (chess[row + 2][col + 1]) {
//                return false;
//            }
//        }
//        if(IsValidPlacingAtThisPosition(chess,row+1,col-2)) {
//            if (chess[row + 1][col - 2]) {
//                return false;
//            }
//        }
//        if(IsValidPlacingAtThisPosition(chess,row+1,col+2)) {
//            if (chess[row + 1][col + 2]) {
//                return false;
//            }
//        }

       return true;
    }
    static boolean IsValidPlacingAtThisPosition(boolean[][] chess,int row,int col){
       if(row>=0&&row<chess.length&&col>=0&&col<chess.length){
           return true;
       }
       return false;
    }
    static void PrintKnightPosition(boolean[][] chess){
        for(boolean[]row:chess){
            for(boolean element:row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    /*


    public static void main(String[] args) {
        int n=4;
        boolean[][] chess=new boolean[n][n];
        System.out.println(PlacingNKnights(chess,0));

    }
    static int PlacingNKnights(boolean[][] chess,int row){
       if(row== chess.length){
           DisplayPosition(chess);
           System.out.println();
           return 1;
       }
       int count=0;

       for(int col=0;col<chess.length;col++) {
           if (IsSafePlacingAtThisPosition(chess,row,col)){
            chess[row][col]=true;
            count+=PlacingNKnights(chess,row+1);
            chess[row][col]=false;
           }
       }
       return count;

    }
    static boolean IsSafePlacingAtThisPosition(boolean[][] chess,int row,int col){
        if(IsValid(chess,row-2,col-1)){
            if(chess[row-2][col-1]){
              return false;
            }
        }
        if(IsValid(chess,row-2,col+1)){
            if(chess[row-2][col+1]){
                return false;
            }
        }
        if(IsValid(chess,row-1,col-2)){
            if(chess[row-1][col-2]){
                return false;
            }
        }
        if(IsValid(chess,row-1,col+2)){
            if(chess[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean IsValid(boolean[][] chess,int row,int col){
        if(row>=0&&row<chess.length&&col>=0&&col<chess.length){
            return true;
        }
        return false;
    }
    static void DisplayPosition(boolean[][] chess){
        for(boolean[] row:chess){
            for (boolean element:row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.print(find_permutation("eidbaooo","ab"));
    }

    public static boolean find_permutation(String s1,String s2){
        if(s1.isEmpty()&&s1.equals(s2)){

            return true;
        }
        char ch=s1.charAt(0);

            for (int i = 0; i <= s2.length()-1; i++) {
                String first = s2.substring(0, i);
                String second = s2.substring(i, s2.length());
                if (find_permutation(s1.substring(1), first + ch + second)) {
                    return true; // Return true if the recursive call returns true
                }
            }

        return false;
    }


    public static void main(String[] args) {
        long[] arr = {4, 0, 2, 1, 3};
        arrange(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrange(long[] arr, int n) {
       for(int i=0;i<n;i++){
           long OldVal=arr[i];
           arr[i]=((arr[(int) arr[i]])%n)*5+OldVal;
       }
       for(int i=0;i<n;i++){
           arr[i]=arr[i]/n;
       }
    }


    public static void main(String[] args) {
        System.out.println(find_permutation("nppp"));
    }
    public static List<String> find_permutation(String S) {
        // Code here
        List<String> list=new ArrayList<>();
        String s2="";
        Helper(S,s2,list);

//        Set<String>  uniquePermutations= new HashSet<>(list);
//        List<String> uniquePermutationsList = new ArrayList<>(uniquePermutations);
//        Collections.sort(uniquePermutationsList);
//
//        return uniquePermutationsList;
        List<String> uniquePermutations = new ArrayList<>();
        for (String permutation : list) {
            if (!uniquePermutations.contains(permutation)) {
                uniquePermutations.add(permutation);
            }
        }
        Collections.sort(uniquePermutations);

        return uniquePermutations;


    }
    static void Helper(String S,String s2,List<String> list){
        if(S.isEmpty()){
            list.add(s2);
            return;
        }
        char ch=S.charAt(0);
        for(int i=0;i<=s2.length();i++){
            String first=s2.substring(0,i);
            String second=s2.substring(i,s2.length());
            Helper(S.substring(1),first+ch+second,list);
        }
    }


    public static void main(String[] args) {
        System.out.println(isDivisible("111"));
    }
   static  int isDivisible(String s) {
        // code here
     int res=0;
     for(int i=0;i<s.length();i++){
         if(i%2!=0 &&s.charAt(i)=='1'){
          res+=1;
         } else if (i%2==0&&s.charAt(i)=='1'){
             res+=2;
         }
     }
       System.out.println(res);
     if(res%3==0){
         return 1;
     }
     return 0;

    }




    public static void main(String[] args) {
        System.out.println(nextHappy(10));
    }
    static int nextHappy(int N){
        // code here
        int num=N;
        HashSet<Integer> container=new HashSet<>();
       return (nextHappyHelper(N+1,container,0,num+1));
    }
    static int nextHappyHelper(int N,HashSet<Integer> container,int sum,int num){
        if(sum==1){
            return num;
        }
        if(container.contains(sum)){
            container.clear();
            num++;
            N=num;
           return nextHappyHelper( N, container, 0,num);
        }
       container.add(sum);
        int newsum=0;
        while(N!=0){
            int rem=N%10;
            newsum+=rem*rem;
            N/=10;
        }

        return nextHappyHelper( newsum, container, newsum,num);
    }


    public static void main(String[] args) {
        System.out.println(setBits(6));
    }
    static int setBits(int N) {
        // code here

        int count=0;
        while(N!=0){
            if((N&1)==1){
                count++;
            }
            N=N>>1;
        }
        return count;

    }


    public static void main(String[] args) {
       int n = 67; ;long[] arr1 ={83, 107, 139, 732, 787, 803, 851, 1274, 1601, 1621, 1682, 1787, 2173, 2344, 2370, 2613, 2670, 2859, 2932, 3001, 3195, 3404, 3488, 3544, 3619, 3662, 3723, 4490, 4766, 5006, 5149, 5157, 5534, 5779, 5804, 5847, 6062, 6159, 6308, 6585, 6887, 7416, 7422, 7454, 7553, 7568, 7651, 7720, 7828, 7920, 8051, 8119, 8233, 8249, 8299, 8351, 9088, 9124, 9235, 9275, 9462, 9489, 9563, 9576, 9614, 9838, 9912};
       int  m = 5; long []arr2 = {2165, 2746, 3237, 6490, 8448};
       merge(arr1,arr2,n,m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        int i=0;int j=0;int k=n-1;
        while(k>=i){
            if(j<m&&arr1[i]>arr2[j]){
                long temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                k--;
                j++;
            }
            else {
                i++;
            }
        }
        Arrays.sort(arr1);
       Arrays.sort(arr2);
    }


    public static void main(String[] args) {
int m=2,n=4;
int[] array1={4,6};
int[] array2={1,2,3,5};
        System.out.println(medianOfArrays(n,m,array1,array2));
    }
    static double medianOfArrays(int n, int m, int a[], int b[])
    {
       int count=0;double[] arr=new double[(m+n)/2+1];
       int i=0;int j=0;int k=0;
       while(i<a.length&&j<b.length){
           if(a[i]<b[j]){
               arr[k]=a[i];
               i++;
           }
           else{
               arr[k]=b[j];
               j++;
           }
           k++;
           count++;
           if(k==arr.length){
               break;
           }
       }
       while(k<arr.length&&i<a.length){
           arr[k++]=a[i++];
       }
       while(k<arr.length&&j<b.length){
           arr[k++]=b[j++];
       }
       if((n+m)%2==0){
           return (arr[arr.length-1]+arr[arr.length-2])/2;
       }
return arr[arr.length-1];

}


    public static void main(String[] args) {
        int X = 16, Y = 2;
       int  L = 1,  R = 3;
        System.out.println(setSetBit(X,Y,L,R));
    }
    static int setSetBit(int x, int y, int l, int r){
       int a= (int) Math.pow(2,r)-1;
        System.out.println(a);
       int b= a<<l-1;
        System.out.println(b);
    return ((a&b)&y)|x;
    }


    public static void main(String[] args) {
        int n=10;
        int i=1;
        ArrayList<Integer>list=new ArrayList<>();
        help( n,list);
        Collections.sort(list);
        System.out.println(list);
    }
    static void help(int n,ArrayList<Integer>list){
        if(n==1){
           list.add(n);
            return;
        }
        list.add(n);
        help(n-1,list);
    }


    public static void main(String[] args) {
int n=4;int[] arr={3,4,1,5};
        System.out.println(stockBuyAndSell(n,arr));
    }
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int min=prices[0];int max;int count=0;
        for(int i=1;i<n;i++){
            if(count==0&&prices[i]<min){
                min=prices[i];
                i++;
                count++;
            }
            else {
                max=prices[i];
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        int[] arr={85 ,19, 756, 96 ,597, 437 ,577 ,480, 931, 855, 159, 390, 110, 482, 283, 948 ,153 ,746, 787, 655, 936, 901, 948, 978, 979, 746, 585, 862 ,460 ,926 ,736, 221, 573};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high)
    {

       if(low>=high){
         return;
       }
        int partition=partition(arr,low,high);

        quickSort(arr,0,partition-1);
        quickSort(arr,partition+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        int index=low-1;int pivot=arr[high];int start=low;
        while(start<high){
            if(arr[start]<pivot){
                index++;
                int temp=arr[start];
                arr[start]=arr[index];
                arr[index]=temp;
            }
            start++;
        }
        index++;
        int temp=arr[start];
        arr[start]=arr[index];
        arr[index]=temp;
        return index;
    }


    public static void main(String[] args) {
        int[] arr={2,3};
        ArrayList<Integer>list=new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println(subsetSums(list, arr.length));
    }
   public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
       int sum;
       ArrayList<Integer>list=new ArrayList<>();
       helper(list,arr,N,0,0);
       return list;
    }
    public static void helper(ArrayList<Integer>list,ArrayList<Integer>arr,int n,int sum,int index){
        if(index==arr.size()){
            list.add(sum);
            return;
        }
        helper(list,arr,n,sum,index+1);
        helper(list,arr,n,sum+arr.get(index),index+1);

    }


    public static void main(String[] args) {
        int[][] image= {{1,1,1},{1,2,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, newColor)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int OldColor=image[sr][sc];
        if(OldColor==newColor){
            return image;
        }

return fill(image,sr,sc,newColor,OldColor);
    }
    static int[][] fill(int[][] image,int sr,int sc,int newColor,int OldColor) {
        if (sr>=0&&sr< image.length&&sc>=0&&sc<image[0].length&&image[sr][sc] == OldColor) {
            image[sr][sc] = newColor;
            fill(image, sr + 1, sc, newColor, OldColor);
            fill(image, sr, sc + 1, newColor, OldColor);
            fill(image, sr - 1, sc, newColor, OldColor);
            fill(image, sr, sc - 1, newColor, OldColor);

        }
        return image;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
if(n==1||n==2){
    return n;
}
return climbStairs(n-1)+climbStairs(n-2);
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;

        }
        return sum;
    }


    public static void main(String[] args) {
        int n = 6;
        long[] arr = {1,2,3,4,5,6};
        rearrange(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void rearrange(long arr[], int n){
int i=0;int j=n-1; int k=0;long temp1=arr[0];long temp2=arr[n-1];
while(i<=j){

    arr[k]=Math.max(temp1,temp2);
    j--;
    k++;
    arr[k]=Math.min(temp,arr[k]);
    i++;k++;
}

    }


    public static void main(String[] args) {
        int[][] a = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        int n = a.length;
        transpose(n, a);
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(a[i] ));
        }
    }

    public static void transpose(int n, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp=a[i][j];
                 a[i][j]=a[j][i];
                 a[j][i]=temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] prerequisites = {{1, 4}, {2, 4}, {3, 1}, {3, 2},};
        System.out.println(prerequisites.length);

        System.out.println(canFinish(5,prerequisites));
}
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length<1)
        {
            return true;
        }
        int count=0;
        for(int i=0;i< prerequisites.length;i++){
            for(int j=0;j< prerequisites[0].length;j++){
                if(i!=j&&prerequisites[i][j]==prerequisites[j][i]){
                    count++;
                }
            }
            if(count==2){
                return false;
            }

        }

        return true;
    }


    static int atoi(String str) {
        // Your code here

        for(int i=0;i<str.length()-1;i++){
            int b= str.charAt(i)+0;
            int c=str.charAt(i+1)+0;
            if(b>96||b<48&&c<48){
                return -1;
            }
        }
        int a=Integer.parseInt(str);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(atoi("--129"));
    }


    public static void main(String[] args) {
        int[][] arr = {{0, 0}, {1, 1}};


    int n = 2;
    int m = 2;
        System.out.println(rowWithMax1s(arr,n,m));
}
    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
int row=0;int count=0;int index=row;int max=Integer.MIN_VALUE;
int col=m-1;
while(row<n&&col>=0){
if(arr[row][col]==1){
    col--;
    count++;
    if(count>max){
        max=count;
        index=row;
    }
}
else {

    row++;
}
}
return index;
    }




    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("hheelloo"));
    }
    static char nonrepeatingCharacter(String S)
    {

int[] arr=new int[26];int count=0;

        for(int i=0;i<S.length();i++){
            int a=S.charAt(i)-97;
         arr[a]++;
        }
        for(int i=0;i<S.length();i++){
            int a=S.charAt(i)-97;
            if(arr[a]==1){
                return S.charAt(i);

            }
        }
        System.out.println(Arrays.toString(arr));
        return '$';
    }


    public static void main(String[] args) {
        int n = 6;
       long[] arr = {1,2,3,4,5,6};
       rearrange(arr,arr.length);
    }
    public static void rearrange(long arr[], int n){
        int j=n-1;long temp=0;
       for (int i=0;i<n;i++){
           if(i%2==0){
                temp=arr[i];
               arr[i]=arr[j];
               j--;
           }
           else{
               arr[i]=temp;
           }

        }
//        for(int k=0;k<n;k++){
//           arr[k]=arr[k]/n;
//        }
        System.out.println(Arrays.toString(arr));
}


    public static void main(String[] args) {
       int n=9, x=7;
       long[]  arr = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        System.out.println(find(arr,n,x));
    }
    public  static  ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here

        ArrayList<Long> list=new ArrayList<Long>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x){
                list.add((long)i);
            }
            while ((int) arr[i] == x) {
                i++;
            }
if(list.size()==1) {
    list.add((long) i-1);
    return list;
}
        }


        list.add((long) -1);
        list.add((long) -1);
        return list;

    }

     */
    public static void main(String[] args) {
        int n = 4, m = 4;
       int[][] M = {{1 ,1 ,1, 1},
            {1 ,1 ,1, 0},
            {1 ,1 ,1 ,1},
            {1, 1, 1, 1}};
        System.out.println(maxArea(M,n,m));
    }
    public static int maxArea(int M[][], int n, int m) {
        // add code here.
int count1=0;int count=0;int max=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(M[i][j]==1){
            count++;
        }
    }
    if(count==m){
        count1++;
        if(count1>max){
          max=count1;
        }
    }
    else {
        count1=0;
    }
    count=0;
}
if (max>0){
    return m*max;
}
return 0;
    }




}




























