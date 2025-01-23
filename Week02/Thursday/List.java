public class ActualList<T> implements List<T>{
    /*
    Arrays are...
    1) size/length immutable
    1B) stored in contiguous memory
     */
    private final int DEFAULT_SIZE = 10;
    private T[] stuffs;
    private int count = 0;

    public ActualList() {
        stuffs = (T[]) new Object[DEFAULT_SIZE];
    }

    public ActualList(int size) {
        stuffs = (T[]) new Object[size];
    }

    @Override
    public void add(T item) {
        if (count < stuffs.length) {
            stuffs[count] = item;
            count++;
        }
    }

    @Override
    public void remove(T item) {
        int itemIndex = -1;
        for (int i = 0; i < count; i++) {
            if (item.equals(stuffs[i])) {
                itemIndex = i;
                break;
            }
        }
        for (int i = itemIndex; i < count-1; i++) {
            stuffs[i] = stuffs[i+1];
        }
        count--;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "list contents!!!";
    }

}
