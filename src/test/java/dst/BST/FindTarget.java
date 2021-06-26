package dst.BST;

import java.util.HashSet;
import java.util.Set;

/**
 * 653. Two Sum IV - Input is a BST
 * Input: root = [5,3,6,2,4,null,7], k = 9
 * Output: true
 *
 * Input: root = [5,3,6,2,4,null,7], k = 28
 * Output: false
 * Example 3:
 *
 * Input: root = [2,1,3], k = 4
 * Output: true
 * Example 4:
 *
 * Input: root = [2,1,3], k = 1
 * Output: false
 * Example 5:
 *
 * Input: root = [2,1,3], k = 3
 * Output: true
 * */

public class FindTarget {

    public static boolean findTarget(Node root, int k) {

        return doesTargetExist(root,k,new HashSet<Integer>());
    }

    public static boolean doesTargetExist(Node root, int target, Set<Integer>set){

        if(root==null){
            return false;
        }
        if(set.contains(target-root.val)){
            return true;
        }else
            set.add(root.val);

        boolean left = doesTargetExist(root.left,target,set);
        boolean right = doesTargetExist(root.right,target,set);

        return left || right;
    }


    public static void main(String[]args)  {
        TreeNode node1 = new TreeNode();
        node1.root = new Node(5);
        node1.root.left = new Node(3);
        node1.root.right = new Node(6);
        node1.root.left.left = new Node(2);
        node1.root.left.right = new Node(4);
        node1.root.right.right = new Node(7);

        int k = 9;

        System.out.println(findTarget(node1.root,k));
    }
}
