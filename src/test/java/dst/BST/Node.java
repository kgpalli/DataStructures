package dst.BST;

public class Node {
    int val;
    Node left;
    Node right;


    Node(){};
    Node(int val){this.val = val;}
    public Node(int val, Node left, Node right){
      this.val = val;
      this.right = right;
      this.left = left;
    }

    public String toString(){
        return String.valueOf(val);
    }


}
