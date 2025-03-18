import java.util.HashMap;

public class HashTableProbing<K, V> {

    public static void main(String[] args) {
        HashTableProbing<String, Integer> phonebook = new HashTableProbing<>();
        phonebook.put("John", 123456);
        phonebook.put("Jin", 1413415);
        phonebook.put("Jed", 14987194);
        phonebook.put("Braden", 19487140);
        phonebook.put("Carl", 913847134);
    }



    private final int DEFAULT_CAPACITY = 5;
    private V[] values;
    private K[] keys;
    private int count = 0;

    public HashTableProbing() {
        values = (V[])(new Object[DEFAULT_CAPACITY]);
        keys = (K[])(new Object[DEFAULT_CAPACITY]);
    }

    public void put(K key, V value) {
        // how to check for collisions
        // check the spot... if there's something there
        // then a collisions has occurred

        if (count == keys.length) {
            // full!
            return;
        }

        int index =hash(key);

        if (keys[index] != null) {
            // something there... collision!!!
            // linear probing
            for(int i = 0; i < keys.length - 1; i++) {
                if (keys[(i+index+1)% keys.length] == null) {
                    // this spot is open!
                    keys[(i+index+1)% keys.length] = key;
                    values[(i+index+1)% keys.length] = value;
                    count++;
                    return;
                }
            }
        }
        // no collisions...
        keys[index] = key;
        values[index] = value;
        count++;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % keys.length;
    }
}
