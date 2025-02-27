public class ArrayMap<K, V> {
    private final int DEFAULT_CAPACITY = 10;
    private V[] values;
    private K[] keys;
    private int count = 0;

    public MyMapArr() {
        values = (V[]) ( new Object[DEFAULT_CAPACITY]);
        keys = (K[]) ( new Object[DEFAULT_CAPACITY]);
    }

    public MyMapArr(int size) {
        values = (V[]) ( new Object[size]);
        keys = (K[]) ( new Object[size]);
    }

    public void put(K key, V value) {
        keys[count] = key;
        values[count++] = value;
    }
}
