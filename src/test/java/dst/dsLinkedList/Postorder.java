package dst.dsLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Postorder {

    public static List<Integer> postorder(ListNode root) {
        LinkedList<Integer> output_arr = new LinkedList<>();
       LinkedList<ListNode> stack = new LinkedList<>();

        if(root==null){
            return output_arr;
        }

        stack.add(root);
        while(!stack.isEmpty()){
            ListNode node = stack.pollLast();
           output_arr.addFirst(node.val);
           System.out.println("Out put array is + " + output_arr);
            stack.addAll(node.children);
        }
        return output_arr;

    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.children.add(new ListNode(3));
        node.children.add(new ListNode(2));
        node.children.add(new ListNode(4));
        node.children.get(0).children.add(new ListNode(5));
        node.children.get(0).children.add(new ListNode(6));


        System.out.println(postorder(node));
    }
}
