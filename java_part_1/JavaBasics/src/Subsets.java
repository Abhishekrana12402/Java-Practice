import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        ArrayList<ArrayList<Integer>>OuterList=new ArrayList<>();
OuterList.add(new ArrayList<>()); int start=0;int end=0;
for(int j=0;j<arr.length;j++){
    start = 0;
    int n = OuterList.size();
    if(j>0&&arr[j]==arr[j-1]){
start=end+1;
    }

    end=OuterList.size()-1;
    for( int i=start;i<n;i++){
        ArrayList<Integer>InnerList=new ArrayList<>(OuterList.get(i));
        InnerList.add(arr[j]);
        OuterList.add(InnerList);

    }

}
        System.out.println(OuterList);
    }
}
