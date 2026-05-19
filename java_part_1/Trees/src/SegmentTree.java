public class SegmentTree {
    private static class Node{
        int data;
        Node left;
        Node right;
        int leftInterval;
        int rightInterval;
        public Node(int leftInterval,int rightInterval){
            this.leftInterval=leftInterval;
            this.rightInterval=rightInterval;
        }
    }

    Node root;
    public SegmentTree(int[] arr){
        root=ConstructTree(arr,0,arr.length-1);
    }
    private Node ConstructTree(int[] arr,int start,int end){
        if(start==end){
            Node leaf=new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }
        int mid=start+(end-start)/2;
        Node node=new Node(start,end);
        node.left=ConstructTree(arr,start,mid);
        node.right=ConstructTree(arr,mid+1,end);
        node.data=node.left.data+node.right.data;
        return node;
    }
    public void Display(){
        Display(root);
    }
    private static void Display(Node node){
        String str="";
        if(node.left!=null) {
            str=str+"Interval=[" + node.left.leftInterval + "-" + node.left.rightInterval + "] and data:" + node.left.data+" ";
        }
        else{
            str=str+"No left Child ";
        }
        str=str+"Interval=[" + node.leftInterval + "-" + node.rightInterval + "] and data:" + node.data+" ";
        if(node.right!=null){
            str=str+"Interval=[" + node.right.leftInterval + "-" + node.right.rightInterval + "] and data:" + node.right.data+" ";
        }
        else{
            str=str+"No right Child ";
        }
        System.out.println(str);
        if(node.left!=null){
            Display(node.left);
        }
        if(node.right!=null){
            Display(node.right);
        }
    }
    public int QueryRangeSum(int qsi,int qei){
        //query start interval and query end interval
       return Query(root,qsi,qei);
    }
    private int Query(Node node,int QueryStart,int QueryEnd){
        if(node.rightInterval<QueryStart||node.leftInterval>QueryEnd){
            return 0;
        }
        else if(node.leftInterval>=QueryStart&&node.rightInterval<=QueryEnd){
            return node.data;
        }
        else{
            return Query(node.left,QueryStart,QueryEnd)+Query(node.right,QueryStart,QueryEnd);
        }
    }
    public int Update(int index,int value){
        return Update(this.root, index,value);
    }
    private int Update(Node node,int index,int value){
        if(index>=node.leftInterval&&index<=node.rightInterval){
            if(node.leftInterval==node.rightInterval){
                node.data=value;
                return node.data;
            }
            else {
                int leftAns=Update(node.left,index,value);
                int rightAns=Update(node.right,index,value);
                node.data=leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
SegmentTree tree=new SegmentTree(arr);
//tree.Display();
        System.out.println(tree.root.data);
        int ans=tree.QueryRangeSum(0,4);
        System.out.println(ans);
        int UpdateAns= tree.Update(0,2);
        System.out.println(UpdateAns);
    }
}
