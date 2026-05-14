package Anand;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next;
    }
}

public class removeNthElement {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        if(head.next==null){
            return null;
        }
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        for(int i=1;i<(count-n);i++){
            temp=temp.next;
        }
        if((temp==head) && (count-n)==0){
            head=temp.next;
        }
        else{
            temp.next=temp.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                    new ListNode(2,
                    new ListNode(3,
                    new ListNode(4,
                    new ListNode(5, null)))));

        removeNthElement sol = new removeNthElement();

        head = sol.removeNthFromEnd(head, 2);

        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
