package dst.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * 637. Average of Levels in Binary Tree
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [3.00000,14.50000,11.00000]
 * Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
 * Hence return [3, 14.5, 11].
 * */

public class AvgLevelsBT {

    public static List<Double> averageOfLevels(Node root) {
        List<Double>list = new ArrayList<>();

        if(root == null ){
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        double level_sum = 0;
        while(!queue.isEmpty()){
            level_sum = 0;
            int size = queue.size();
            System.out.println("Iterations : ");
            for(int i=0;i<size;i++){
                Node current_node = queue.poll();
                level_sum += current_node.val;

                if(current_node.left != null) queue.offer(current_node.left);
                if(current_node.right != null) queue.offer(current_node.right);
            }
            double level_aug = level_sum /size;
            list.add(level_aug);

            System.out.println("List is  : " + level_aug);
        }


       return list;
    }


    public static void main(String[]args){

        TreeNode node = new TreeNode();
        node.root = new Node(3);
        node.root.left = new Node(9);
        node.root.right = new Node(20);
        node.root.right.left = new Node(15);
        node.root.right.left = new Node(7);

        System.out.println(averageOfLevels(node.root));

    }
}
