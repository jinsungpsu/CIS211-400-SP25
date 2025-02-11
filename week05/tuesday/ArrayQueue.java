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
        // still to do
        // when i get to the "end" of the array, how do i wrap around?
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
        // what if it's empty?
        // what if it's past the end?
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
}
