import java.util.ArrayList;
import java.util.List;
public class Temp {
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


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>innerlist=new ArrayList<>();
        Helper(root,targetSum,innerlist,list);
        return list;
    }
    private void Helper(TreeNode node,int target, List<Integer> path, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        // Create a new copy of the current path
        List<Integer> newPath = new ArrayList<>(path);
        newPath.add(node.val);

        if (node.left == null && node.right == null) {
            // If it's a leaf, add the path to the result
            if(target==node.val){
                result.add(newPath);
            }
        } else {
            // Recur for both subtrees
            Helper(node.left,target-node.val, newPath, result);
            Helper(node.right,target-node.val, newPath, result);
        }
    }


    public static void main(String[] args) {
        Temp tree = new Temp();
        TreeNode root= new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(1);

        System.out.println(tree.pathSum(root,1));






    }
}
