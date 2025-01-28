public class List {
    public static void main(String[] args) {
        Node<Integer> firstNode = new Node<>(1);
        Node<Integer> secondNode = new Node<>(2);

        firstNode.next = secondNode;

        secondNode.next = new Node<>(3);

        // adding a 4th node
        // firstNode.next.next.next = new Node<>(4);
        secondNode.next.next = new Node<>(4);

    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
