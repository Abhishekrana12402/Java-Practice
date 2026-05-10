import java.util.*;

public class Main {
    /*public static void main(String[] args){
        int n=10;
        PrintDecreasing(n);
    }
    static void PrintDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        PrintDecreasing(n-1);
    }
    public static void main(String[] args) {
        int n=1;
        PrintIncreasing(n);
    }
    static void PrintIncreasing(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintIncreasing(n+1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Factorial(n));
  }
   public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fn=n*Factorial(n-1);
   return fn;
   }

    public static void main(String[] args) {
        int n=10;
        System.out.println(SumofN(n));
    }
   public static int SumofN(int n){
        if(n==1){
            return 1;
        }
        int m=n+SumofN(n-1);
    return m;
    }

    public static void main(String[] args){
        int n=5;
        System.out.println(Fibonacci(n));
    }
    static int Fibonacci(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return 1;
        }
       int m=Fibonacci(n-1)+Fibonacci(n-2);
   return m; }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr,int i){


        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return isSorted(arr,i+1);
    }


    public static void main(String[] args) {
        int [] arr={2,5,8,1,6};
        System.out.println(FirstOccurence(arr,0,3));
    }
    static int FirstOccurence(int[] arr,int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
   return FirstOccurence(arr,i+1,key);
    }
    public static void main(String[] args){
     int[] arr={1,2,11,1,2,1};
        System.out.println(Lastoccurence(arr,0,1));
    }
    static int Lastoccurence(int [] arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        if( i==arr.length&&arr[i]==key){

        }
    }
    public static void main(String[] args) {
        System.out.println( XtoPowerN(5,3));
    }
    static int XtoPowerN(int x, int n){
        if(n==1){
            return x;
        }
        int m=x*(XtoPowerN(x,n-1));
   return m; }


    public static void main(String[] args) {
        System.out.println(OptimisedPower(2,5));
    }
    static int OptimisedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int HalfPower=OptimisedPower(x,n/2);
        int HalfPowerSquare=HalfPower*HalfPower;
        if(n%2!=0){
            HalfPowerSquare=x*HalfPowerSquare;
        }
    return HalfPowerSquare;}


    public static void main(String[] args) {
        System.out.println(TilingProblem(4));
    }
    static int TilingProblem(int n){
        int TotalWays;
      if(n==1||n==0) {
          return 1;
      }
          int Horizontal=TilingProblem(n-2);
          int Vertical=TilingProblem(n-1);
           TotalWays=Horizontal+Vertical;

    return TotalWays;}


    public static void main(String[] args) {
        RemoveDuplicates("apnnacollege",0,new boolean[26],new StringBuilder());
    }
    public static void RemoveDuplicates(String str,int index,boolean[] map,StringBuilder sb){
        if(index==str.length()){
            System.out.println(sb);
            return;
        }
        char CurrChar=str.charAt(index);
        if(map[CurrChar-'a']==true){
            RemoveDuplicates(str, index+1, map, sb);
        }
        else{
            map[CurrChar-'a']=true;
            RemoveDuplicates(str, index+1, map, sb.append(str.charAt(index)));
        }
    }
    public static void main(String[] args) {
        System.out.println(PairingFriends(3));
    }
    static int PairingFriends(int n){
        if(n==1||n==2){
            return n;
        }
       int Single= PairingFriends(n-1);
int Pair=(n-1)*PairingFriends(n-2);

  return Single+Pair;  }


    public static void main(String[] args) {
       ConsecutiveOnes("",3,0);
    }
    static void ConsecutiveOnes(String str,int n,int LastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
     if(LastPlace==0){
         ConsecutiveOnes(str+"0",n-1,0);
         ConsecutiveOnes(str+"1",n-1,1);
     }
     else{
         ConsecutiveOnes(str+"0",n-1,0);
     }
    }


    public static void main(String[] args) {
        int[] arr={3,2,4,5,6,2,7,2,2};
        int key=2;
        IndexOfKey(arr,key,0);
    }
    static void IndexOfKey(int[] arr,int key,int index){
        if (index == arr.length) {
            return;
        }
        if(arr[index]==key){
            System.out.println(index);
        }
        IndexOfKey(arr,key,index+1);

    }

    public static void main(String[] args) {
        DigitToString("2097",0,new String(" "));
    }
      static void DigitToString(String str, int index,String newstring){
        if(index==str.length()) {
            System.out.println(newstring);
            return;
        }
          switch (str.charAt(index)) {
              case '2':
                 newstring+="two  ";
                break;
              case '0':
                  newstring+="zero  ";
                  break;
              case '9':
                  newstring+="nine  ";
                  break;
                  case '7':
                      newstring+="seven  ";
          }
          DigitToString(str,index+1,newstring);

      }


    public static void main(String[] args) {
      LengthOfString("abhishek",0)  ;
    }
static void LengthOfString(String str,int index){
        if(index==str.length()){
            System.out.println(index);
            return ;
        }
    LengthOfString(str,index+1);
 }


    public static void main(String[] args) {
message();
    }
    static void message()
    {
        System.out.println("Hello World");
        message1();
    }
    static void message1()
    {
        System.out.println("Hello World");
        message2();
    }
    static void message2()
    {
        System.out.println("Hello World");
        message3();
    }
    static void message3()
    {
        System.out.println("Hello World");

    }


    public static void main(String[] args) {
       Print(1);
    }
static void Print(int n){
        if(n==5){
            System.out.println(n);
            return ;
        }
    System.out.println(n);
        Print(n+1);
}


    public static void main(String[] args) {
        System.out.println(Fibonaccii(7));
    }
    static int  Fibonaccii(int n){
        if(n==0||n==1){
            return n;
        }
        return Fibonaccii(n-1)+ Fibonaccii(n-2);
    }


    public static void main(String[] args) {
        int[] arr={2,4,6,20,30,40};
        System.out.println( BinarySearch(arr,0,arr.length-1,1));
    }
    static int  BinarySearch(int[] arr,int start,int end,int key ){
        int mid=(start+end)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
          return BinarySearch( arr,mid+1, end, key ) ;
        }
        else{
            return BinarySearch( arr,start, mid-1, key ) ;
        }
    }



    public static void main(String[] args) {
//
        System.out.println(FiboFormula(7));
    }
        static int FiboFormula(int n){
        return (int) ( Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));

    }
    

//    Euclids algorithm
    public static void main(String[] args) {
        System.out.println(GCD(3,7));
        System.out.println(LCM(4,18));
    }
    static int GCD(int a,int b){
     if(a==0){
         return b;
     }
     return GCD(b%a,a);
    }
    static int LCM(int a,int b){
       return ((a*b)/GCD(a,b));
    }


    public static void main(String[] args) {
      Recursion(5);
    }
    static void Recursion(int n){
        if(n==0){

            return;

        }
        System.out.println(n);
        Recursion(n-1);
   }


    public static void main(String[] args) {
        RecursionReverse(5);
    }
    static void RecursionReverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        RecursionReverse(n-1);
        System.out.print(n+" ");
    }




    public static void main(String[] args) {
        System.out.println(Factorial(6));
    }
    static int Factorial(int n){
        if(n==1){
            return 1;
        }

   return  n*Factorial(n-1); }


    public static void main(String[] args) {
        System.out.println(SumOfnNumbers(5));
    }
    static int SumOfnNumbers(int n){
      if(n==1){
          return 1;
      }
      return n+SumOfnNumbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SumOfDigits(333));
    }
    static int SumOfDigits(int n){

        if(n==0){
          return 0;
        }
       return n%10+SumOfDigits(n/10);
    }


    public static void main(String[] args) {
        System.out.println(ProductOfDigits(3));
    }
    static int ProductOfDigits(int n){

        if(n<10){
            return n;
        }
        return n%10*ProductOfDigits(n/10);

    }


    public static void main(String[] args) {
        Num(5);
    }
    static void Num(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        Num(--n);
    }


    public static void main(String[] args) {
       int ans= Reverse(234,0);
        System.out.println(ans);
    }
    static int Reverse(int n,int res){
        if(n==0){
            return res;
        }
        int rem=n%10;
        res=res*10+rem;
       return Reverse(n/10,res);
       }


    public static void main(String[] args) {
        int res=0;
         Reverse(234,res);


    }
    static void Reverse(int n,int res){
        if(n==0){
            System.out.println(res);
            return ;
        }
        int rem=n%10;
        res=res*10+rem;
        Reverse(n/10,res);
    }


    public static void main(String[] args) {
//       int ans=ReverseAnotherMethod(987);
        System.out.println(isPalindrome(989));
    }
    static int ReverseAnotherMethod(int n){
     int digits=(int)Math.log10(n)+1;
     return MainFunction(n,digits);
    }
    static int MainFunction(int n,int digits){

        if(n%10==n){
            return n;
        }
     return (int) ((n%10)*Math.pow(10,digits-1))+ReverseAnotherMethod(n/10);
    }
    static boolean isPalindrome(int n){
     return (n==ReverseAnotherMethod(n));
    }


    public static void main(String[] args) {
        System.out.println(NumberOfZeros(500500,0));
    }
    static int NumberOfZeros(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
return NumberOfZeros(n/10,count);
    }


    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static  int numberOfSteps(int num) {
       return Helper( num,0);
    }
    static int Helper(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            return Helper(num/2,count+1);
        }
   return Helper(num-1,count+1); }


    public static void main(String[] args) {
        int[] arr={2,1,3,5,5};
        System.out.println(IsSorted(arr,0,arr.length-1));
    }
    static boolean IsSorted(int[] arr,int start,int end){
        if(arr[start]>arr[start+1]){
            return false;
        }
     if(start==end-1){
         return true;
     }

   return IsSorted(arr,start+1,end); }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(IsSorted(arr,0,arr.length-1));
    }
    static boolean IsSorted(int[] arr,int start,int end){
        if(start==end){
            return true;
        }
        return arr[start]<=arr[start+1]&&IsSorted(arr,start+1,end);
    }


    public static void main(String[] args) {
        int[] arr={5,7,10,12,24};
        System.out.println(SearchInArray(arr,0,24));
    }
//    static boolean SearchInArray(int[] arr,int start,int target){
//        if(target==arr[start]){
//            return true;
//        }
//        return target==arr[start] || SearchInArray(arr,start+1,target);
//    }
    static int SearchInArray(int[] arr,int start,int target){
        if(target==arr[start]){
            return start;
        }
        if(start==arr.length-1){
            return -1;
        }
        return  SearchInArray(arr,start+1,target);
    }

    public static void main(String[] args) {
        int[] arr={1,4,8,24,9,24};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(ReturningAllIndex(list,arr,0,24));
    }
    static ArrayList<Integer> ReturningAllIndex(ArrayList<Integer> list, int [] arr, int start, int target){
if(arr[start]==target){
    list.add(start);
}
        if(start==arr.length-1){
            return list;
        }

   return ReturningAllIndex(list,arr,start+1,target); }


    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 24, 9, 24};
        System.out.println(ReturningAllIndex(arr, 0, 24));
    }
//    In this since Arraylist is created inside the function hence new ArrayList is created at each function calls hence
//    value of list is different at each function calls
    static ArrayList<Integer> ReturningAllIndex(int[] arr, int start, int target) {
         ArrayList<Integer> list = new ArrayList<>();
         if (arr[start] == target) {
           list.add(start);
        }
        if (start == arr.length - 1) {
            return list;
        }
        ArrayList<Integer> AboveAns= ReturningAllIndex( arr, start + 1, target);
        list.addAll(AboveAns);
        return list;
    }




//    Rotated Binary Search Using Recursion

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(RotatedBinarySearchUsingRecursion(arr, 0, arr.length - 1, 6));
    }
    static int RotatedBinarySearchUsingRecursion(int[] arr, int start, int end, int target) {


        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {

            return mid;
        }
        if (start > end) {
            return -1;
        }
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return RotatedBinarySearchUsingRecursion(arr, start, mid - 1, target);
            } else {
                return RotatedBinarySearchUsingRecursion(arr, mid + 1, end, target);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            RotatedBinarySearchUsingRecursion(arr, mid + 1, end, target);
        }
            return RotatedBinarySearchUsingRecursion(arr, start, mid -1, target);

    }


    public static void main(String[] args){
        Patter1(0,0,5);
    }
    static void Patter1(int i,int j,int n){
        if(i>=n){
            return;
        }
        if(j<n-i) {
            System.out.print("*"+" ");
            Patter1(i,j+1,n);
        }
        else{
            System.out.println();
            Patter1(i+1,0,n);
        }
    }


    public static void main(String[] args){
        Patter1(0,0,5);
    }
    static void Patter1(int i,int j,int n){
        if(i>=n){
            return;
        }
        if(j<=i) {
            System.out.print("*"+" ");
            Patter1(i,j+1,n);
        }
        else{
            System.out.println();
            Patter1(i+1,0,n);
        }
    }


    //Bubble Sort Using Recursion
    public static void main(String[] args) {
        int[] arr={10,1,9,2,8,3,4,5};
        BubbleSort(arr,0,1);
    }
    static void BubbleSort(int[] arr,int i,int j){
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(j<=arr.length-1){
            if(arr[j-1]>arr[j]) {
                Swap(arr, i, j);
            }
            BubbleSort(arr,i,j+1);
        }
        else{
            BubbleSort(arr,i+1,1);
        }
    }
    static void Swap(int[] arr,int i,int j){
       int temp=arr[j-1];
       arr[j-1]=arr[j];
       arr[j]=temp;
    }


    public static void main(String[] args) {
        int[] arr={10,1,9,2,8,3,7,4,6,5};
        SelectionSort(arr,0,0,0);

    }
    static void SelectionSort(int[] arr,int i,int j,int min){
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
       if(j<arr.length) {
           if ( arr[j] < arr[min]) {
               min = j;
           }
               SelectionSort(arr, i, j + 1, min);

       }
       else{
           Swap(arr,i,j,min);
            SelectionSort(arr,i+1,i+1,i+1);
        }
    }
    static void Swap(int[] arr,int i,int j,int min){
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }


    public static void main(String[] args) {
        int[] arr={17,8,2,4,7,15,5};
        arr=CreatingLeftAndRightPart(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] CreatingLeftAndRightPart(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=CreatingLeftAndRightPart(Arrays.copyOfRange(arr,0,mid));
        int[] right=CreatingLeftAndRightPart(Arrays.copyOfRange(arr,mid,arr.length));
        return Mergesort(left,right);
    }
    static int[] Mergesort(int[] left,int[] right) {
        int i=0;int j=0;int k=0;int[] temp=new int[left.length+ right.length];
        while(i<left.length&&j<right.length){
         if(left[i]<right[j]){
             temp[k]=left[i];
             i++;
         }
         else{
             temp[k]=right[j];
             j++;
         }
         k++;
        }
        while(i< left.length){
            temp[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            temp[k]=right[j];
 j++;
        k++;
        }

  return temp;  }


    public static void main(String[] args) {
        int[] arr={6,1,5,4,19,3};
       int[] ans=LeftAndRightArray(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] LeftAndRightArray(int[] arr){
        int mid= arr.length/2;
        if(arr.length==1){
            return arr;
        }

        int[] LeftArray= LeftAndRightArray(Arrays.copyOfRange(arr,0,mid));
        int[] RightArray=LeftAndRightArray(Arrays.copyOfRange(arr,mid,arr.length));
        return Merge(LeftArray,RightArray);
    }
    static int[] Merge(int[] LeftArray,int[] RightArray){
        int i=0;int j=0;int k=0;
        int[] temp=new int[LeftArray.length+RightArray.length];
        while(i<LeftArray.length&&j<RightArray.length){
            if((LeftArray[i]<RightArray[j])){
                temp[k]=LeftArray[i];
                i++;
            }
            else{
                temp[k]=RightArray[j];
                j++;
            }
            k++;
        }
        while(i<LeftArray.length){
            temp[k++]=LeftArray[i++];
        }
        while(j<RightArray.length){
            temp[k++]=RightArray[j++];
        }
   return temp;
    }


    public static void main(String[] args) {
        int[] arr={6,1,5,4,19,3};
        LeftAndRightArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void LeftAndRightArray(int[] arr,int l,int r){
        int mid= l+(r-l)/2;
        if(l>=r){
            return;
        }
        LeftAndRightArray(arr,l,mid);
        LeftAndRightArray(arr,mid+1,r);
        Merge(arr,l,mid,r);
    }
    static void Merge(int[] arr,int l,int mid,int r){
        int i=l;int j=mid+1;int k=0;int[] temp=new int[r-l+1];
      while(i<=mid&&j<=r) {
          if (arr[i] < arr[j]) {
              temp[k] = arr[i];
              i++;
          } else {
              temp[k] = arr[j];
              j++;
          }
          k++;
      }
          while(i<=mid){
              temp[k++]=arr[i++];
          }
          while(j<=r){
              temp[k++]=arr[j++];

      }
      for(  k=0,i=l;k<temp.length;i++,k++){
          arr[i]=temp[k];
      }
    }


    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int PivotIndex=FindPivot(arr,low,high);
        QuickSort(arr,low,PivotIndex-1);
        QuickSort(arr,PivotIndex+1,high);
    }
    static int FindPivot(int[] arr,int low,int high){
        int Pivot=arr[high];
        int i=low-1;int j=0;
        for(j=low;j<high;j++){
            if(arr[j]<Pivot){
i++;
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return i;
    }


    public static void main(String[] args) {
        String str1="aaaabaadaaacb";
        String str2="";
       RemoveCharacter_a(str1,str2,0);

    }
    static void RemoveCharacter_a(String str1,String str2, int start) {


        if (start == str1.length()) {
            System.out.print(str2+" ");
            return;

        }
        if(str1.charAt(start)!='a'){
            str2+=str1.charAt(start);
        }

         RemoveCharacter_a(str1,str2,start+1); }


    public static void main(String[] args) {
        String s1="aaabaacda";
        String s2="";
        RemoveAlphabetFromString(s1,s2,0);
    }
    static void RemoveAlphabetFromString(String s1,String s2,int start){
       if(start==s1.length()) {
           System.out.println(s2);
           return;
       }
       char ch=s1.charAt(start);
       if(ch=='a'){
           RemoveAlphabetFromString(s1,s2,start+1);
       }
       else{
          RemoveAlphabetFromString(s1,s2+ch,start+1);
       }
    }


    public static void main(String[] args) {
        String s1="aabcdaa";
        System.out.println(RemoveAlphabets(s1));
    }
    static String RemoveAlphabets(String s1){
        if(s1.isEmpty()){
            return s1;
        }
        char ch=s1.charAt(0);
        if(ch=='a'){
            return RemoveAlphabets(s1.substring(1));
        }
        return ch+ RemoveAlphabets(s1.substring(1));
    }


    public static void main(String[] args) {
        String s1="abapplecd";
        System.out.println(RemoveString(s1));
    }
    static String RemoveString(String s1){
        if(s1.isEmpty()){
            return s1;
        }
        if(s1.startsWith("apple")){
            return RemoveString(s1.substring(5));
        }
        return s1.charAt(0)+RemoveString(s1.substring(1));
    }


    public static void main(String[] args) {
        String s1="abc";
        String s2="";
        Subsequence(s1,s2);
    }
    static void Subsequence(String s1,String s2){
        if(s1.isEmpty()){
            System.out.print(s2+" ");
            return;
        }
        char ch=s1.charAt(0);
        Subsequence(s1.substring(1),s2+ch);
        Subsequence(s1.substring(1),s2);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2="";
        RemoveAlphabet(s1,s2);
    }

    static void RemoveAlphabet(String s1,String s2) {
        if (s1.isEmpty()) {
            System.out.print(s2+" ");
            return;
        }
        char ch = s1.charAt(0);
       RemoveAlphabet(s1.substring(1),s2+ch);
       RemoveAlphabet(s1.substring(1),s2);
        }




    public static void main(String[] args) {
        String s1="abc";String s2="";
        ArrayList<String> list=new ArrayList<>();
        System.out.println(Subsequence(s1,s2,list));
    }
    static ArrayList<String> Subsequence(String s1, String s2,ArrayList<String> list){
       if(s1.isEmpty()) {
           list.add(s2);
           return list;
       }
       char ch=  s1.charAt(0);
        Subsequence(s1.substring(1),s2+ch,list);
      return Subsequence(s1.substring(1),s2,list);


    }


    public static void main(String[] args) {
        String s1="abc";String s2="";

        System.out.println(Subsequence(s1,s2));
    }
    static ArrayList<String> Subsequence(String s1, String s2){

        if(s1.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(s2);
           return list;
        }
        char ch=  s1.charAt(0);
       ArrayList<String> left= Subsequence(s1.substring(1),s2+ch);
       ArrayList<String> right=  Subsequence(s1.substring(1),s2);
left.addAll(right);
return left;
    }


    public static void main(String[] args) {
        String s1="abc";String s2="";

        System.out.println(Subsequence(s1,s2));
    }
    static String Subsequence(String s1, String s2){
        if(s1.isEmpty()) {
            System.out.print(s2+" ");
           return s2;
        }
        char ch=  s1.charAt(0);
        Subsequence(s1.substring(1),s2+ch);
        Subsequence(s1.substring(1),s2+(ch+0));
        return Subsequence(s1.substring(1),s2);
    }



    public static void main(String[] args) {
        Permutation("", "abc");
    }

    static void Permutation(String s2, String s1) {
        if (s1.isEmpty()) {
            System.out.println(s2);
            return;
        }
        char ch = s1.charAt(0);
       for(int i=0;i<=s2.length();i++){
           String first=s2.substring(0,i);
           String second=s2.substring(i,s2.length());
           Permutation(first+ch+second,s1.substring(1));
       }
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
        int[] arr={1,2,3};
        List<List<Integer>> subsets=CallSubset(arr);

       for(List<Integer> subset:subsets){
           System.out.print(subset);
       }
    }
    public static List<List<Integer>> CallSubset(int[] arr){
        List<List<Integer>> subset=new ArrayList<>();
        GenerateSubset(0,arr,new ArrayList<>(),subset);
        return subset;
    }
    public static void GenerateSubset(int index,int[] nums,List<Integer> CurrentSubset,List<List<Integer>> subset){
        if(index==nums.length){
            subset.add(new ArrayList<>(CurrentSubset));


            return;
        }
        GenerateSubset(index+1,nums,CurrentSubset,subset);
        CurrentSubset.add(nums[index]);
        GenerateSubset(index+1,nums,CurrentSubset,subset);
        CurrentSubset.remove(CurrentSubset.size()-1);
    }


    public static void main(String[] args) {
        int N = 6;
        int[] arr = {3 ,34 ,4, 12, 5, 2};
       int  sum = 30;
        System.out.println(isSubsetSum(N,arr,sum));
    }

    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        Boolean ans=Subsethelper(0,arr,0,sum);
        return ans;
    }
    public static Boolean Subsethelper(int index,int[] arr,int SumTillNow,int TargetSum){
        if(index==arr.length){
           return SumTillNow==TargetSum;
        }
        if (Subsethelper(index+1,arr,SumTillNow+arr[index],TargetSum)){
           return true;
        }
        if(Subsethelper(index+1,arr,SumTillNow,TargetSum)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        NumPad("79","");
    }
    public static void NumPad(String s1, String s2){
        if(s1.isEmpty()){
            System.out.print(s2+" ");
            return;
        }
        int digit=s1.charAt(0)-'0';

       int i=(digit-2)*3;
       if(digit>7){
           i+=1;
       }
       int end=i+3;
       if(digit==7||digit==9){
           end+=1;
       }
        for( int j=i;j<end;j++){
            char ch=(char)('a'+j);
  NumPad(s1.substring(1),s2+ch);
        }

    }


    public static void main(String[] args) {
        System.out.println(NumPad("79",""));
    }
    public static List<String> NumPad(String s1, String s2){
        if(s1.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
            list.add(s2);
            return list;
        }
        int digit=s1.charAt(0)-'0';

        int i=(digit-2)*3;
        if(digit>7){
            i+=1;
        }
        int end=i+3;
        if(digit==7||digit==9){
            end+=1;
        }
        ArrayList<String>list=new ArrayList<>();
        for( int j=i;j<end;j++){
            char ch=(char)('a'+j);
           list.addAll( NumPad(s1.substring(1),s2+ch));
        }

        return list;
    }


    public static void main(String[] args) {
        DiceProblem("",4);
    }
    public static void DiceProblem(String s,int target){
        if(target==0){
            System.out.println(s);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            DiceProblem(s+i,target-i);
        }
    }


     public static void main(String[] args) {
         ArrayList<String>list=new ArrayList<>();
        DiceProblem("",4,list);
         System.out.println(list);
    }
    public static void DiceProblem(String s,int target,ArrayList<String>list ){
        if(target==0){
            list.add(s);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            DiceProblem(s+i,target-i,list);
        }
    }


    public static void main(String[] args) {

        System.out.println(DiceProblem("",4));

    }
    public static ArrayList<String> DiceProblem(String s,int target ){
        if(target==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){

            list.addAll(DiceProblem(s+i,target-i));
        }
  return list;
    }

     */
    //For facesdice
    public static void main(String[] args) {
Scanner in =new Scanner(System.in);
int face=in.nextInt();
        System.out.println(DiceProblem("",6,face));
    }
    public static ArrayList<String> DiceProblem(String s,int target ,int face){
        if(target==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        for(int i=1;i<=face&&i<=target;i++){
            list.addAll(DiceProblem(s+i,target-i,face));
        }
        return list;
    }
}



















