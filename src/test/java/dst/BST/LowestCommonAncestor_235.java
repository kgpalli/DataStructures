package dst.BST;

/**
 *
 * 235. Lowest Common Ancestor of a Binary Search Tree
 *Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6.
 *
 *
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 *
 * Example 3:
 *
 * Input: root = [2,1], p = 2, q = 1
 * Output: 2
 *
 * */

public class LowestCommonAncestor_235 {

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(p.val>=root.val && q.val>=root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }



    }




    public static void main(String[]args){

        TreeNode node = new TreeNode();
        node.root = new Node(6);
        node.root.left = new Node(2);
        node.root.right = new Node(8);
        node.root.left.left = new Node(0);
        node.root.left.right = new Node(4);
        node.root.right.left = new Node(7);
        node.root.right.right = new Node(9);
        node.root.left.right.left = new Node(3);
        node.root.left.right.right = new Node(5);

        Node p = new Node(2);
        Node q = new Node(8);
        System.out.println(lowestCommonAncestor(node.root,p,q));




    }
}
