package dst.BST;

import java.util.List;

public class Node {
    int val;
    Node left;
    Node right;
    public List<Node> children;


    Node(){};
    Node(int val){this.val = val;}
    public Node(int val, Node left, Node right){
      this.val = val;
      this.right = right;
      this.left = left;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public String toString(){
        return String.valueOf(val);
    }


}
