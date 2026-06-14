package Day_74.Anand;

public class pairSum {
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val){
            this.val = val; 
            this.next = null; 
        }
    }
    public int pairSum(ListNode head) {
        ListNode slowPoint=head;
        ListNode fastPoint=head;
        while(fastPoint!=null){
            slowPoint=slowPoint.next;
            fastPoint=fastPoint.next.next;
        }
        ListNode prev=null;
        while(slowPoint!=null){
            ListNode next=slowPoint.next;
            slowPoint.next=prev;
            prev=slowPoint;
            slowPoint=next;
        }
        slowPoint=prev;
        int output=0;
        fastPoint=head;
        while(slowPoint!=null){
            int step=fastPoint.val+slowPoint.val;
            output=Math.max(step,output);
            fastPoint=fastPoint.next;
            slowPoint=slowPoint.next;
        }
        return output;
    }
    public static void main(String[] args) {
        pairSum obj=new pairSum();
        ListNode head=new ListNode(5);
        head.next=new ListNode(4);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        int ans=obj.pairSum(head);
        System.out.println(ans);
    }
}
