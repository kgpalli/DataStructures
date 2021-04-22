package dst.dsLinkedList;

import java.util.Stack;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack<ListNode>();

        while(head != null){
            stack.push(head);
            head = head.next;
        }

        ListNode helper = new ListNode(0);
        head = helper;

        while(!stack.isEmpty()){

            ListNode current = stack.pop();
            head.next = new ListNode(current.val);
            head = head.next;

        }
        return helper.next;
    }




    public static void main (String[]args){
        LinkedList revlist = new LinkedList();
        revlist.push(1);
        revlist.push(2);
        revlist.push(3);
        revlist.push(4);
        revlist.push(5);

        revlist.printList();
        System.out.println();

    reverseList(revlist.head);









    }
}
