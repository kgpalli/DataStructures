package dst.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgLevelsBST {

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
