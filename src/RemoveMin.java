
public class RemoveMin {
    public int getMin(ListNode list){
        int min = list.info;
        ListNode thisOne = list;
        while(thisOne.next != null){
            if(thisOne.next.info < min){
                min = thisOne.next.info;
            }
            thisOne = thisOne.next;
        }
        return min;
    }
    public ListNode remove (ListNode list) {
        if(list == null){
            return null;
        }
        if(list.info == getMin(list)){
            return list.next;
        }
        ListNode front = list;
        while(list.next != null){
            if(list.next.info == getMin(list) & list.next.next != null){
                list.next = list.next.next;
            }
            if(list.next.info == getMin(list) & list.next.next == null){
                list.next = null;
                break;
            }
            list = list.next;
        }
        return front;
    }
}