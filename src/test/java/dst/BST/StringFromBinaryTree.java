package dst.BST;
/**
 * Input: Binary tree: [1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /
 *   4
 *
 * Output: "1(2(4))(3)"
 *
 * Explanation: Originallay it needs to be "1(2(4)())(3()())",
 * but you need to omit all the unnecessary empty parenthesis pairs.
 * And it will be "1(2(4))(3)".
 * */

public class StringFromBinaryTree {

    public static String tree2str(Node t) {
        if( t== null) return "";
        if(t.left == null && t.right == null) return String.valueOf(t.val);
        String leftString = tree2str(t.left);
        String  rightString = tree2str(t.right);
        if(rightString=="") {
            return String.valueOf(t.val) + "(" + leftString + ")";
        }else
         return String.valueOf(t.val) + "(" + leftString + ")" + "(" + rightString + ")";

    }



    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.left = new Node(4);

        System.out.println(tree2str(node.root));

    }
}
