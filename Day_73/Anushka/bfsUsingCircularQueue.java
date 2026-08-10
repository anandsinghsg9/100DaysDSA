class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyCircularQueue {
    int[] arr;
    int front, rear, capacity, count;

    MyCircularQueue(int size) {
        capacity = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    boolean isEmpty() {
        return count == 0;
    }

    void enqueue(int data) {
        if (count == capacity) {
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        count++;
    }

    int dequeue() {
        if (isEmpty())
            return -1;

        int data = arr[front];
        front = (front + 1) % capacity;
        count--;
        return data;
    }
}

class Graph {

    private Node[] adjList;
    private int vertices;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new Node[vertices];
    }

    void addEdge(int src, int dest) {

        Node newNode = new Node(dest);
        newNode.next = adjList[src];
        adjList[src] = newNode;

        newNode = new Node(src);
        newNode.next = adjList[dest];
        adjList[dest] = newNode;
    }

    void bfs(int start) {

        boolean[] visited = new boolean[vertices];

        MyCircularQueue q = new MyCircularQueue(vertices);

        visited[start] = true;
        q.enqueue(start);

        while (!q.isEmpty()) {

            int current = q.dequeue();

            System.out.print(current + " ");

            Node temp = adjList[current];

            while (temp != null) {

                if (!visited[temp.data]) {
                    visited[temp.data] = true;
                    q.enqueue(temp.data);
                }

                temp = temp.next;
            }
        }
    }
}

public class bfsUsingCircularQueue {

    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs(0);
    }
}