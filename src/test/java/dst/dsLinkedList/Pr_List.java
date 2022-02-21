package dst.dsLinkedList;

public class Pr_List {

    public static ListNode deleteDuplicates(ListNode head) {
       ListNode ls = head;

       while(ls != null && ls.next != null){
           if(ls.val == ls.next.val){
               ls.next = ls.next.next;
           }else{
               ls = ls.next;
           }
       }

       return ls;
    }

    public static void main(String[] args) {

        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(1);
        llist.push(2);

        System.out.println(deleteDuplicates(llist.head));
    }
}
