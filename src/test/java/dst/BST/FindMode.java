package dst.BST;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: root = [1,null,2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: root = [0]
 * Output: [0]
 * */

public class FindMode {
   static int max=0;
  static int count=1;
   static Integer prev = null;

    public static int[] findMode(Node root) {
        List<Integer> list = new ArrayList<>();
        traverse(list,root);

        int[] result = new int[list.size()];

        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

        System.out.println(Arrays.toString(result));
        return result;

    }

    public static   void traverse(List<Integer>modes,Node node){
        if(node==null) return;
        traverse(modes,node.left);

       if(prev != null) {
           if (prev == node.val) {
               count++;
           }else{
               count=1;
           }
       }
        if(count>max){
            max = count;
            modes.clear();
            modes.add(node.val);
        }else if(count == max){
            modes.add(node.val);
        }

        prev = node.val;

        traverse(modes,node.right);

    }



    public static void main(String[]args){
        TreeNode node = new TreeNode();
        node.addNode(1);
        node.addNode(2);
        node.addNode(2);

        findMode(node.root);
    }
}
