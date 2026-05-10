package Problems;

public class ReverseLinkedListInRange {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        //no change in the LinkedList will be done as pointer lies on the same node
        if(left==right){
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        for(int i=1;present!=null&&i<left;i++){
            prev=present;
            present=present.next;
        }
        //now present will be pointing to the node from which we have to reverse the LinkedList
        ListNode last=prev;
        ListNode newEnd=present;
        ListNode next=present.next;
        for(int i=0;present!=null&&i<right-left+1;i++){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null) {
                next = next.next;
            }
        }
        if(last==null){
            head=prev;
        }
        else{
            last.next=prev;
        }
        newEnd.next=present;

        return head;
    }
    public void display(ListNode head){
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
        ReverseLinkedListInRange list=new ReverseLinkedListInRange();
        list.display(head);
        reverseBetween(head,1,4);
        list.display(head);

    }
}

