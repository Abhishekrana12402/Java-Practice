class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Cousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean LevelCompare=Level(root,x,0)==Level(root,y,0);
        return LevelCompare&&SiblingCheck(root,x,y);
    }
    static boolean SiblingCheck(TreeNode node,int x,int y){
        if(node.left!=null&&node.right!=null){
            if(node.left.val==x&&node.right.val==y||node.left.val==y&&node.right.val==x){
                return false;
            }
        }
        boolean ans=true;
        if (node.left!=null){
          ans=  SiblingCheck(node.left,x,y);
        }
        if (!ans){
            return ans;
        }
        if (node.right!=null){
           ans= SiblingCheck(node.right,x,y);
        }
        return ans;
    }
    static int Level(TreeNode node,int elem,int level){
        if(node.val==elem){
            return level;
        }
        int temp=0;
        if(node.left!=null){
            temp= Level(node.left,elem,level+1);
        }
        if(temp!=0){
            return temp;
        }
        if(node.right!=null){
          temp= Level(node.right,elem,level+1);
        }

       return temp;
    }

    public static void main(String[] args) {
        Cousins tree=new Cousins();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        System.out.println(tree.isCousins(root,4,5));
    }
}
