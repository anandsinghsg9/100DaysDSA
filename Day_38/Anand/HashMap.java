package Anand;

public class HashMap {
    static class MyHashMap {

        // A simple Node class to store our key-value pairs
        class Node {
            int key, val;
            Node next;
            Node(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }

        // We use a large enough prime or constant to reduce collisions
        private final int SIZE = 10007; 
        private Node[] buckets;

        public  MyHashMap() {
            buckets = new Node[SIZE];
        }

        private int getIndex(int key) {
            return key % SIZE;
        }

        public void put(int key, int value) {
            int idx = getIndex(key);
            if (buckets[idx] == null) {
                // Using a dummy head node makes list operations (like remove) much cleaner
                buckets[idx] = new Node(-1, -1);
            }
            Node prev = find(buckets[idx], key);
            if (prev.next == null) {
                prev.next = new Node(key, value);
            } else {
                prev.next.val = value;
            }
        }

        public int get(int key) {
            int idx = getIndex(key);
            if (buckets[idx] == null) return -1;
            Node prev = find(buckets[idx], key);
            return (prev.next == null) ? -1 : prev.next.val;
        }

        public void remove(int key) {
            int idx = getIndex(key);
            if (buckets[idx] == null) return;
            Node prev = find(buckets[idx], key);
            if (prev.next != null) {
                prev.next = prev.next.next;
            }
        }

        /**
         * Helper to find the node BEFORE the one containing the target key.
         * This makes deletion and updating much easier.
         */
        private Node find(Node bucket, int key) {
            Node node = bucket, prev = null;
            while (node != null && node.key != key) {
                prev = node;
                node = node.next;
            }
            return prev;
        }
    }
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);          // The map is now [[1,1]]
        hashMap.put(2, 2);          // The map is now [[1,1], [2,2]]
        System.out.println(hashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        System.out.println(hashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        hashMap.put(2, 1);          // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        System.out.println(hashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        hashMap.remove(2);          // remove the mapping for 2, The map is now [[1,1]]
        System.out.println(hashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}
