package dst.BST;

public class pr_bt {

    public void  printTree(Node node){
        if(node != null){
            printTree(node.left);
            System.out.print(node + " ");
            printTree(node.right);
        }

    }

    public static void main(String[]args){

        TreeNode tNode = new TreeNode();
        int[]arr = new int[]{4,2,7,1,3,6,9};
        for(int i:arr){
            tNode.addNode(i);
        }
     pr_bt bt = new pr_bt();
        bt.printTree(tNode.root);
  }
}
