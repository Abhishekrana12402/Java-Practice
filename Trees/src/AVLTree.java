public class AVLTree {
    public AVLTree(){

    }
    public class Node{
        private int value;
        Node left;
        Node right;
        private int height;
        public Node(int value){
            this.value=value;
        }
    }
    private static Node root;
    private int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean Balance(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1&&Balance(node.left)&&Balance(node.right);
    }
    public void Populate(){
      for(int i=0;i<1000;i++){
          insert(i);
      }
    }
    public void insert(int value){
       root= Insert(value,root);
    }
    public Node Insert(int value,Node node){
        if (node==null){
            Node temp=new Node(value);
            return temp;
        }
        else if(value<node.value){
            node.left=Insert(value,node.left);
        }
        else if(value>node.value){
            node.right=Insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }
    public Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left left case
              return   rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //left right case
                node.left=leftRotate(node.left);
                return   rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //left left case
                return   leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                //left right case
                node.right=rightRotate(node.right);
                return   leftRotate(node);
            }
        }
        return node;
    }
    public Node leftRotate(Node node){
Node temp=node.right;
Node t=temp.left;
temp.left=node;
node.right=t;
        node.height=Math.max(height(node.left),height(node.right))+1;
        temp.height=Math.max(height(temp.left),height(temp.right))+1;
        return temp;

    }
    public Node rightRotate(Node node){
        Node temp=node.left;
        Node t=temp.right;
        temp.right=node;
        node.left=t;
        node.height=Math.max(height(node.left),height(node.right))+1;
        temp.height=Math.max(height(temp.left),height(temp.right))+1;
        return temp;

    }
    public void display(Node root){
        Display(root,"Root Node is");
    }
    public void Display(Node node,String message){
        if (node==null){
            return;
        }
        System.out.println(message+node.value);
        Display(node.left,"Left of "+node.value+"is ");
        Display(node.right,"Right of "+node.value+" is");
    }


    public static void main(String[] args) {
        AVLTree tree=new AVLTree();
        tree.Populate();
        System.out.println(tree.height(root));

    }
}
