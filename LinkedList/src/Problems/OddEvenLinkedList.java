package Problems;

import javax.xml.stream.events.EndDocument;
import java.util.LinkedList;
import java.util.List;

public class OddEvenLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(9);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(8);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(7);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        oddEvenList(head);
//        ListNode temp=head;
//        while(temp!=null){
//            System.out.print(temp.val+"->");
//            temp=temp.next;
//        }
//        System.out.println("End");
   }
    public static ListNode oddEvenList(ListNode head) {
ListNode prev=head;
ListNode curr=prev.next;
ListNode temp1=curr;
while(prev.next!=null&&prev.next.next!=null){
    ListNode temp=prev.next.next;
    prev.next=temp;
    prev=temp;
    System.out.println(temp.val);
}
        while(curr.next!=null&&curr.next.next!=null){
            System.out.println(curr.val);
            ListNode temp2=curr.next.next;
            curr.next=temp2;
            System.out.println(temp2.val);
            curr=temp2;
        }
        curr.next=null;
        if(prev.next==null){
            prev.next=temp1;
        }
        return head;

    }
}
