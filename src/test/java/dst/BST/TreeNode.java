package dst.BST;

public class TreeNode {
Node root;

public void addNode(int val) {

    Node newNode = new Node(val);
    if (root == null) {
        root = newNode;
    } else {
        Node focueNode = root;

        Node parent;
        while (true) {
            parent = focueNode;
            if (val < focueNode.val) {
                focueNode = focueNode.left;
                if (focueNode == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                focueNode = focueNode.right;
                if (focueNode == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
}

public Node createNewNode(int val){
    Node a = new Node();
    a.val=val;
    a.right=null;
    a.left=null;

    return a;
}

public Node insert(Node node, int val){
    if(node ==null){
        return createNewNode(val);
    }
    if(val<node.val){
        node.left = insert(node.left,val);
    }else if(val>node.val){
        node.right = insert(node.right,val);
    }
    return node;
}


   // All nodes are visited in ascending order Recursion is used to go to one node and
    // then go to its child nodes and so forth


    public void inOrderTraverseTree(Node focuNode){

        // Traverse the left node

        if(focuNode != null){
         inOrderTraverseTree(focuNode.left);

            // Visit the currently focused on node
            System.out.print(focuNode + " ");

            // Traverse the right node
            inOrderTraverseTree(focuNode.right);
     } }

     public void preorderTraverseTreeNode(Node focusNode){

       if(focusNode != null){

           System.out.print(focusNode + " ");

           preorderTraverseTreeNode(focusNode.left);
           preorderTraverseTreeNode(focusNode.right);

       }

     }


    public void postorderTraverseTreeNode(Node focusNode){

        if(focusNode != null){

            postorderTraverseTreeNode(focusNode.left);
            postorderTraverseTreeNode(focusNode.right);

            System.out.print(focusNode + " ");

        }

    }

    public Node findNode(int val){
    Node focusNode = root;

    while(focusNode.val != val){
        if(val < focusNode.val){
            focusNode = focusNode.left;
        }else{
            focusNode = focusNode.right;
        }

        if(focusNode == null){
            return null;
        }
    }

    return focusNode;

    }

    public static void main (String[]args){
        TreeNode tree = new TreeNode();
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(2);
        tree.addNode(3);
        tree.addNode(4);
        tree.addNode(4);
        tree.addNode(3);

      tree.inOrderTraverseTree(tree.root);
      tree.preorderTraverseTreeNode(tree.root);
        System.out.println();
      tree.postorderTraverseTreeNode(tree.root);

     /* System.out.println("Search for 2 : ");
       System.out.println(tree.findNode(2));*/


    }



}
