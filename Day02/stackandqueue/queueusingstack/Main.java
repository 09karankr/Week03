package queueusingstack;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued: " + queue.dequeue()); // Output: 1
        queue.enqueue(4);
        System.out.println("Peek: " + queue.peek()); // Output: 2
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 2
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 3
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 4
    }
}
