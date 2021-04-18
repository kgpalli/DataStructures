package dst.BST;

public class BalancedBT {

    public static boolean isBalanced(Node root) {
        return height(root) != -1;

    }

    public static int height(Node root){

        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        if(left == -1 || right == -1 || Math.abs(left-right)>1)
            return -1;

        return Math.max(left,right)+1;

    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();

        node.root = new Node(3);
        node.root.left = new Node(9);
        node.root.right = new Node(20);
        node.root.right.left = new Node(15);
        node.root.right.right = new Node(7);
       /* node.root.left.left.left = new Node(4);
        node.root.left.left.right = new Node(4);*/


        System.out.println(isBalanced(node.root));


    }
}
