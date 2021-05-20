package dst.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 *
 * Input: root = [1]
 * Output: [[1]]
 * */

public class BstLevelOrder {

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer>currentLevel = new ArrayList<>();
            for(int i=0;i<size;i++) {
                Node current = queue.remove();
                currentLevel.add(current.val);

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);

        }

        return result;

    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(3);
        node.root.left = new Node(9);
        node.root.right = new Node(20);
        node.root.right.left = new Node(15);
        node.root.right.right = new Node(7);


            System.out.println(levelOrder(node.root));


    }
}
