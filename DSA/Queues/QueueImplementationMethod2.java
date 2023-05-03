package Queues;

class Queue2 {
    int front,rear,size;
    int capacity;
    int []arr;
    Queue2(int capacity) {
        this.capacity=capacity;
        front=size=0;
        rear=capacity-1;
        arr=new int[capacity]; }

    boolean isFull() {
        return (size==capacity);
    }
    boolean isEmpty() {
        return (size==0);
    }
    void enqueue(int item) {
        if(isFull())
            return;
        rear=(rear+1)%capacity;
        arr[rear]=item;
        size=size+1;
        System.out.println(item+ " is enqeued into the QUEUE");
    }
    int dequeue() {
        if(isEmpty())
            return Integer.MIN_VALUE;
        int item=arr[front];
        front=(front+1)%capacity;
        size=size-1;
        System.out.println(item+ " is dequeued from the QUEUE");
        return item;
    }
    int front() {
        if(isEmpty())
            return Integer.MIN_VALUE;
        return arr[front];
    }
    int rear() {
        if(isEmpty())
            return Integer.MIN_VALUE;
        return arr[rear];
    }
}
public class QueueImplementationMethod2 {
    public static void main(String args[]) {
        Queue2 queue = new Queue2(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(60);


        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());

    }
}
