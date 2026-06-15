package Day_75.Anand;

public class deleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        count=count/2;
        temp=head;
        while(count>1){
            temp=temp.next;
            count--;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val){
            this.val = val; 
            this.next = null; 
        }
    }
    public static void main(String[] args) {
        deleteMiddle obj=new deleteMiddle();
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(7);
        head.next.next.next.next=new ListNode(1);
        head.next.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next.next=new ListNode(6);
        ListNode ans=obj.deleteMiddle(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }        
}
