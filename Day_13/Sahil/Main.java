package Day_13.Sahil;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {
    
    public static ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            while (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }

        temp = null;
        while (!st.isEmpty()) {
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }

        return temp;
    }

    public static ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 13, 3, 8};

        ListNode head = createList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = removeNodes(head);

        System.out.print("Updated List: ");
        printList(head);
    }
}
