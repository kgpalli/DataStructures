package dst.BST;

public class TreeNode {
Node root;

public void addNode(int val){

    // Create a new Node and initialize it
    Node newNode = new Node(val);

    // If there is no root this becomes root
    if(root == null){
        root = newNode;
    }else{
        // Set root as the Node we will start   with as we traverse the tree

        Node focusNode = root;

        // Future parent for our new Node
        Node parent;
        while(true){
            // root is the top parent so we start there
        parent = focusNode;
        if(val<focusNode.val){
        focusNode = focusNode.left;

        // If the left child has no children
        if(focusNode == null){

            // then place the new node on the left of it
            parent.left = newNode;
            return;
        }
        }else{   // If we get here put the node on the right
        focusNode = focusNode.right;

        // If the right child has no children
        if(focusNode==null){
            // then place the new node on the right of it
            parent.right = newNode;
            return;
        }
            }

        }
    } }

   // All nodes are visited in ascending order Recursion is used to go to one node and
    // then go to its child nodes and so forth


    public void inOrderTraverseTree(Node focuNode){

        // Traverse the left node

        if(focuNode != null){
         inOrderTraverseTree(focuNode.left);

            // Visit the currently focused on node
            System.out.println(focuNode + " ");

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
     /* tree.preorderTraverseTreeNode(tree.root);
      tree.postorderTraverseTreeNode(tree.root);

      System.out.println("Search for 2 : ");
       System.out.println(tree.findNode(2));*/


    }



}
