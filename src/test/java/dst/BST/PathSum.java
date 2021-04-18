package dst.BST;

/*Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        Output: true*/

public class PathSum {

    public static boolean hasPathSum(Node root, int targetSum) {

        if(root == null){
            return false;
        }else if (root.left == null && root.right == null && targetSum - root.val ==0){
            return true;
        }else{
            return hasPathSum(root.left,targetSum - root.val) ||
                    hasPathSum(root.right,targetSum - root.val);
        }


    }


    public static void main(String[]args){

        TreeNode node = new TreeNode();
        node.root = new Node(5);
        node.root.left = new Node(4);
        node.root.right = new Node(8);
        node.root.left.left = new Node(11);
        node.root.right.left = new Node(13);
        node.root.right.right = new Node(4);
        node.root.left.left.left = new Node(7);
        node.root.left.left.right = new Node(2);
        node.root.right.right.right = new Node(1);

        int targetSum = 22;

        System.out.println(hasPathSum(node.root, targetSum));


    }
}
