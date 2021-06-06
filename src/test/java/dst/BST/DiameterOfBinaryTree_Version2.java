package dst.BST;

public class DiameterOfBinaryTree_Version2 {

    public static int diameter(Node root){
     if(root == null){ return 0;}
     int lheight = height(root.left);
     int rheight = height(root.right);

     int lDiameter = diameter(root.left);
     int rDiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1,Math.max(lDiameter,rDiameter))-1;

    }

    public static int height(Node root){
        int h=0;
        if(root==null){return 0 ; }
        int left = height(root.left);
        int right = height(root.right);
        if(left > right){
            h = 1 + left;
        }else{
            h = 1 + right;
        }
        return h;
    }

    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.root = new Node(1);
        node.root.left = new Node(2);
        node.root.right = new Node(3);
        node.root.left.left = new Node(4);
        node.root.left.right = new Node(5);

        System.out.println(diameter(node.root));

    }
}
