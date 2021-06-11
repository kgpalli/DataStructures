package dst.BST;

public class IsSubtree {

    public static boolean isSubtree(Node root,Node subRoot) {
        if(root==null) return false;

        if(isSameTree(root,subRoot)){
            return true;
        }else{
           return isSubtree(root.left,subRoot) && isSubtree(root.right,subRoot);
        }
    }

    public static boolean isSameTree(Node s , Node t){
        if (s==null || t == null){ return s==null && t==null ; }
       else if(s.val == t.val){
            return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
        }else{
            return false;
        }
    }

    public static void main(String[]args){
        TreeNode node1 = new TreeNode();
        node1.root = new Node(3);
        node1.root.left = new Node(4);
        node1.root.right = new Node(5);
        node1.root.left.left = new Node(1);
        node1.root.left.right = new Node(2);

        TreeNode node2 = new TreeNode();
        node2.root=new Node(4);
        node2.root.left =new Node(1);
        node2.root.right=new Node(2);

        System.out.println(isSubtree(node1.root,node2.root));

    }
}
