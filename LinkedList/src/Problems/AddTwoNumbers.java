package Problems;

public class AddTwoNumbers {

    static class ListNode {
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
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode dummy=new ListNode(0);
ListNode current=dummy;int sum;int carry=0;
while (l1!=null||l2!=null||carry==1){
    sum=0;
    if(l1!=null){
        sum+=l1.val;
        l1=l1.next;
    }
    if(l2!=null){
        sum+=l2.val;
        l2=l2.next;
    }
    sum+=carry;
    carry=sum/10;
    sum%=10;
    ListNode node=new ListNode(sum);
    current.next=node;
    current=node;
}
            return dummy.next;
        }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode nod1 = new ListNode(9);
        ListNode nod2 = new ListNode(9);
        ListNode nod3= new ListNode(9);
        ListNode nod4 = new ListNode(9);
        l1.next = nod1;
        nod1.next = nod2;
        nod2.next = nod3;
        nod3.next = nod4;
        nod4.next=null;
        ListNode l2 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3= new ListNode(2);
        ListNode node4 = new ListNode(9);
        l2.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
       ListNode ans= addTwoNumbers( l1, l2);
       while (ans!=null){
           System.out.print(ans.val+"->");
           ans=ans.next;
       }
        System.out.println("End");
        System.out.println();
    }
}
