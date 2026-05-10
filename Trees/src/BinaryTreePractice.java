import java.util.Scanner;
public class BinaryTreePractice {
    public BinaryTreePractice(){
    }
    public class Node{
        private int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;
    public void Populate(Scanner scanner){
        System.out.println("Enter the root Node");
        int value= scanner.nextInt();

        root=new Node(value);
        Populate(scanner,root);
    }
    public void Populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the left of"+node.value);
        boolean left= scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left of "+node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            Populate(scanner,node.left);
        }
        System.out.println("Do you want to enter the right of"+ node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right of "+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            Populate(scanner,node.right);
        }
    }
    public void Display(Node root){
        Display(root,"");
    }
    public void Display(Node node,String indent){
        if (node==null){
            return;
        }
        System.out.println(indent+node.value);
        Display(node.left,indent);
        Display(node.right,indent);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
BinaryTreePractice tree=new BinaryTreePractice();
tree.Populate(scanner);
tree.Display(tree.root);
    }
}
