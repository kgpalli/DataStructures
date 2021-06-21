package dst.BST;
/*
* 617. Merge Two Binary Trees
* Example 1:
Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]
*
Example 2:
Input: root1 = [1], root2 = [1,2]
Output: [2,2]
*
* */

public class MergeTrees {

    public static Node mergeTrees(Node root1, Node root2) {

        return merge(root1,root2);

    }

    public static Node merge(Node root1, Node root2){
        if(root1==null && root2==null) return null;
        if(root1==null && root2!=null) return root2;
        if(root1!=null && root2==null) return root1;

        Node sum = new Node(root1.val + root2.val);
        sum.left = merge(root1.left,root2.left);
        sum.right = merge(root1.right,root2.right);
        return sum;
    }



    public static void main (String[]args){
        TreeNode node1 = new TreeNode();
        node1.root = new Node(1);
        node1.root.left = new Node(3);
        node1.root.right = new Node(2);
        node1.root.left.left = new Node(5);


        TreeNode node2 = new TreeNode();
        node2.root = new Node(2);
        node2.root.left = new Node(1);
        node2.root.right = new Node(3);
        node2.root.left.right = new Node(4);
        node2.root.right.right = new Node(7);

        Node node3 = mergeTrees(node1.root,node2.root);

        node1.preorderTraverseTreeNode(node3);

    }
}
