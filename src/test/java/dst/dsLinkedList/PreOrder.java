package dst.dsLinkedList;
/**
 * 589. N-ary Tree Preorder Traversal
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 *
 * */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PreOrder {

    public static List<Integer> preorder(ListNode root) {
        LinkedList<Integer>output_arr = new LinkedList<>();
        LinkedList<ListNode>stack = new LinkedList<>();
        if(root==null){
            return output_arr;
        }

        stack.add(root);
        while(!stack.isEmpty()){
            ListNode node = stack.pollLast();
            output_arr.add(node.val);
            Collections.reverse(node.children);
            stack.addAll(node.children);
        }

     return output_arr;
    }

    public static void main(String[]args){
        ListNode node = new ListNode(1);
        node.children.add(new ListNode(3));
        node.children.add(new ListNode(2));
        node.children.add(new ListNode(4));
        node.children.get(0).children.add(new ListNode(5));
        node.children.get(0).children.add(new ListNode(6));



        System.out.println(preorder(node));




    }

}
