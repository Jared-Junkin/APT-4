/*
Solution without recursion
public class ListSum {
    public int sum(ListNode list, int thresh) {
        int sum = 0;
        while(list != null){
            if(list.info > thresh){
                sum += list.info;
            }
            list = list.next;
        }
        return sum;
    }
}
 */

//Solution with recursion
public class ListSum {
    int sum = 0;
    public int sum(ListNode list, int thresh) {
        if(list == null) return sum;
        if(list.info <= thresh){
            sum(list.next, thresh);
        }
        if(list.info > thresh){
            sum += list.info;
            sum(list.next, thresh);
        }
        return sum;
    }
}