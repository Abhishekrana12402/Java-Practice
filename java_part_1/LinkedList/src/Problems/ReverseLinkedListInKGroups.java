package Problems;

import java.util.HashSet;

public class ReverseLinkedListInKGroups {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
  /*  public static ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;int count=0;
        ListNode temp=current;int lengthremaining=0;
        while(temp!=null){
            lengthremaining++;
            temp=temp.next;
        }
        if(lengthremaining>=k){
            while(current!=null&&count<k){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
                count++;
            }
        }
        else{

            return current;
        }
        if(next!=null){
            head.next=reverseKGroup(next,k);
        }

        return prev;
    }*/
  public static ListNode reverseKGroup(ListNode head, int k) {
      ListNode prev=null;
      ListNode current=head;
      ListNode temp=head;int count=0;
      while(temp!=null){
          count++;
          temp=temp.next;
      }
      while(true) {

          ListNode next = current.next;
          ListNode last = prev;
          ListNode newend = current;
          for (int i = 0; current != null && i < k; i++) {
              current.next = prev;
              prev = current;
              current = next;
              if (next != null) {
                  next = next.next;
              }
              count--;
          }
          if (last == null) {
              head = prev;
          } else {
              last.next = prev;
              // current.next=last;
          }
          newend.next = current;
          if (current == null) {
              break;
          }
          prev = newend;
          if(count<k){
return head;
          }
      }
      return head;
  }
    public static void display(ListNode head){
        ListNode temp=head;
        //System.out.println(temp.val);
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();

    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
       head= reverseKGroup(head,3);
        display(head);
    }
}
