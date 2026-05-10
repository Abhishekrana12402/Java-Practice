import java.util.Date;
import java.util.Map;

public class DiameterOfTree {
    static int  max=0;
    static class TreeNode {
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

    public int diameterOfBinaryTree(TreeNode root) {
        Diameter(root);
        return max;
    }
    static int Diameter(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.left!=null){
            Diameter(node.left);
        }
        if(node.right!=null){
            Diameter(node.right);
        }
        int left=Height(node.left);
        int right=Height(node.right);
        int sum=left+right;
        max= Math.max(sum,max);
        return Math.max(left,right);


    }
    static int Height(TreeNode node){
        if (node==null){
            return 0;
        }
        return Math.max(Height(node.left),Height(node.right))+1;
    }

    public static void main(String[] args) {
        DiameterOfTree tree=new DiameterOfTree();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);

        System.out.println(tree.diameterOfBinaryTree(root));
    }
}