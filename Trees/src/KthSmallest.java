public class KthSmallest {
    private static int max;
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



        public int sumNumbers(TreeNode root) {

             maxPathSum(root);
             return max;
        }


            public int maxPathSum(TreeNode root){
                if(root==null){
                    return 0;
                }
                int left=maxPathSum(root.left);
                int right=maxPathSum(root.right);
                max=Math.max(max,(left+right+root.val));
                return left+right+root.val;
            }


    public static void main(String[] args) {
        KthSmallest tree=new KthSmallest();
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(tree.maxPathSum(root));
        System.out.println(max);
    }
}
