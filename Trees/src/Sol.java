public class Sol {

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


    static int max=0;
    public int maxPathSum(TreeNode root) {

        if(root==null||root.left==null&&root.right==null){
            return 0;
        }
        MaxPathSum(root);
        return max;
    }
    public int MaxPathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=MaxPathSum(root.left);
        int right=MaxPathSum(root.right);
        max=Math.max(max,(left+right+root.val));
        return Math.max(left,right)+root.val;
    }

    public static void main(String[] args) {
        Sol tree=new Sol();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        tree.maxPathSum(root);
        System.out.println(max);
    }
}