package CustomLinkedList;

public class MyLinkedList {
   private Node head;
   private Node tail;
   private int size;
   public class Node{
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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
   public void insertOne(int value){
       Node node=new Node(value);
       node.next=head;
       head=node;
       size++;
       if(tail==null){
           tail=head;
       }
   }
   public void insertAtLast(int value){
       Node node =new Node(value);
       if(tail==null){
           insertOne(value);
           return;
       }
       tail.next=node;
       tail=node;
       size++;
   }
   public void insertAtAnyPosition(int index,int value){
       if(index==0){
           insertOne(value);
           return;
       }
       if(index==size){
           insertAtLast(value);
           return;
       }
       Node temp=head;
       for(int i=1;i<index;i++){
           temp=temp.next;

       }
       Node node=new Node(value,temp.next);
       temp.next=node;
       size++;
   }
public void deleteFirst(){
       Node temp=head;
       head=temp.next;
       size--;
}
//public void deleteLast(){
//       Node temp =head;
//       while(temp!=null){
//           if(temp.next.next==null){
//               temp.next=null;
//               tail=temp;
//               return;
//           }
//           temp=temp.next;
//       }
//}
    public Node get(int index){
       Node temp=head;
       for(int i=0;i<index;i++){
           temp=temp.next;
       }
       return temp;
    }
    public void deleteLast() {
        Node secondLast = get(size - 2);
        secondLast.next=null;
        tail=secondLast;
        tail.next=null;
        size--;
    }
    public void deleteAtAnyPosition(int index){
       if(index==0){
           deleteFirst();
       }
       if(index==size-1){
           deleteLast();
       }
Node temp=head;
for(int i=1;i<index;i++){
    temp=temp.next;
}
int value=temp.next.value;
temp.next=temp.next.next;
size--;

    }
    public int  getIndex(int val){
       Node node=head;int count=0;
       while(node!=null) {
           if (node.value == val) {
              return count;
           }
           count++;
           node = node.next;
       }
       return-1;
    }
       public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.insertOne(12);
        list.insertOne(13);
        list.insertOne(14);
        list.insertOne(15);
        list.display();
        list.insertAtLast(16);
        list.display();
        list.insertAtAnyPosition(2,17);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtAnyPosition(1);
        list.display();
           System.out.println(list.getIndex(15));

    }
}
