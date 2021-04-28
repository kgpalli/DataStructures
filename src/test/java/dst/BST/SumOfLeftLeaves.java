package dst.BST;
/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 24
 * Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 *
 * Input: root = [1]
 * Output: 0
 * */

public class SumOfLeftLeaves {

    public static int sumOfLeftLeaves(Node root) {
      int sum=0;
      if(root == null){
          return 0;
      }else if(root.left != null && root.left.left==null && root.left.right==null){
          return root.left.val + sumOfLeftLeaves(root.right);
      }else{
          return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
      }

    }



    public static void main(String[]args){
        TreeNode tn = new TreeNode();
       tn.root = new Node(3);
        tn.root.left = new Node(9);
        tn.root.right = new Node(20);
        tn.root.right.left = new Node(15);
        tn.root.right.right = new Node(7);

        System.out.println(sumOfLeftLeaves(tn.root));



    }

}
