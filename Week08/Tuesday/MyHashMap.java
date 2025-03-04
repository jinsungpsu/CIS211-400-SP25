public class MyHashMap<K, V> {
    private final int DEFAULT_CAPACITY = 10;
    private V[] values;
    private K[] keys;
    private int count = 0;

    public MyHashMap() {
        values = (V[]) ( new Object[DEFAULT_CAPACITY]);
        keys = (K[]) ( new Object[DEFAULT_CAPACITY]);
    }

    public MyHashMap(int size) {
        values = (V[]) ( new Object[size]);
        keys = (K[]) ( new Object[size]);
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        keys[index] = key;
        values[index] = value;
        count++;
    }

    public V get(K key) {
        int index = hashFunction(key);
        return values[index];
    }

    // hash function
    private int hashFunction(K key) {
        System.out.println(key + "'s hash code is: " + key.hashCode());
        return Math.abs(key.hashCode()) % keys.length;
    }
}
