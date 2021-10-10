package dst.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

    public static List<Integer> preorderTraversal(Node root) {
        List<Integer>new_list = new ArrayList<>();
        Stack<Node>stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(current!= null) {
                new_list.add(current.val);
                stack.push(current.right);
                stack.push(current.left);
            }
        }
        return new_list;

    }

    public static void main(String[]args){

        TreeNode node = new TreeNode();
        node.root = new Node(1);
        node.root.right = new Node(2);
        node.root.right.left = new Node(3);

       System.out.println(preorderTraversal(node.root));


    }



}
