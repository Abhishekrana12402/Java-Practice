package Problems;

public class MergeTwoSortedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
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
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
       Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public static MergeTwoSortedList merge(MergeTwoSortedList list1,MergeTwoSortedList list2){
        Node head1=list1.head;
        Node head2=list2.head;
        MergeTwoSortedList list=new MergeTwoSortedList();
        while(head1!=null&&head2!=null){
            if(head1.value<head2.value){
                list.insertLast(head1.value);
                head1=head1.next;
            }
            else{
                list.insertLast(head2.value);
                head2=head2.next;
            }
        }
        while (head1!=null){
            list.insertLast(head1.value);
            head1=head1.next;
        }
        while(head2!=null){
            list.insertLast(head2.value);
            head2=head2.next;
        }
        return list;
    }


    public void display(){
       Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->" );
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       MergeTwoSortedList list1=new MergeTwoSortedList();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        MergeTwoSortedList list2=new MergeTwoSortedList();
        list2.insertLast(1);
        list2.insertLast(5);
        list2.insertLast(10);
        MergeTwoSortedList list=new MergeTwoSortedList();
     list=  merge(list1,list2);
        list.display();
    }
}
