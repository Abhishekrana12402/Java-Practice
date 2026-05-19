public class CustomQueue {
   private int[] data;
   private static final int DEFAULT_SIZE=10;
int end=0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data=new int[size];
    }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
        //adding the element in the queue leads to O(1) complexity but removing the element lead to the O(n) complexity since all the elements are shifted to index-1
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove=data[0];
        //but we need to shift the element to index-1 hence perform the necessary operation
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void Display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue =new CustomQueue();
        queue.insert(1);
        queue.insert(4);
        queue.insert(10);
        queue.insert(0);
        queue.Display();
        System.out.println(queue.remove());
        queue.Display();
    }
}
