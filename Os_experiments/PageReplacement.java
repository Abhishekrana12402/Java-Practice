package Os_experiments;
public class PageReplacement {
    public static void main(String[] args) {
        int[] pages = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
        int capacity = 3;
       int ans= getfaults(pages,capacity);
        System.out.println(ans);
    }
    static int getfaults(int[] pages ,int capacity){
        int index=0;
        int[] cache =new int[capacity];int faults =0;
        for(int page:pages){
            boolean found =false;
            for(int i=0;i<capacity;i++){
                if(cache[i]==page){
                    found=true;
                    break;
                }
            }
            if(!found){
                cache[index]=page;
                index=(index+1)%capacity;
                faults++;
            }
        }
        return faults;
    }
}
