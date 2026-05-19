package Problems;

public class Alternate {
    public static class ListNode {
        int val;
      ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        System.out.println(AlternateProblem(head));
        display(head);
    }
    public static void display(ListNode head){
      ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }


    public static ListNode AlternateProblem(ListNode head){
        ListNode temp=head.next;
        if(temp.next==null){
            return head;
        }
       ListNode curr=head.next.next;
        head.next=curr;
        head=curr;

       AlternateProblem(head);
      head.next=temp;
     head=temp;
     return head;

    }
}
