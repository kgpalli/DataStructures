package dst.BST;

public class BalancedBT_110 {

    /*public static boolean isBalanced(Node root) {
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

    }*/


    public static boolean isBalanced(Node root) {

        if(root==null)return true;

        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public static int height(Node root){
        if(root==null)return 0;
        System.out.println("Left is -> " + root.left);
        System.out.println("Right is -> " + root.right);
        return 1 + Math.max(height(root.left),height(root.right));

    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();

        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(2);
        node.root.left.left = new Node(3);
        node.root.right.right = new Node(3);
        node.root.left.left.left = new Node(4);
        node.root.left.left.right = new Node(4);


        System.out.println(isBalanced(node.root));


    }
}
