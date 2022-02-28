package dst.dsLinkedList;

public class HasCycle {

    public static boolean hasCycle(ListNode head) {
    if(head==null){
        return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;

    while(slow!=fast){
        System.out.println("Slow is : " + slow.val);
        System.out.println("Fast is : " + fast.val);
        if(fast.next == null){
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
    }
    return true;
    }


    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.push(-4);
        list.push(0);
        list.push(2);
        list.push(3);

        System.out.println(hasCycle(list.head));
    }
}
