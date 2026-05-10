package Problems;

import java.util.ArrayList;

public class List {
    private static Node head;
    private  Node tail;
    public int size;
    public class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void inertFirst(int value){

       Node temp =new Node(value);
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
       Node temp= new Node(value);
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
    private void Reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        Reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public Node reverseList(Node head) {
        Node prev=null;
        Node pres=head;
        Node next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }

        }
        head=prev;
        return head;
    }


        public static void main(String[] args) {

List list=new List();
list.insertLast(5);
            list.insertLast(4);
            list.insertLast(3);
            list.insertLast(2);
            list.insertLast(1);
            list.insertLast(0);
list.display();
list.Reverse(head);
list.display();
            System.out.println(list.reverseList(head));
           list.display();
        }

    }
