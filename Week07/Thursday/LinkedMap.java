public class LinkedMap<K, V> {
    // linked list?
    // array?

    private Node head, tail;
    private int count = 0;

    public void put(K key, V value) {
        Node node = new Node();
        node.key = key;
        node.value = value;
        if(head==null) {
            head = tail = node;
        } else {
            // arbitrary - add to head.
            node.next = head;
            head.prev = node;
            head = node;
        }
        count++;
    }

    public V get(K key) {
        if (head == null) {
            return null;
        } else {
            // not empty
            Node itr = head;
            while (itr != null) {
                if (itr.key.equals(key)) {
                    // found it!
                    return itr.value;
                }
                itr = itr.next;
            }
            // not found in the whole list
            return null;
        }
    }

    class Node {
        K key;
        V value;
        Node next, prev;
    }
}
