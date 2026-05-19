public class Symmetric {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left,root.right);
        }
        static boolean Symmetric(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null){
            return true;
        }
        if(node1!=null&&node2!=null&&node1.val==node2.val){
            return Symmetric(node1.left,node2.right)&&Symmetric(node1.right,node2.left);
        }
        else {
            return false;
        }
        }

        public static void main (String[]args){
            Symmetric tree = new Symmetric();
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(2);

            root.left.right = new TreeNode(3);
            root.right.left = new TreeNode(3);

            System.out.println(tree.isSymmetric(root));
        }
    }
