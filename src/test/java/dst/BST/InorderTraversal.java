package dst.BST;



import java.util.*;

/**
 * 94. Binary Tree Inorder Traversal
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * Example 2:
 *
 * Input: root = []
 * Output: []
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 * */

public class InorderTraversal {

    public static List<Integer> inorderTraversal(Node root) {
        Stack<Node>stack = new Stack<>();
        List<Integer>list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Node current = root;

        while(current != null ||!stack.isEmpty() ){
            while (current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }


        return list;

    }

    public static List<Integer> preorderTraversal(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_arr = new LinkedList<>();
        if (root == null) {
            return output_arr;
        }


        stack.add(root);

        while (!stack.isEmpty()) {
         Node  current = stack.pollLast();
           output_arr.add(current.val);
            Collections.reverse(current.children);

            stack.addAll(current.children);
        }
        return output_arr;

    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(1);
        node.root.right = new Node(2);
        node.root.right.left = new Node(3);

        System.out.println(inorderTraversal(node.root));
        System.out.println(preorderTraversal(node.root));

    }
}
