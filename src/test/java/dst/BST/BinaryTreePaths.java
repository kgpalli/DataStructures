package dst.BST;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static List<String> binaryTreePaths(Node root) {
        List<String>paths = new ArrayList<>();

        if(root == null){
            return paths;
        }
        dfs(root, " ",paths);
        return paths;
    }

    public static void dfs(Node root, String path, List<String>paths){
        path += root.val;
        if(root.left == null && root.right==null){
                paths.add(path);
        }

        if(root.left != null){
           dfs(root.left,path + "->",paths);
        }if(root.right != null){
            dfs(root.right,path + "->",paths);
        }

    }


    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root= new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.right = new Node(5);

        System.out.println(binaryTreePaths(node.root));
    }
}
