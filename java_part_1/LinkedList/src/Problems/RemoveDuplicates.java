package Problems;

public class RemoveDuplicates {
    private Node  head;
    private Node  tail;
    private int size;
    public RemoveDuplicates() {
        this.size=0;
    }
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
    public void  removeDuplicates(){

        Node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }


    public void display(){
       Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->" );
            temp=temp.next;
        }
        System.out.println();
    }
    public void merge(RemoveDuplicates list1, RemoveDuplicates list2){

    }

    public static void main(String[] args) {
RemoveDuplicates list1=new RemoveDuplicates();
        list1.insertLast(1);
        list1.insertLast(1);
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(2);

        list1.insertLast(4);
        list1.removeDuplicates();
        list1.display();


    }
}
