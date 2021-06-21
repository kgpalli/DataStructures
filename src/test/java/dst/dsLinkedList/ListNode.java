package dst.dsLinkedList;
import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    List<ListNode> children;
    ListNode(int val){
        this.val = val;
        this.next= null;
        this.children = new ArrayList<>();
    }




}
