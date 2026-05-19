package CustomLinkedList;

public class CustomLinkedList {
   private Node head;
   private Node tail;
   private int size;
    public CustomLinkedList() {
        this.size=0;
    }



    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
}
public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->" );
            temp=temp.next;
        }
}
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public  int deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;

    }
//    public void deleteLast(){
//        Node temp=head;
//        while(temp!=null){
//            if(temp.next.next==null){
//               Node temp1= temp.next;
//               temp.next=temp.next.next;
//            }
//            temp=temp.next;
//        }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        return value;
    }
    public int delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node prev=get(index-1);
int value=prev.next.value;
prev.next=prev.next.next;
        return value;
    }
    public Node findPos(int value){
        Node node=head;
        while (node!=null){
           if(node.value==value){
             return node;
           }
           node=node.next;
        }
        return null;
    }
//insert using recursion
public void insertUsingRecursion(int value ,int index) {
insertRecursion(value,index,head);

    System.out.println(head.value);
}
private Node insertRecursion(int value,int index,Node node){
        if(index==0){
            Node temp=new Node(value,node);
            size++;
            return temp;
        }
      node.next=insertRecursion(value,index-1,node.next);
return node;

}
}
