package Problems;

public class MergeSortLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode middle=middleNode(head);
        System.out.println(middle.val);
        ListNode left=sortList(head);

        ListNode right=sortList(middle);
        return merge(left,right);
    }

    public static ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//
//        }
//        return slow;
        ListNode midPrev=null;
        while (head!=null&&head.next!=null){
            midPrev=(midPrev==null)?head:midPrev.next;
            head=head.next;

        }
        ListNode mid=midPrev.next;
        midPrev.next=null;
        return mid;

    }
    public static void display(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public static ListNode merge(ListNode list1,ListNode list2) {
        ListNode head=new ListNode();
        ListNode tail=head;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        if(list1!=null){
            tail.next=list1;
        }
        if(list2!=null){
            tail.next=list2;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(1);
        ListNode node3=new ListNode(3);
head.next=node1;
node1.next=node2;
node2.next=node3;
node3.next=null;
        System.out.println(sortList(head));
        display(head);
    }
}
