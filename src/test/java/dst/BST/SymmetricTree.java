package dst.BST;
/**
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 *
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 * */
public class SymmetricTree {

    public static boolean isSymmetric(Node root) {

        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }
    public static boolean isSymmetric(Node left, Node right) {

        if(left==null || right==null){
            return left==right;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right,right.left);
    }

    public static void main (String[]args){

     TreeNode node = new TreeNode();
       node.root = new Node(1);
       node.root.left = new Node(2);
        node.root.right = new Node(2);
        node.root.left.left = new Node(3);
        node.root.left.right = new Node(4);
        node.root.right.left = new Node(4);
        node.root.right.right = new Node(3);

     boolean status =  isSymmetric(node.root);

     System.out.println(status);




    }
}
