package dst.BST;

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

       Node root = invertTree(node.root);

       node.inOrderTraverseTree(root);




    }
}
