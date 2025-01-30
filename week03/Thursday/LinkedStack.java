public class LinkedStack<T> implements Stack<T> {
    private Node head;
    // head = top of the stack
    private int count;

    @Override
    public void push(T item) throws IllegalStateException {
        Node node = new Node(item);
        node.next = head;
        count++;
        head = node;
    }

    @Override
    public T pop() {
        if (head == null) {
            // stack empty
            return null;
        }

        T dataToReturn = head.data;

        // as soon as I reasign the
        // head ref var
        // that former head node
        // is orphaned FOREVER
        head = head.next;
        count--;

        return dataToReturn;

    }

    @Override
    public T peek() {
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

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "head=" + head +
                ", count=" + count +
                '}';
    }
}
