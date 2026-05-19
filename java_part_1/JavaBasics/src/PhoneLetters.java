import java.util.ArrayList;
public class PhoneLetters {
    public static void main(String[] args) {
        int[] a={7,8,9};
        System.out.println(possibleWords(a,a.length));
    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here
        ArrayList<String>ans=Helper(a,N,"",0);
        return ans;
    }
    static ArrayList<String>Helper(int[] arr,int n,String up,int index){
        if (index==n){
            ArrayList<String>list=new ArrayList<>();
            list.add(up);
            return list;
        }
        int start=(arr[index]-2)*3;

        int digit=arr[index];
        if(arr[index]>7){
            start++;
        }
        int end=start+3;
       if(arr[index]==7||arr[index]==9){
           end++;
       }

        ArrayList<String>list=new ArrayList<>();
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            list.addAll(Helper(arr,n,up+ch,index+1));
        }
        return list;
    }

}
