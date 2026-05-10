import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Recursion2 {
    public static void main(String[] args) {
        int[] arr={5,1,2,4,3};
       // MergeSort(arr,0,arr.length-1);
       // QuickSort(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
       // System.out.println(RemoveAsFromString("baccad",""));
      // String ans=RemoveAsFromString2("baccad");
        // System.out.println(ans.length());
        ArrayList<String>list=new ArrayList<>();
        System.out.println(Subsets("abc",list,""));
        System.out.println(Subsets2("abc",""));
    }
    static void MergeSort(int[] arr,int start,int end){
 int mid= start+(end-start)/2;
 if(start>=end){
     return;
 }
 MergeSort(arr,start,mid);
 MergeSort(arr,mid+1,end);
 MergeSorting(arr,start,mid,end);
    }
    static void MergeSorting(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1];int k=0;
        int j=mid+1;int i=start;
        while (i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=end){
            temp[k++]=arr[j++];
        }
        k=0;
        while (k< temp.length){
            arr[start++]=temp[k++];
        }
    }
    static void QuickSort(int[] arr,int start,int end){

        if(start>=end){
            return;
        }
        int Pivot=FindPivot(arr,start,end);
        QuickSort(arr,start,Pivot-1);
        QuickSort(arr,Pivot+1,end);
    }
    static int FindPivot(int []arr,int start,int end){
        int Pivot=arr[end];int index=start-1;
        for(int i=start;i<=end;i++){
           if(arr[i]<Pivot){
               int temp=arr[++index];
               arr[index]=arr[i];
               arr[i]=temp;
           }
        }
        int temp=arr[++index];
        arr[index]=arr[end];
        arr[end]=temp;
        return index;
    }
    static String RemoveAsFromString(String org,String ans){
        if(org.length()==0){
            return ans;
        }
        char ch=org.charAt(0);
        if(ch!='a'){
            ans+=ch;
        }
       return RemoveAsFromString(org.substring(1),ans);
    }
    static String RemoveAsFromString2(String og){
        if(og.length()==0){
            return "";
        }
        char ch=og.charAt(0);
        if(ch!='a'){
            return ch+RemoveAsFromString2(og.substring(1));
        }
        return RemoveAsFromString2(og.substring(1));
    }
    static List<String>Subsets(String s,ArrayList<String>list,String up){
if(s.isEmpty()){
   list.add(up);
   return list;
}
char ch=s.charAt(0);
Subsets(s.substring(1),list,up+ch);
      return   Subsets(s.substring(1),list,up);
    }
    static ArrayList<String>Subsets2(String og,String up){

        if(og.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(up);
            return list;
        }
        char ch=og.charAt(0);
        ArrayList<String>left=Subsets2(og.substring(1),up+ch);
        ArrayList<String>right=Subsets2(og.substring(1),up);


        left.addAll(right);
        return left;
    }
}
