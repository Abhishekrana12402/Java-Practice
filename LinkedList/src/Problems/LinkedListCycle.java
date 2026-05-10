package Problems;

import java.util.List;

public class LinkedListCycle {
    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(3);
        Node node1 = new Node(2);
        Node node2 = new Node(0);
        Node node3 = new Node(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        System.out.println(hasCycle(head));
        System.out.println(LengthOfCycle(head));
    }

    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public static int LengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;int count=0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow=slow.next;
                count++;
              while(slow!=fast){
                  count++;
                  slow=slow.next;
              }
              break;
            }

        }

   return count;
    }
}
