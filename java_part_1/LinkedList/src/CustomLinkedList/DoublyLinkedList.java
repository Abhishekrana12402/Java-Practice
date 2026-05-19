package CustomLinkedList;

public class DoublyLinkedList {
   private Node head;
   private Node tail;

private class Node {
    int value;
    Node prev;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        if(tail==null){
            tail=head;
        }
        head=node;
    }
    public void display(){
    Node node=head;
    Node last=null;
    while (node!=null){
        System.out.print(node.value+"->");
        last=node;
        node=node.next;
    }
        System.out.print("End");
        System.out.println();
    }
    public void displayReverse(){
        System.out.print("Print in Reverse: ");
    Node last=tail;
        while(last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.print("Start");
        System.out.println();
    }
//    public void insertLast(int value){
//    Node node=new Node(value);
//    tail.next=node;
//   tail=node;
//    }
    public void insertLast(int value){
        Node node=new Node(value);
        node.next=null;
    if(head==null){
        head=node;
        node.prev=null;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=node;
    node.prev=temp;
    tail=node;
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
public void insert(int value,int afterWhichNode){
Node prev=findPos(afterWhichNode);

if(prev==null) {
    System.out.println("Doest not exit");
}
    Node node=new Node(value);
    node.next= prev.next;
    prev.next=node;
    node.prev=prev;
    if(node.next!=null) {
        node.next.prev = node;
}
}
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.displayReverse();
        list.insertLast(0);
        list.display();
        list.insert(12,4);
        list.display();
    }
}
