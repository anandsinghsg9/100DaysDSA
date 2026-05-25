public class circularQueue {
    int [] arr;
    int ptr1;
    int ptr2;
    int maxSize;
    int size;

    public void MyCircularQueue(int k) {
        arr= new int [k];
        ptr1=-1;
        ptr2=0;
        maxSize=k;
        size=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        ptr1= (ptr1+1)%maxSize;
        arr[ptr1]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        ptr2=(ptr2+1)%maxSize;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[ptr2];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[ptr1];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==maxSize;
    }
    public static void main(String[] args) {
        circularQueue obj = new circularQueue();
        obj.MyCircularQueue(3);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.enQueue(2));
        System.out.println(obj.enQueue(3));
        System.out.println(obj.enQueue(4));
        System.out.println(obj.Rear());
        System.out.println(obj.isFull());
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(4));
        System.out.println(obj.Rear());
    }
}
