public class ListCount {
    public int count (ListNode list) {
        int total = 0;
        while(list != null){
            total++;
            list = list.next; //this isn't actually moving it along to the next one. This is just saying list = node
        }
        return total;
    }
    /*
      Question: am I just assuming that the code for Listnode exists?
      Where would I put that into this code? Just in a different class?
      How does next physically work? Where is the next function for listnode?
      I just don't get how this is working
     */
}