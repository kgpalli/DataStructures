package dst.BST;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 226. Invert Binary Tree
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 *
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 *
 * Example 3:
 *
 * Input: root = []
 * Output: []
 * */

public class InvertTree {


    public static Node invertTree( Node root) {
        if(root==null){
            return root;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;

    }

    // Iterative approach

    public static Node invertTreeII(Node root) {

        if(root==null){
            return root;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println("Current node value is " + current.val);
            Node tmp = current.left;
            current.left = current.right;
            current.right = tmp;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }


        return root;
    }


    public static void main(String[]args){

        TreeNode node = new TreeNode();
        int[]arr = new int[]{4,2,7,1,3,6,9};
        for(int i : arr){
            node.addNode(i);
        }
        /*node.root = new Node(4);
        node.root.left = new Node(2);
        node.root.right = new Node(7);
        node.root.left.left = new Node(1);
        node.root.left.right = new Node(3);
        node.root.right.left = new Node(6);
        node.root.right.right = new Node(9);*/

       Node root = invertTreeII(node.root);

       node.inOrderTraverseTree(root);




    }
}
