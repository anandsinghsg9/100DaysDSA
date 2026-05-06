package Day_42.Anand;

public class rotateSinglyLinkedList {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {

        ListNode temp=head; 
        int count=0;
        if(temp==null){
            return null;
        }
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int rotate=k%count;
        int newTail=count-rotate;
        ListNode temp2=head;
        ListNode tail=head;
        while(newTail>0){
            tail=temp2;
            temp2=temp2.next;
            newTail--;
        }
        ListNode temp3=head;
        while(count>1){
            temp3=temp3.next;
            count--;
        }
        temp3.next=head;
        ListNode newHead=tail.next;
        tail.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        // Create nodes directly (works now because class is static)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        rotateSinglyLinkedList solution = new rotateSinglyLinkedList();
        ListNode result = solution.rotateRight(head, 2);

        printList(result);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }
}

