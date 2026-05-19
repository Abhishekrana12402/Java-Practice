package CustomLinkedList;

public class Main {
    public static void main(String[] args) {
  CustomLinkedList customLinkedList=new CustomLinkedList();
customLinkedList.insertFirst(3);
        customLinkedList.insertFirst(4);
        customLinkedList.insertFirst(5);
        customLinkedList.insertFirst(6);
        customLinkedList.insertFirst(7);
customLinkedList.insertLast(10);
       customLinkedList.display();
        System.out.println();
       customLinkedList.insert(19,3);
       customLinkedList.display();
        System.out.println();
        System.out.println(customLinkedList.deleteFirst());
        customLinkedList.display();
        System.out.println();
        customLinkedList.deleteLast();
        customLinkedList.display();
        System.out.println(customLinkedList.deleteLast());
        customLinkedList.display();
        System.out.println();
        System.out.println(customLinkedList.delete(2));
        customLinkedList.display();
        System.out.println();
        System.out.println(customLinkedList.findPos(6));
        customLinkedList.insertUsingRecursion(2,2);
        customLinkedList.display();
    }
}