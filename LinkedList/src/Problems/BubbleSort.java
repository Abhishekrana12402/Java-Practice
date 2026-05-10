package Problems;

import CustomLinkedList.CustomLinkedList;

public class BubbleSort {
  private Node head;
  private Node tail;
  public int size;
    public class Node{
       int value;
       Node next;
       public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public Node get(int index){
       Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void Bubble(){
BubbleSort(size-1,0);
    }
  private void BubbleSort(int row,int col){
if(row==0){
    return;
}
if(col<row){
   Node first=get(col);
   Node second=get(col+1);

   if(first.value>second.value){
       if(first==head){
//           first.next=second.next;
//          head=second;
//
//          second.next=first;
           head.next=null;
           Node temp=second.next;
           second.next=head;
           head.next=temp;
           head=second;
       }
       else if(second==tail){
Node prev=get(col-1);
//tail=first;
//prev.next=second;
//second.next=first;
//first.next=null;
           prev.next=second;
           second.next=first;
           tail=first;
           tail.next=null;
       }
       else {
Node prev=get(col-1);
prev.next=second;
           first.next=second.next;
second.next=first;

       }
   }
   BubbleSort(row,col+1);
}
BubbleSort(row-1,0);

  }
    public void inertFirst(int value){

        Node temp=new Node(value);
        temp.next=head;
        head=temp;
       tail=temp.next;
       if(tail==null){
          tail=head;
       }
        size++;
    }
    public void insertLast(int value){
        if(tail==null){
            inertFirst(value);
            return;
        }
        Node temp=new Node(value);
       // tail.next=temp;
        tail.next=temp;
        tail=temp;
        tail.next=null;
        size++;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort sort=new BubbleSort();
        sort.insertLast(9);
        sort.insertLast(11);
        sort.insertLast(5);
        sort.insertLast(6);
        sort.insertLast(10);
        sort.display();
sort.Bubble();
sort.display();
    }
}
