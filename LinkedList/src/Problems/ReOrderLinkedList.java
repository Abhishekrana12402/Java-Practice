package Problems;

public class ReOrderLinkedList {
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


        public void reorderList(ListNode head) {
ListNode mid=middleNode(head);

ListNode headFirst=head;
ListNode headSecond=reverseList(mid);



ListNode temp=null;
while(headFirst.next!=null&&headSecond.next!=null){
    temp=headFirst.next;
    headFirst.next=headSecond;
    headFirst=temp;
    temp=headSecond.next;
    headSecond.next=headFirst;
    headFirst.next=temp;
    headSecond=temp;
    display(head);
}
        }
    public static ListNode reverseList(ListNode head) {
       ListNode prev=null;
      ListNode pres=head;
       ListNode next=pres.next;
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
    public static ListNode middleNode(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }
        public static void display(ListNode temp){
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("End");
            System.out.println();
        }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3= new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
      node3.next = node4;
        node4.next=null;
       ReOrderLinkedList list=new ReOrderLinkedList();
       list.reorderList(head);
       list.display(head);

    }

}
