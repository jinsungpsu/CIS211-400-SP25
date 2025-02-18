import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] queue;
    private int count = 0;
    private int front, back;

    public ArrayQueue() {
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue(int intialCapacity) {
        queue = (T[])(new Object[intialCapacity]);
    }

    @Override
    public void enqueue(T it) throws IllegalStateException {
        if (count == queue.length) {
            throw new IllegalStateException("Array full");
        }

        // implied ELSE... there is still space in the array

        // still to do
        // when i get to the "end" of the array, how do i wrap around?
        if (back == queue.length) {
            back = 0;
        }
        // what if it's full?
        queue[back++] = it;
        // this is the same as doing
        // queue[back] = it;
        // back++;
        // in two separate lines
        count++;
    }

    @Override
    public T dequeue() {
        if (count == 0) return null;
        // what if it's empty?
        // what if it's past the end?
        if (front == queue.length) front = 0;
        count--;
        return queue[front++];
    }

    @Override
    public T frontValue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder o = new StringBuilder();

        for (int i = front; i < back; i++) {
            o.append(queue[i] + " ");
            // somehow still need to reset back...
            // or something
        }

        return o.toString();
    }
}
