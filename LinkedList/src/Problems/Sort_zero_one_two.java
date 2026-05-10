package Problems;

import java.util.LinkedList;

public class Sort_zero_one_two {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static  Node segregate(Node head)
    {
        // add your code here
        Node temp=head;
        Node zero=new Node(0);
        Node zero1=zero;
        Node one=new Node(1);
        Node one1=one;
        Node two=new Node(2);
        Node two1=two;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            if(temp.data==2){
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=null;
        one.next=null;
        two.next=null;
        if(zero1.next==null&&one1.next==null&&two1.next==null){
            return null;
        }
        if(zero1.next!=null){
            head=zero1.next;
            if(one1.next==null){
                zero.next=two1.next;
            }
            else{
                zero.next=one1.next;
                one.next=two1.next;
            }
        }
        else {
            if(one1.next==null){
               head=two1.next;

            }
            else {
                head=one1.next;
                one.next=two1.next;
            }
        }
        Node temp1=head;
        while (temp1!=null){
            System.out.print(temp1.data+"->");
            temp1=temp1.next;
        }
        System.out.print("End");
        System.out.println();

        return head;
    }

    public  static void main(String[] args) {
        Node head=new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(2);
        Node node3=new Node(1);
        Node node4=new Node(2);
        Node node5=new Node(2);
        Node node6=new Node(2);
        Node node7=new Node(2);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=null;
      segregate(head);


    }
}
