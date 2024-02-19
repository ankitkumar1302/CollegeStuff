import java.util.Arrays;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        System.out.println("Adding 1, 2, 3 to the front of the queue...");
        queue.addFirst(1);
        queue.addFirst(2);
        queue.addFirst(3);

        System.out.println("Queue: " + Arrays.toString(queue.queue));
        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);
        System.out.println("Size: " + queue.size);

        System.out.println("Deleting the last element from the queue...");
        int deletedValue = queue.deleteLast();
        System.out.println("Deleted value: " + deletedValue);

        System.out.println("Queue: " + Arrays.toString(queue.queue));
        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);
        System.out.println("Size: " + queue.size);
    }

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = rear = size = 0;
    }

    // Add an element to the front of the circular queue
    public void addFirst(int value) {
        if (isFull()) {
            throw new IllegalStateException("Circular queue is full");
        }

        if (isEmpty()) {
            // If the queue is empty, set both front and rear to 0
            front = rear = 0;
        } else if (front == 0) {
            // If the front is at the beginning of the array, set it to the last index
            front = queue.length - 1;
        } else {
            // Otherwise, move the front to the previous index
            front--;
        }

        // Add the value to the front of the queue
        queue[front] = value;
        size++;
    }

    // Delete and return the last element from the circular queue
    public int deleteLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Circular queue is empty");
        }

        int deletedValue = queue[rear];

        if (front == rear) {
            // If there's only one element in the queue, reset both front and rear
            front = rear = 0;
        } else if (rear == queue.length - 1) {
            // If the rear is at the end of the array, set it to the beginning
            rear = 0;
        } else {
            // Otherwise, move the rear to the next index
            rear++;
        }

        size--;
        return deletedValue;
    }

    // Check if the circular queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the circular queue is full
    public boolean isFull() {
        return size == queue.length;
    }
}
