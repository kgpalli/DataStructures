package dst.BST;
/**
 * 543. Diameter of Binary Tree
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3is the length of the path [4,2,1,3] or [5,2,1,3].
 * Example 2:
 *
 * Input: root = [1,2]
 * Output: 1
 * https://www.techiedelight.com/find-diameter-of-a-binary-tree/
 *
 * */

public class DiameterOfBinaryTree {
     static int ans=0;
    public static int diameterOfBinaryTree(Node root) {
        getDiameter(root);

        return ans==0 ? 0 : ans-1;
    }

    private static int getDiameter(Node root){
        if(root==null){
            return 0;
        }
       int l =  getDiameter(root.left);
        System.out.println("Left node is : " + l);
       int r =  getDiameter(root.right);
        System.out.println("Right node is : " + r);
       ans = Math.max(ans,l+r+1);
       System.out.println("Answer is : " +ans);
       return Math.max(l,r)+1;


    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.left = new Node(4);
        node.root.left.right = new Node(5);



        System.out.println(diameterOfBinaryTree(node.root));

    }
}
