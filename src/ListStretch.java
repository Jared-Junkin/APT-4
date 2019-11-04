
public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        if(list == null || amount == 0) return null;
        if(amount == 1) return list;
        ListNode front = list;
        while(list != null){ //why is this supposed to be while list!= null?
            for(int k = 0; k < amount - 1; k++){
                ListNode newList = new ListNode(list.info, list.next);
                list.next = newList;
                list = newList;
            }
            list = list.next; //Why does this line not generate a null pointer exception, because I'm completely certain it should.
        }

        return front;
    }
}
/*
Null pointer exceptions happen when you try and do something to null, not when you just point at null. That's why this code works.
Alternate Method
public class ListStretch {
    public ListNode makeMore(ListNode list, int amount){
        ListNode augmenter = new ListNode(list.info);
        ListNode front = augmenter;
        for (int k = 0; k < amount - 1; k++) {
            augmenter.next = new ListNode(list.info);
            augmenter = augmenter.next;
        }
        return front;
    }
    public ListNode stretch (ListNode list, int amount){
        if(list == null || amount == 0){
            return null;
        }
        if(amount == 1){
            return list;
        }
        ListNode front = makeMore(list, amount);
        ListNode stretcher = front;
        for(int k = 0 ; k < amount - 1 ; k++){
            stretcher = stretcher.next;
        }
        while(list.next != null){ //I left this as list != null, not list.next != null, because doesn't list.next == null on the last element of the linked list? I don't want to exclude that element. Why doesn't this always happen?
                stretcher.next = makeMore(list.next, amount);
                list = list.next;
                for(int k = 0 ; k < amount; k++){
                    stretcher = stretcher.next;
                }
        }
        return front;
    }

}
 */