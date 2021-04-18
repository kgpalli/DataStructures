package dst.BST;

import org.apache.poi.ss.formula.functions.T;

public class SameTree {


    public static boolean isSameTree(Node p, Node q) {

        if(p==null && q==null){

            return true;

        }
        else  if(p==null || q==null){

            return false;

        }

        else if(p.val  != q.val){

            return false;

        }


      return isSameTree(p.left,q.left)  && isSameTree(p.right,q.right);
    }


    public static void main (String[]args){

    TreeNode node1 = new TreeNode();
    node1.root = new Node(1);
    node1.root.left = new Node(2);
    node1.root.right = new Node(3);



    TreeNode node2 = new TreeNode();
        node2.root = new Node(1);
    node2.root.left = new Node(2);
    node2.root.right = new Node(3);


    System.out.println(isSameTree(node1.root, node2.root));


    }
}
