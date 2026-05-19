package Problems;

public class RemoveVal {

      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public static ListNode removeElements(ListNode head, int val) {
            Helper(head,val);
            return head;
        }
       static ListNode  Helper(ListNode head, int val){
            if(head==null){
                return null;
            }
            if(head.val==val){
                return head.next;
            }
            ListNode prev=head;
            ListNode temp=Helper(head.next,val);
            prev.next=temp;
            prev=temp;
            if(temp.next==null){
                return null;
            }
            return prev;

        }
    static void Display(ListNode head){
          ListNode curr=head;
          while (curr!=null){
              System.out.print(curr.val+"->");
              curr=curr.next;
          }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(6);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(6);
        removeElements(head,6);
        Display(head);

    }
}
