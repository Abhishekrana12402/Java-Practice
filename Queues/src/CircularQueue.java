public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
  protected   int end=0;
   protected int front=0;
   protected int size=0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data=new int[size];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove=data[front++];
        front=front%data.length;
        size--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void Display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do {
            System.out.print(data[i]+"->");
            i++;
            i%=data.length;
        }
        while (i!=end);
        System.out.println("End");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue=new CircularQueue();
        queue.insert(0);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.remove() ;
        queue.insert(12);
        queue.Display();

    }
}
