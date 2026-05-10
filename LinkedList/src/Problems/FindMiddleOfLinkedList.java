package Problems;

public  class FindMiddleOfLinkedList {
    private static class Node {
     int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node node1 = new Node(2);
        Node node2 = new Node(0);
        Node node3 = new Node(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println(middleNode(head).val);
    }

    public static Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }
}
