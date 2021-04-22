package dst.dsLinkedList;


import java.util.List;

class LinkedList {
    ListNode head;

    public void push(int new_data) {
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public void printList() {
        ListNode tnode = head;
        while (tnode != null) {
            System.out.print(tnode.val + " ");
            tnode = tnode.next;
        }
    }


    public String toString() {
        return String.valueOf(head.val);
    }

    public static boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode small_pointer = head;
        ListNode fast_pointer = head.next;

        while (small_pointer != fast_pointer) {

            if (fast_pointer == null || fast_pointer.next == null) {
                return false;
            }


            small_pointer = small_pointer.next;
            fast_pointer = fast_pointer.next.next;
        }
        return true;
    }

    public static ListNode deleteduplicates(ListNode head) {

       /* ListNode temp1 = head;
        ListNode temp2 = head.next;

        while (temp2 != null ) {
            if (temp1.val == temp2.val) {
                temp2 = temp2.next;
            } else {
                temp1 = temp2;*/
                //temp2 = temp2.next;

        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

     return head;

    }

        public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(3);
        llist.push(2);
        llist.push(0);
        llist.push(4);
        llist.push(4);
        llist.push(4);

        llist.printList();



        deleteduplicates(llist.head);
        System.out.println();


        llist.printList();

        // System.out.println(hasCycle(llist.head));


    }

}
