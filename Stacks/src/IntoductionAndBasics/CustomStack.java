package IntoductionAndBasics;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
public CustomStack(){
    this(DEFAULT_SIZE);
}
    public CustomStack(int size) {
        this.data=new int[size];
    }
    public boolean push(int item){
    if(isFull()){
        System.out.println("Stack is Full");
        return false;
    }
    ptr++;
    data[ptr]=item;
    return true;
    }
    public boolean isFull(){
    return ptr==data.length-1;
    }
    public boolean isEmpty(){
    return ptr==-1;
    }
    public int pop() throws StackException {
    if(isEmpty()){
        throw new StackException("Cannot pop elements fromm empty stack");
    }
//   int remove=data[ptr];
//    ptr--;
//    return data[ptr];
        return data[ptr--];
    }
    public int peek() throws StackException {
    if(isEmpty()) {
        throw new StackException("Cannot peek elements fromm empty stack");
    }
    return data[ptr];
    }

    public static void main(String[] args) throws StackException {
CustomStack stack=new CustomStack(5);
 stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
       // System.out.println(stack.pop());
    }
}
