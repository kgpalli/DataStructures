package dst.dsLinkedList;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;
        while(true){
           if(list1 ==null) {
               current_node.next=list2;
               break;
           }else if(list2==null){
               current_node.next=list1;
               break;
           }
           if(list1.val<=list2.val){
               current_node.next=list1;
               list1 = list1.next;
           }else{
               current_node.next=list2;
               list2 = list2.next;
           }
           current_node = current_node.next;
        }

       return temp_node.next;
    }


    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.push(1);
        list1.push(2);
        list1.push(4);


        LinkedList list2 = new LinkedList();
        list2.push(1);
        list2.push(3);
        list2.push(5);

        mergeTwoLists(list1.head,list2.head);


    }
}
