package IntoductionAndBasics;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        //takes care of stack is full or not
        if(this.isFull()){
            //double the size
            int[] temp=new int[data.length*2];
            //copy all the items in new array
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        //insert item
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        DynamicStack stack=new DynamicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
