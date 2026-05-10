package Problems;

public class PalindromeInLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);

ListNode reverse=reverseList(mid);
ListNode reverseAgain=reverse;
while (head!=null&&reverse!=null){
    if(head.val!=reverse.val){
        return false;
    }
    head=head.next;
    reverse=reverse.next;
}
 ListNode finalList=reverseList(reverseAgain);

return true;
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

    public void display(ListNode head){
      ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3= new ListNode(2);
       ListNode node4 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
      node2.next = node3;
        node3.next = node4;
    node4.next=null;
        System.out.println(isPalindrome(head));
        PalindromeInLinkedList list=new PalindromeInLinkedList();
        list.display(head);
    }
}
