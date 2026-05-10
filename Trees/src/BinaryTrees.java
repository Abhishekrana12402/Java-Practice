import java.util.Scanner;

public class BinaryTrees {
//    public BinaryTrees(){
//
//    }
    private static class Node{
        private int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the left of "+node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of"+ node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter the right of "+node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of"+ node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }

    }
    public void display(){
        display(root,"");
        PrettyDisplay(root,0);
    }
    private void display(Node node,String indent){
if (node==null){
    return;
}
        System.out.println(indent+node.value);
display(node.left,indent);
display(node.right,indent);
    }
    public void PrettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        PrettyDisplay(node.right,level+1);
        if(level!=0){
            for (int i=0;i<level-1;i++){
                System.out.println("|\t\t");
            }
            System.out.println("|----->");
            System.out.println(node.value);

        }
        else {
            System.out.println(node.value);
        }
        PrettyDisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTrees tree=new BinaryTrees();
        tree.populate(scanner);
        tree.display();
    }
}