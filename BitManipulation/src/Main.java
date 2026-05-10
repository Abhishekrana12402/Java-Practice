import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter value in Decimal");
        int n=in.nextInt();
        DecimalToBinary(n);
    }
    static void DecimalToBinary(int n) {
        int sum = 0;int pow=0;
        while (n != 0) {
            int rem = n % 2;
            sum += rem*Math.pow(10, pow);
            n /= 2;
            pow++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        BinaryToDecimal(n);
    }
    static void BinaryToDecimal(int n){int sum=0;int pow=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*Math.pow(2,pow);
            n/=10;
            pow++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //Bitwise And(&)
        System.out.println(5&6);
        //Bitwise Or(|)
        System.out.println(5|6);
        //Bitwise Xor(^)
        System.out.println(5^6);
        //One's Complement
        System.out.println(~5);
        //Left Shift
        System.out.println(5<<2);
        //Right Shift
        System.out.println(6>>1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        OddOrEven(n);
    }
    static void OddOrEven(int n){int bitmask=1;
        if((n&bitmask)==0) {
            System.out.println("Number is even");
        }
            else{
                System.out.println("Number is odd");
            }
        }


    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        System.out.println("Enter the bit you want");
        int i=in.nextInt();
        GetIthBit(n,i);
    }
    static void GetIthBit(int n,int i){
        int bitmask=1;
         i = bitmask << i;
        if((n&i)==0){
            System.out.println("bit was " +0+" ");
        }
        else{
            System.out.println("bit was " +1+" ");
        }
    }


    public static void main(String[] args) {
        SetIthBit(10,2);
    }
    static void SetIthBit(int n,int i){
      int bitmask=1<<i;
      n=n|bitmask;
        System.out.println(n);
    }
    public static void main(String[] args) {
      ClearIthBit(10,1);
    }
    static void ClearIthBit(int n,int i){
        int bitmask=~(1<<i);
        n=n&bitmask;
        System.out.println(n);
    }
    public static void main(String[] args) {
        UpdateIthBit(10,1,0);
    }
    static void UpdateIthBit(int n,int i,int NewBit){
        if(NewBit==0){
            int Bitmask=~(1<<i);
            n=n&Bitmask;
            System.out.println(n);
        }
        else{
            int Bitmask=(1<<i);
            n=n|Bitmask;
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        ClearLastIthBit(15,2);
    }
    static void ClearLastIthBit(int n,int i){
        int Bitmask=-1<<i;
        n=n&Bitmask;
        System.out.println(n);
    }
    public static void main(String[] args) {
        ClearBitsInRange(10,2,4);
    }
    static void ClearBitsInRange(int n,int i,int j){
        int a=-1<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        n=n&bitmask;
        System.out.println(n);
    }
    public static void main(String[] args) {
        CountSetBits(15);
    }
    static void CountSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;

        }
            System.out.println(count);
    }
    public static void main(String[] args) {
        FastExponentiation(5, 3);
    }
    static void FastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {//checking lsb whether it is 1 or not
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FastExponentiation(5, 3,1000000007);
    }
    static void FastExponentiation(long a, long n,long k) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {//checking lsb whether it is 1 or not
                ans = (ans%k * a%k)%k;
            }
            a = (a%k * a%k);
            n = n >> 1;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int n=16;
        DecimalToAnyBase( n);
    }
    static void DecimalToAnyBase(int n){
        int digit=0;int res=0;
        while(n>0){
            int rem=n%2;
            res+=rem*Math.pow(10,digit);
            n/=2;
            digit++;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        AnyBaseToDecimal(50);
    }
    static void AnyBaseToDecimal(int n){
        int digit=0;int res=0;
        while(n>0){
            int rem=n%10;
            res+=rem*Math.pow(8,digit);
            digit++;

            n/=10;
        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        EvenOrOdd(22);
    }
    static void EvenOrOdd(int n){
        int Bitmask=1;
        if((n&Bitmask)==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }




    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println(Unique(arr));
    }
    static int Unique(int[] arr){
      int Bitmask=0;
      for(int n:arr){
          Bitmask^=n;
      }
   return Bitmask; }



    public static void main(String[] args) {

        GetIthBit(15,5);
    }
    static void GetIthBit(int n,int i){
      int Bitmask=1;
 Bitmask=Bitmask<<i;


       if( (n&Bitmask)==0){
           System.out.println("Bit was"+0);
       }
       else{
           System.out.println("Bit was "+1);
       }
    }


    public static void main(String[] args) {
        SetIthBit(4,1);
    }
    static void SetIthBit(int n,int i){
        int Bitmask=1;
        Bitmask=Bitmask<<i;
        System.out.println(n|Bitmask);

    }


    public static void main(String[] args) {
      SetIthBit(86,4);
    }
    static void SetIthBit(int n,int i){
        int Bitmask=1;
       Bitmask= Bitmask<<i;
        System.out.println(n^Bitmask);
    }


    public static void main(String[] args) {
        int UpdateValue=0;
        int n=70;
        int i=3;
        int Bitmask=1;
        if(UpdateValue==0){
            ClearIthBit(n,i,Bitmask);
        }
        else{
            SetIthBit(n,i,Bitmask);
        }
    }
    static void ClearIthBit(int n,int i,int Bitmask){

        Bitmask=~(Bitmask<<i);
        System.out.println(n&Bitmask);
        }
        static void SetIthBit(int n,int i,int Bitmask){
        Bitmask=Bitmask<<i;
            System.out.println(n|Bitmask);
        }


   /* public static void main(String[] args) {
        System.out.println(NumberOfSetBits(15));
    }
    static int NumberOfSetBits(int n){
        int count=0;int Bitmask=1;
        while(n!=0){
//          another method (n=n&n-1 )do it while n>0
 if((n&Bitmask)==1){
            count++;
           }
          n= n>>1;

        }
   return count; }


    public static void main(String[] args) {
        MagicNumber(6);
    }
    static void MagicNumber(int n){
        int digit=1;int res=0;
        while(n!=0) {
            int Bitmask = n & 1;
            res += Bitmask * Math.pow(5, digit);
            n = n >> 1;
            digit++;
        }
            System.out.println(res);
    }


    public static void main(String[] args) {
     NumberOfDigitsInAnyBase(16,2);
    }
    static void NumberOfDigitsInAnyBase(int n,int base){
     int ans= (int) (Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }


    public static void main(String[] args) {
     SumOfNthRowInPascal(4);
    }
    static void SumOfNthRowInPascal(int n){
        System.out.println(1<<n-1);
    }




    public static void main(String[] args) {
      PowerOf2OrNot(16);

    }
    static void PowerOf2OrNot(int n){

        if((n&n-1)==0) {
             System.out.println("Given Number is Power of 2");
         }
         else{
             System.out.println("Given Number is not Power of 2");
         }
    }


    public static void main(String[] args) {
     AToThePowerN(3,5);
    }
    static void AToThePowerN(int a,int n){
        int ans=1;
      while(n>0){
          if((n&1)==1){
           ans=ans*a;
          }
          a=a*a;
         n= n>>1;
      }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int a=3;
        int b=9;
//        Xor in given Range=Xor in Range 0-end Range Xor Start range-1
        int ans=Xor(b)^Xor(a-1);
        System.out.println(ans);

    }
    static int Xor(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
       return 0;
    }


    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
      int[][] ans= flipAndInvertImage(image);
        for(int i=0;i< image.length;i++){
            for(int j=0;j< image.length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
int[][] temp=new int[image.length][image.length];
for(int i=0;i<image.length;i++){
    for(int j= image.length-1;j>=0;j--){

        temp[i][image.length-j-1]=(image[i][j])^1;

    }
}
   return temp; }


    public static void main(String[] args) {
bitManipulation(678883006 ,16);
        System.out.println(Integer.toBinaryString(70 ));
    }
    static void bitManipulation(int num, int i) {
        // code here
        int n=((1<<i-1)&num);
        if(n>0){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }
        System.out.print(((1<<i-1)|num)+" " );

        System.out.println(~(1<<i-1)&num);
    }

     */
    public static void main(String[] args) {
        System.out.println(setBits(15));
    }
   public  static int setBits(int N) {
        // code here
        int count=0;
        while(N>0){
            if((N&1)==1){
                count++;
            }
            N=N>>1;
            System.out.println(N);
        }
   return count; }


        }


