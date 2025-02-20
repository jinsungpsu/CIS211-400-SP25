public class ArrayQueue3<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] queue;
    private int count = 0;
    private int front, back;

    // left side of array (initially) is back of queue
    // right side is front of queue

    public ArrayQueue3() {
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue3(int intialCapacity) {
        queue = (T[])(new Object[intialCapacity]);
    }

    @Override
    public void enqueue(T it) throws IllegalStateException {
        if (count == queue.length) {
            throw new IllegalStateException("Array full");
        }

        queue[((back--)%queue.length+queue.length)% queue.length] = it;
        count++;
    }

    @Override
    public T dequeue() {
        if (count == 0) return null;
        count--;
        return queue[(front-- % queue.length + queue.length) % queue.length];
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
        // version A
        // need to write some logic
        // for when front is past the back (circular)
        for (int i = front; i < back; i++) {
            // o.append(queue[i] + " ");
            // somehow still need to reset back...
            // or something
        }

        // version B
        // it's the correct number of iterations
        // but need to make sure
        // items start at the right place
        for (int i = 0; i < count; i++) {
            o.append(queue[(i+front)% queue.length] + " ");
        }

        return o.toString();
    }
}
