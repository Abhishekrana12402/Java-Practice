package Problems;

import javax.swing.event.ListDataEvent;
import java.util.List;

public class RotateLinkedListByK {
    private static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void rotateRight(ListNode head, int k) {
if(k==0||head==null||head.next==null){
    Display(head);
    return;
}
        ListNode current=head;int length=1;
while (current.next!=null){
    current=current.next;
    length++;
}
current.next=head;
k=k%length;
length=length-k;
while(length!=0){
    length--;
    current=current.next;
}
head=current.next;
current.next=null;
Display(head);

    }
    public static void Display(ListNode head) {

        ListNode temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.val + "->");
            temp1 = temp1.next;
        }
        System.out.println("End");
        System.out.println();

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        head.next=node2;
       node2.next=node3;
       node3.next=node4;
       node4.next=null;
        rotateRight(head,5);

    }
}
