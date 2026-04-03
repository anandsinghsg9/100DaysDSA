package Day_21.Anand;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class removeDublicates {
    public static void main(String[] args) {
        removeDublicates sol = new removeDublicates();

        // Creating a sorted linked list: [1, 1, 2, 3, 3]
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(head);

        // Remove duplicates
        ListNode result = sol.deleteDuplicates(head);

        System.out.print("Modified List: ");
        printList(result);
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // Found duplicate, skip the next node
                curr.next = curr.next.next;
            } else {
                // Values are different, move to next node
                curr = curr.next;
            }
        }
        return head;
    }
}
