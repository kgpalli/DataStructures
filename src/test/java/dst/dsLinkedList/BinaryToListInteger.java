package dst.dsLinkedList;

public class BinaryToListInteger {

    public static int getDecimalValue(ListNode head) {
        int num = 0;

        while(head != null){
            num = num * 2 + head.val;
            head = head.next;
        }
        return num;
    }




    public static void main(String[]args){

        LinkedList list = new LinkedList();
        list.push(1);
        list.push(0);
        list.push(1);

           System.out.println(getDecimalValue(list.head));
    }
}
