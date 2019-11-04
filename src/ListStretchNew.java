
public class ListStretchNew {
    public ListNode stretch (ListNode list, int amount){
        ListNode ret = list;
        while(list != null){
            ListNode temp = new ListNode(list.info);
            for(int i=1; i<amount; i++){
                temp = new ListNode(list.info);
                temp.next = list.next;
                list.next = temp;
                list = temp;
            }
            list = temp.next;
        }
        return ret;
    }
    public static void main(String[] args){
        ListNode list = new ListNode()
    }
}