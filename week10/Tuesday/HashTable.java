import java.util.Iterator;
import java.util.LinkedList;

public class HashTable<K, V> {
    private final int DEFAULT_CAPACITY = 100;
    private LinkedList<Entry>[] hashTable  = new LinkedList[DEFAULT_CAPACITY];
    private int count;

    private int hash(K key) {
        // you need to come up with your own
        return Math.abs(key.hashCode())%hashTable.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
        }

        Iterator<Entry> itr = hashTable[index].iterator();
        while (itr.hasNext()) {
            Entry entry = itr.next();
            if (key.equals(entry.key)) {
                entry.value = value;
                return;
            }
        }
        hashTable[index].add(new Entry(key, value));
        count++;
    }

    class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
