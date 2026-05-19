package CustomLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
        public void insert(int value){
            Node node=new Node(value);
            if(head==null){
               head=node;
               tail=node;
               return;
            }
            tail.next=node;
            node.next=head;
            tail=node;
        }
        public void display() {
            Node temp = head;
            do{
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            while (temp!=head);
            System.out.println("Head");
            System.out.println();

        }
        public void delete(int value){
        Node temp=head;
        if(temp==null){
            return;
        }
        if(temp.value==value){
            tail.next=head;
            head=head.next;
        }
        do{
            Node next=temp.next;
            if(next.value==value){
               temp.next=next.next;
               break;
            }
            temp=temp.next;
        }
        while (temp!=head);
        }
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();
        list.delete(4);
        list.display();
    }
}
