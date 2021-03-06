package dst.BST;

import java.util.Stack;

public class PracticeBST {
     Node root;

    PracticeBST(){
        root=null;
    }

    void insert(int key){
        root = insertRec(root,key);
    }

    Node insertRec(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val<root.val){
            root.left = insertRec(root.left,val);
        }else if(val>root.val){
            root.right = insertRec(root.right,val);
        }

        return root;
    }
   void printTree(){
       inorderRec(root);

}
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left) ;
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }

    }
    public static void main(String[]args){

        PracticeBST bst = new PracticeBST();
       /* bst.insert(1);
        bst.insert(3);
        bst.insert(5);
*/

        int[]arr = new int[]{4,2,7,1,3,6,9};
        for(int i:arr){
            bst.insert(i);
        }
        bst.printTree();



    }
}
