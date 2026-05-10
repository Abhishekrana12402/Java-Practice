import java.util.Arrays;
import java.util.Scanner;

public class Functions {
   /* public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number 1");
        int a=in.nextInt();
        System.out.print("Enter number 2");
        int b=in.nextInt();
        System.out.println("The sum of the above two number is "+Sum(a,b));
    }
    static int Sum(int a,int b){
return a+b;


    }


   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String name=in.next();
      String personal=Greeting(name);
      System.out.println(personal);
   }
   static String Greeting(String name){
       String message="Hello "+name;
      return message;

   }


   public static void main(String[] args) {
      String name="Abhishek";
      ChangeName(name);
      System.out.println(name);
   }
   static void ChangeName(String name){
      name="Kunal";
//here we are creating a new object hence name->"Abhishek" and name->"Kunal" are two separate things also strings are immutable
   }


   public static void main(String[] args) {
      int num1=10;
      int num2=20;
      Swap(num1,num2);
      System.out.println(num1+" "+num2);
      //here value will not be swapped because in function call new objects are created and swapping occurs
      //within that object and function only
   }
   static void Swap(int a,int b){
      int temp=a;
      a=b;
      b=temp;

   }


   public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
      ChangeArray(arr);
      System.out.println(Arrays.toString(arr));
   }
   static void ChangeArray(int[] nums){
      nums[0]=2;//nums will be another reference variable that will be passing to the same object
      //if we make change in the object via this reference variable then original object will be changed
   }


   //Scoping: variables that are already initialised outside the block cannot be initialised again inside
   //the block of same method but we can change the value of it
   //whereas value initialised inside the block cannot be used outside that respective block but can be reinitialised again
   static int x=90;//can be used everywhere within the class
   public static void main(String[] args) {
      System.out.println(x);//will print 90
      int x=40;
      System.out.println(x);//will print 40 because it overlaps or overshadows the same variables initialised at higher level scope
      fun();
   }
   static void fun(){
      System.out.println(x);
   }


   public static void main(String[] args) {
   fun(2,3,4,5,6,7);
   }
   static void fun(int ...v){//variable arguments in which we can pass any number of arguments we want.It should always be at the end of the parameter passed
      System.out.println(Arrays.toString(v));
   }

    */
   //Function Overloading:when two or more functions have same name but different arguments
   //(same number of arguments but different data-types or same data-types but different number of arguments)

}
