import java.util.List;

public class ListLastFirst {
    public ListNode getLast(ListNode list){
        while(list.next != null){
            list = list.next;
        }
        return list;
    }
    public ListNode remove(ListNode list) {
        ListNode preLast = list;
        if(preLast == null) return preLast;
        while(preLast.next.next != null) preLast = preLast.next;
        preLast.next = null;
        return list;
        /*
        Would you explain why the above code, which modifies prelast, also modifies list?
        and why I couldn't return prelast?
         */
    }
    public ListNode move(ListNode list) {
        if(list == null) return list;
        if(list.next == null) return list; //why doesn't my code automatically account for those / how could I make it do that?
        ListNode newFront = getLast(list);
        newFront.next = remove(list);
        return newFront;
    }
}