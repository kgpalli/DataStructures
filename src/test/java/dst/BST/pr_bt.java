package dst.BST;

public class pr_bt {
    Node root;

    public void add_node(int val){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
        }

    }


  public static void main(String[]args){
      pr_bt bt = new pr_bt();
  }
}
