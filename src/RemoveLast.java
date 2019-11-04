public class RemoveLast {
    public ListNode remove(ListNode list) {
        ListNode preLast = list;
        if(preLast == null) return preLast;
        while(preLast.next.next != null) preLast = preLast.next;
        preLast.next = null;
        return list;
        /*
        where are the readings? In zybooks.
        think of linked lists as layers of depth and not just chronology
        in each listnode, the variable next points to another node
         */
    }
}