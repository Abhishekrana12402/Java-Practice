public class LinkedListProblem {
    private Node head;
    static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            this.next=null;
        }
    }
//LinkedListProblem(){
//        head=null;
//}
    void insert(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }

        else{
            Node b=head;
            while (b.next!=null){
                b=b.next;
            }
            b.next=temp;
        }

    }
    void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListProblem list=new LinkedListProblem();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.display();


    }
}
