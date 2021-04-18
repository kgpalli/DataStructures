package dst.BST;

public class MinDepthMst {

    public static int minDepth(Node root) {

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }
        int left = root.left  != null ? minDepth(root.left) : Integer.MAX_VALUE;
        int right = root.right  != null ? minDepth(root.right) : Integer.MAX_VALUE;


        return 1 + Math.min(left,right);

    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(3);
        node.root.left = new Node(9);
        node.root.right = new Node(20);
        node.root.right.left = new Node(15);
        node.root.right.right = new Node(7);

    System.out.println(minDepth(node.root));


    }


}
