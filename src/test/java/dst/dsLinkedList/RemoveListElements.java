package dst.dsLinkedList;

public class RemoveListElements {

    public static ListNode removeElements(ListNode head, int val) {

        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;

        while (p.next != null) {
            if (p.next.val == val) {
                ListNode next = p.next;
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return helper.next;
    }

    public static void delete_node(ListNode head, int data){



        ListNode current_node = head;
        ListNode prev = null;

        if(current_node != null && current_node.val==data){
            head=current_node.next;
            return ;
        }

        while(current_node != null && current_node.val != data){
            prev = current_node;
            current_node = current_node.next;
        }
        if( current_node == null){
            return ;
        }

        prev.next = current_node.next;
    }


    public static void main(String[] args) {
        LinkedList rmlist = new LinkedList();

        rmlist.push(1);
        rmlist.push(2);
        rmlist.push(6);
        rmlist.push(3);
        rmlist.push(4);


        rmlist.printList();


      //  removeElements(rmlist.head, 4);

        delete_node(rmlist.head,1);

        System.out.println();

        System.out.println("Print after deleting node");

        rmlist.printList();
        /*System.out.println();

        System.out.println("Print after removing duplicate");

        rmlist.printList();*/

    }
}

