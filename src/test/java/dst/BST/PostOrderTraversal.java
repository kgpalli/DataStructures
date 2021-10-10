package dst.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static List<Integer> preorderTraversal(Node root) {
        return node_list(root,new ArrayList<>());

    }

    public static List<Integer> node_list(Node root,List<Integer>array) {

        if(root==null)return array;
        array = node_list(root.left,array);
        array = node_list(root.right,array);
        array.add(root.val);

        return array;

    }


        public static void main(String[]args){

            TreeNode node = new TreeNode();
            node.root = new Node(1);
            node.root.right = new Node(2);
            node.root.right.left = new Node(3);

            System.out.println(preorderTraversal(node.root));
    }

    }
