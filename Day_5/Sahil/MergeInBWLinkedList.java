package Day_5.Sahil;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left = null;
        ListNode right = list1;

        for (int i = 0; i <= b; i++) {
            if (i == a - 1) {
                left = right;
            }
            right = right.next;
        }

        if (left != null) {
            left.next = list2;
        } else {
            list1 = list2;
        }

        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = right;

        return list1;
    }
}

public class MergeInBWLinkedList {

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(50);
        list2.next = new ListNode(51);
        list2.next.next = new ListNode(52);

        int a = 3;
        int b = 4;

        Solution obj = new Solution();
        ListNode result = obj.mergeInBetween(list1, a, b, list2);

        printList(result);
    }
}