package dst.BST;

public class MaxDepthBst {

    public static int maxDepth(Node root) {

        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int max = Math.max(left,right)+1;
        return max;

    }



    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(3);
        node.root.left = new Node(9);
        node.root.right = new Node(20);
        node.root.right.left = new Node(15);
        node.root.right.right = new Node(7);

        System.out.println(maxDepth(node.root));






    }
}
