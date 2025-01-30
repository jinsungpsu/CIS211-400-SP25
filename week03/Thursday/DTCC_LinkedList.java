public class DTCC_LinkedList {
    private Node head;
    private int count = 0;

    public void remove(int itemToRemove) {
        Node itr = head;
        while(itr.next != null) {
            if (itemToRemove == itr.data) {
                // found it!
            }
            itr = itr.next;
        }
    }

    public void add(int it) {
        // create a node
        // the new information i'm trying to add
        // gets wrapped within that node
        // that node can hold 2 pieces of data
        // including where to find the NEXT node
        Node node = new Node(it);


        if(head == null) {
            // list is empty
            head = node;
        } else {
            // list is NOT empty
            Node iterator = head;
            for (int i = 0; i < count-1; i++) {
                iterator = iterator.next;
            }
            iterator.next = node;
        }

        count++;
    }

    class Node {
        int data;
        Node next;

        Node(int it) {
            data = it;
        }
    }
}
