public class ArrayQueue2<T> implements Queue<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] queue;
    private int count = 0;
    private int front, back;

    public ArrayQueue2() {
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayQueue2(int intialCapacity) {
        queue = (T[])(new Object[intialCapacity]);
    }

    @Override
    public void enqueue(T it) throws IllegalStateException {
        if (count == queue.length) {
            throw new IllegalStateException("Array full");
        }

        queue[(back++)%queue.length] = it;
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
