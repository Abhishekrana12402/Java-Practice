import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       /* int [] arr={5,4,3,2,1,6};
        int start=0;
        int end= arr.length-1;
        MergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
   public static void MergeSort(int[] arr,int start,int end){
       int mid=(start+end)/2;
       if(start>=end){
           return;
       }

       MergeSort(arr,start,mid);
       MergeSort(arr,mid+1,end);
       Merge(arr,start,end);

   }
   static void Merge(int[] arr,int start,int end){

    int mid=(start+end)/2;
    int i=start;int j=mid+1;int[] temp=new int[arr.length];int k=0;
while(i<=mid&&j<=end){
    if(arr[i]<arr[j]){
        temp[k++]=arr[i];
        i++;
    }
    else {
        temp[k++]=arr[j];
        j++;
    }
}
while (i<=mid){
    temp[k++]=arr[i++];
}
while (j<=end){
    temp[k++]=arr[j++];
}
for(int p=0,q=start;q<=end;p++,q++){
    arr[q]=temp[p];
}


        Scanner in=new Scanner(System.in);
        int salary=in.nextInt();
        if(salary<10000){
            salary+=1000;
        } else if (salary>10000&&salary<20000) {
            salary+=2000;
        }
        else {
            salary+=3000;
        }
        System.out.println(salary);


        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=0;
        while (n>0) {
            int rem = n % 10;
            res = res * 10 + rem;
            n /= 10;
        }
        System.out.println(res);


Scanner in =new Scanner(System.in);
String fruits=in.next();
switch (fruits){
    case "Apple":
        System.out.println("A sweet round fruit");
        break;
    case "Mango":
        System.out.println("King of the fruit");
        break;
    case "Grapes":
        System.out.println("A small fruit");
        break;
    default:
        System.out.println("Please enter the valid fruit");
        }



Scanner in=new Scanner(System.in);
        System.out.print("Please enter the two numbers ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.print("Enter the operator of your choice ");
        char ch=in.next().charAt(0);
        switch (ch) {
            case '+' -> System.out.println("The addition of the above to numbers is " + (a + b));
            case '-' -> System.out.println("The subtraction of the above to numbers is " + (a - b));
            case '/' -> System.out.println("The division of the above to numbers is " + a / b);
            case '*' -> System.out.println("The multiplication of the above to numbers is " + a * b);
            case '%' -> System.out.println("The modulo of the above to numbers is "+ a % b);
            default -> System.out.println("Enter valid operator");
        }


        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Employee ID ");
        int empID=in.nextInt();
        System.out.print("Enter the Department ");
        String department=in.next();
        switch (empID){
            case 1:
                System.out.println("Aditya");
                break;
            case 2:
                System.out.println("Zahid");
                break;
            case 3:
                System.out.println("Employee id 3");
                switch (department) {
                    case "Comp":
                        System.out.println("Computer Branch");
                        break;
                        case "IT":
                        System.out.println("IT department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter Valid Employee ID");

        }


        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        boolean ans =SearchPrime(a);
        System.out.println(ans);
    }
    static boolean SearchPrime(int a){
        int c=2;
        if(a<=1){
            return false;
        }
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;

        */
//        for(int i=0;i<1000;i++){
//            int count=0;
//            int sum=0;
//            int num=i;
//            while(num>0){
//                count++;
//                num/=10;
//            }
//            num=i;
//            while (num>0){
//                int rem=num%10;
//                sum+=Math.pow(rem,count);
//                num/=10;
//            }
//            if(sum==i){
//                System.out.print(sum+" ");
//            }
//        }
        System.out.println(reverse(1534236469));

    }
    public static int reverse(int x) {
        int n= x;
        int res=0;
        while(n!=0){
            int rem=n%10;
            if(res>=Integer.MAX_VALUE/10){
                return 0;
            }
            res=res*10+rem;

            n/=10;

        }
        return res;
    }
}
