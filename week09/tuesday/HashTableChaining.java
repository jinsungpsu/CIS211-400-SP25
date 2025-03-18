import java.util.LinkedList;

public class HashTableChaining<K, V> {

    public static void main(String[] args) {
        HashTableChaining<String, Integer> phonebook = new HashTableChaining<>();
        phonebook.put("John", 123456);
        phonebook.put("Jin", 1413415);
        phonebook.put("Jed", 14987194);
        phonebook.put("Braden", 19487140);
        phonebook.put("Carl", 913847134);
    }

    private final int DEFAULT_CAPACITY = 5;
    private int count = 0;

    private LinkedList<Entry>[] hashTable = new LinkedList[DEFAULT_CAPACITY];

    public void put(K key, V value) {
        // how to check for collisions
        // check the spot... if there's something there
        // then a collisions has occurred

        int index =hash(key);

        if (hashTable[index] == null ) {
            // no collision
            hashTable[index] = new LinkedList<>();
        }
        // no collisions...
        Entry newEntry = new Entry();
        newEntry.key = key;
        newEntry.value = value;

        hashTable[index].add(newEntry);
        count++;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % hashTable.length;
    }

    class Entry {
        K key;
        V value;
    }
}
