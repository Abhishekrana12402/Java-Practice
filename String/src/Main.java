import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /* public static void main(String[] args) {
    //all the objects are converted to .toStrings and then concatinated and to concatinate atleast 1 datatypes should be string
         //length of the string
         String str="Hackishes";
         System.out.println(str.length());
         //Concatenation
         String First_Name="Tony";
         String Last_Name="Stark";
         String Full_Name=First_Name+" "+Last_Name;
         System.out.println("Name of the person is :"+Full_Name);

     }
    public static void main(String[] args) {
        String str="TonyStark";
        PrintLetters(str);
    }
    static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str="noon";
        Palindrome(str);
    }
    static void Palindrome(String str){
        int i=0;int j=str.length()-1;int mid=(i+j)/2;
        while(i<=mid&&j>=mid) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                if(i==j||j==mid+1){
                    System.out.println("Palindrome");
                }return;
            }
            else{
                System.out.println("not palindrome");
                return;
            }
        }
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        //w=west,n=north,e=east,s=south
        Displacement(str);
    }
    static void Displacement(String str){int x_initial=0;int y_initial=0;int x_final=0;int y_final=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x_final--;
            }
            if(str.charAt(i)=='E'){
                x_final++;
            }if(str.charAt(i)=='N'){
                y_final++;
            }if(str.charAt(i)=='S'){
                y_final--;
            }
        }
        int displacement=(int)Math.sqrt((Math.pow(x_final-x_initial,2))+(Math.pow(y_final-y_initial,2)));
        System.out.println("Total distance covered from the origin is:"+displacement);
    }
    //Strings comparison
    public static void main(String[] args) {
        String str1="tony";
        String str2="tony";
        String str3= new String("tony");//when new string is created and assign the name value as previous one
        // then strings leads to two different tony
        if(str1==str3){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        if(str1==str2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }//this concept is known as interning
        if(str1.equals(str3)){
            System.out.println("strings are equal");}
    }
    //Substring
    public static void main(String[] args) {
        String str = "HelloWorld";
        int start_index;
        int end_index;
        Substring(str, 0, 4);
        System.out.println(str.substring(0,5)); //function to print substring in range
    }
    static void Substring(String str, int start_index, int end_index) {
        String substring="";
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = start_index; i < end_index; i++) {
            substring += str.charAt(i);
        }
            System.out.println(substring);
    }
    public static void main(String[] args) {
        String[] str = {"apple", "mango", "banana"};
        String largest = str[0];
        System.out.println(largest);
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println("length of the string:"+ sb.length());

    }
    public static void main(String[] args) {
    String str="hello i am abhishek";
    ToUpperCase(str);
    }
    static void ToUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)== ' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        StringCompression(str);
    }
    static void StringCompression(String str){
        StringBuilder sb=new StringBuilder("");int count=1;
        sb.append(str.charAt(0));
        for(int i=0;i<str.length()-1;i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {if(count>1) {
                sb.append(count);
            }
                sb.append(str.charAt(i + 1));
                count = 1;
            }
        }if(count>1) {
            sb.append(count);
        }
        System.out.println(sb);
    }
    //another method
    public static void main(String[] args) {
        String str="aaabbcccdd";
        StringCompression(str);
    }
    static void StringCompression(String str){
        String newstr = new String("");
        for(int i=0;i<str.length()-1;i++) {
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
           newstr+=str.charAt(i);
            if(count>1) {
                newstr+=Integer.toString(count);
            }
        }
        System.out.println(newstr);
        }
   public static void main(String[] args) {
        String str=new String("abcd");
        Summation(str);
    }
    static void Summation(String str){int count=1;int sum=0;
        for(int i=0;i<str.length();i++){
            char ch='a';count=1;
            while(ch!=str.charAt(i)){
                ch++;
                count++;
            }
            sum+=count;

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String str= "a3b2c3d2";
        Decompression(str);
    }
    static void Decompression(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length()-1;i++) {
         int  count=Integer.parseInt(String.valueOf(str.charAt(i+1)));
            while(count!=0&&i<str.length()-1){
                sb.append(str.charAt(i));
                count--;
            }
            i+=1;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="ababcdcde";
        RemoveDuplicates(str);
    }
    static void RemoveDuplicates(String str) {
        StringBuilder sb = new StringBuilder("");
        //sb.append(str.charAt(0));
        for (int i=0;i<=str.length()-1;i++) {
            int temp=i-1;int count=0;
            while(i<str.length()-1&&temp>=0){
              if(str.charAt(i)==str.charAt(temp)) {
                  count++;
              }
                  temp--;
            }
            if(count==0){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        NumberOfVowels(str);
    }
    static void NumberOfVowels(String str){
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str="abhishek";
        String str1="rana";
        String str2="abhishek";
        System.out.println(str.equals(str1)+" "+str.equals(str2));
       String str3=("hackishes".replace("h",   "d"));
        System.out.println(str3);
        System.out.println(str.replace('a','b'));
    }

    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        Anagram(str1,str2);
    }
    static void Anagram(String str1,String str2) {//Anagram is basically all the elements(char) of str1 must contain in str2
        if (str1.length() == str2.length()) {
            Solution(str1, str2);
        }
    }
    static void Solution(String str1,String str2){
        int count=0;
    for(int i=0;i<str1.length()-1;i++) {
           for (int j = 0; j < str2.length() - 1; j++) {
               if (str1.charAt(i) == str2.charAt(j)) {
                   count++;
               }
           }
       }
       if(count==str1.length()-1){
           System.out.println("Above two Strings are anagram of each other");
       }
    }
    public static void main(String[] args) {
        String str="nayan";
        Palindrome(str);
    }
    static void Palindrome(String str){
        int flag=0;int start=0;int end=str.length()-1;int mid=(start+end)/2;
        while(start<end){

                if(str.charAt(start)==str.charAt(end)){
                    flag=1;
                }
                else{
                    flag=0;
                    return;
                }
                start++;
                end--;
        }
        if(flag==1){
            System.out.println("Given String is Palindrome");
        }
    }
    public static void main(String[] args) {
        String str = "sainyainfghgmawaraugear";
        String pat = "bwlinqxrixbxxbgkjorra";
        MinCommonIndex(str, pat);
    }
    static void  MinCommonIndex(String str, String pat) {
        int start = 0;
        int temp = 0;
        int flag = 0;
        while (start<str.length()-1) {
            if (str.charAt(start)==pat.charAt(temp)) {
                System.out.println(start);
                return;
            } else {
                flag=-1;
            }
            temp++;
            if (temp == pat.length() ) {

                temp = 0;
                start++;
            }
        }
        System.out.println(flag);
    }
    public static void main(String[] args) {
        String s="abcabcabcd";
        String x="abcd";
        strstr(s,x);
    }
    static void strstr(String s, String x){
      for(int i=0;i<s.length();i++){
          for(int j=i+1;j<s.length();j++){
              if(s.substring(i,j).equals(x)){
                  System.out.println(i);
                  return;
              }

          }
      }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] A1={45 ,15, 23, 8, 5, 12, 26, 444, 888 ,151, 12, 23, 45, 15, 56};
        int[] A2={15 ,888 ,444, 5 ,8, 12, 23};
        sortA1ByA2(A1,A2);
    }
    public static void sortA1ByA2(int A1[], int A2[]) {
        int temp=0;int N=15;int M=7;

        int start=0;
        for(int i=0;i<M;i++) {
            for (int j = 0; j < N; j++) {
                if (A2[i] == A1[j]) {
                    temp = A1[start];
                    A1[start] = A1[j];
                    A1[j] = temp;
                    start++;
                }
            }
        }Arrays.sort(A1,start,A1.length);
        System.out.println(Arrays.toString(A1));
    }
    public static void main(String[] args) {
        String S="aaabbaaa";
        RemoveConsecutiveCharacters(S);
    }
    static void RemoveConsecutiveCharacters(String S){
        String s="";
        if(S.length()==1){
            System.out.println(S);
        }
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)==S.charAt(i+1)){
                s+=S.charAt(i);
                i++;
            }
            else{
                s+=S.charAt(i);
            }
            if(i==S.length()-2){
               s+=S.charAt(i+1);
            }

        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s="gogo";
             firstRep(s);
    }
    static char firstRep(String s) {int start=0;int temp=1;int flag=0;
        while(start<s.length()-1){
            if(s.charAt(start)==s.charAt(temp)){
                System.out.println(s.charAt(temp));
                return s.charAt(temp);
            }
            else{
                temp++;
            }

            if(temp==s.length()){
                start++;
                temp=start+1;
            }
        }
   return (char)-1; }


    public static void main(String[] args) {
        String str1 = "abhishek";
        String str2 = "abhishek";
        String newstr = new String("abhishek");
        if (str1 == str2) {
            System.out.println(true);
        }
        if (str1 == newstr) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        String ans = new Integer(29) + "" + new ArrayList<>();
        System.out.println(ans);

    }


    public static void main(String[] args) {
        char ch='a';
        for(int i=0;i<26;i++){
            ch= (char) ('a'+i);
            System.out.print(ch);
        }
    }


    public static void main(String[] args) {
        String name="Abhishek Rana";
        System.out.println(Arrays.toString(name.toCharArray()));
        String a ="     Abhishek   ";
        System.out.println(a.strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }


    public static void main(String[] args) {
        String s="goog";boolean ans=false;
        int start=0;int end=s.length()-1;
        int mid=start+(end-start)/2;
        while(start<=mid){
            if(s.charAt(start)==s.charAt(end)){
              ans=true;
            }
            else{
                ans=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
       String a = "geeksforgeeks", b = "forgeeksgeeks";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String a, String b){

        if(a.length()!=b.length()) {
        return false;
        }
            char[] c=a.toCharArray();

       Arrays.sort(c);
       char[] d=b.toCharArray();
       Arrays.sort(d);
       for(int i=0;i<a.length();i++){
         if(c[i]!=d[i]){
             return false;
         }
       }

        return true;
}

     */
    public static void main(String[] args) {
String S="ccced";
        System.out.println(removeReverse(S));
    }
   static String removeReverse(String S) {
        // code here
        int[] temp=new int[26];
        StringBuilder sb =new StringBuilder(S);

        for(int i=0;i<S.length();i++){
            int a=S.charAt(i)-97;
           temp[a]++;
        }
       System.out.println(Arrays.toString(temp));
        for(int i=0;i<S.length();i++){

            int a=S.charAt(i)-97;
            if(temp[a]>1) {
                temp[a]--;
                sb = new StringBuilder(S.substring(i + 1));
//                sb.reverse();
                System.out.println(sb);

            }
        }
   return sb.toString(); }
}

