package dst.BST;

import java.sql.Struct;

/**
 * Input: root = [1,2,3]
 * Output: 1
 * Explanation:
 * Tilt of node 2 : |0-0| = 0 (no children)
 * Tilt of node 3 : |0-0| = 0 (no children)
 * Tilt of node 1 : |2-3| = 1 (left subtree is just left child, so sum is 2; right subtree is just right child, so sum is 3)
 * Sum of every tilt : 0 + 0 + 1 = 1
 *
 * */

public class BinaryTreeTilit {
    int result=0;

    public int findTilt(Node root) {
        tilt(root);
        return result;
    }

    public int tilt(Node root){
        if(root == null) return 0;
        int left = tilt((root.left));
        int right = tilt(root.right);
        result += Math.abs(left -right);
        System.out.println("Result is : " + result);
        return left+right+root.val;
    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root= new Node(4);
        node.root.left = new Node(2);
        node.root.right = new Node(9);
        node.root.left.left = new Node(3);
        node.root.left.right = new Node(5);
        node.root.right.right = new Node(7);
        BinaryTreeTilit btt = new BinaryTreeTilit();
        System.out.println(btt.findTilt(node.root));
    }
}
