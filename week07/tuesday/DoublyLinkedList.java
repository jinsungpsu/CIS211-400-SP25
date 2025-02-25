import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
    private Node head, tail;
    private int count = 0;

    /*
    returns true if able to add
    false otherwise
    adds item of type T to the "end" of this list
     */
    public boolean add(T item) {
        // gentle version...
        // returns a special value
        // instead of throwing an exception

        // make a decision
        // is the head/tail of the linked list
        // the "first" or "last" item of this list
        /*

        option 1:
        head 000000000000000 tail
        first 00000000000000 last

        option 2:
        head 000000000000000 tail
        last 00000000000000 first

         */

        // make a new node

        // option 1 - says the last item
        // of a list is always at the tail
        // of this DLL

        // probably should check... null?

        // check if head == null
        // check if it's empty
//        if (head == null) {
//            // if (tail == null)
//            // if (count == 0)
//            // list is empty?
//            Node node = new Node();
//            node.data = item;
//            head = node;
//            tail = node;
//            count++;
//            return true;
//        } else {
//            // not empty
//            Node node = new Node();
//            node.data = item;
//
//            // connect the new node
//            // to the existing tail
//            tail.next = node;
//
//            // connect back
//            node.prev = tail;
//
//            // reassign tail
//            tail = tail.next;
//            // alternatively, tail = node;
//
//            // make the last node connect BACK
//            // shouldn't wait to this last (Elliot!)
//            // because then you'd have to traverse forward from head...
//            // since there's no way to get back to the second to last node
//
//            count++;
//            return true;
//
//
//        }
        // version 2.0
        try {
            Node node = new Node();
            node.data = item;
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = tail.next;
            }
            count++;
            return true;
        } catch (OutOfMemoryError e) {
            return false;
        }

    }

    public void remove(int index) throws NoSuchElementException {
        if (head == null) {
            // empty
            throw new NoSuchElementException("List is empty");
        } else if (index > count || index < 0) {
            throw new NoSuchElementException("Index is invalid.");
        } else {
            // index is valid, so let's remove the item
            // since I can traverse this list from both sides
            // check whether I should start at head or tail
            // and traverse forwards or backwards
        }
    }

    /*
    add
    remove based on index
    toString
    get based on index
    isempty
    length
     */

    class Node {
        Node prev, next;
        T data;
    }
}
