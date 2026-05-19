package Problems;

import java.util.Stack;

public class MyQueue {
    Stack<Object> first;
    Stack<Object>second;

public MyQueue() {
first=new Stack<>();
second=new Stack<>();
    }

    public void push(int x) {
first.push(x);
    }

    public int pop() {
while (!first.isEmpty()){
    second.push(first.pop());
}
int remove= (int) second.pop();
while (!second.isEmpty()){
    first.push(second.pop());
}
return remove;
    }

    public int peek() {
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peek= (int) second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }

    public boolean empty() {
return first.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
    }
}
