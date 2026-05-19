package Problems;//package Problems;// Node class represents each element in the LinkedList

 class Node{

    int data;
    Node next;

    // Constructor to create a new node
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class LL{

    private Node head;
    private Node tail;

    //insertion at First
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }

    // insert at Last
    public void insertAtLast(int val){
        if(tail == null) insertAtFirst(val);
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
    }

    //insert at gaiven location
    public void insertAt(int val, int index){
        if(index == 0) insertAtFirst(val);
        else {
            Node temp = head;
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;

        }
    }

    //delete at First
    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
    }

    // delete at Last
    public void deleteLast(){
        if(head == tail) deleteFirst();
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
    }

    // delete at certain index
    public void deleteAt(int index){
        if(index == 0) deleteFirst();
        else{
            Node temp = head;
            for(int i = 0; i < index-1 && temp.next!= null; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    // display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(5);
        list.display();
        list.insertAtFirst(18);
        list.display();
        list.insertAtFirst(25);
        list.display();
        list.insertAtFirst(9);
        list.display();
        list.insertAtLast(30);
        list.display();
        list.insertAtLast(35);
        list.display();
        list.insertAt(20,3);
        list.display();
        list.insertAt(50,0);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAt(7);
        list.display();
    }
}