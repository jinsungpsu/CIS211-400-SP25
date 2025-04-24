import java.util.HashMap;
import java.util.LinkedList;

public class UWAdjList<T> {
    private final int DEFAULT_SIZE = 10;
    private LinkedList<Entry>[] adjList;
    private HashMap<T, Integer> nodes = new HashMap<>();

    private int count = 0;

    public UWAdjList() {
        adjList = new LinkedList[DEFAULT_SIZE];
    }
    public UWAdjList(int size) {
        adjList = new LinkedList[size];
    }

    public void addNode(T node) {
        nodes.put(node, count++);
        adjList[count-1] = new LinkedList<>();
        // adjList[nodes.get(node)] = new LinkedList<>();
    }

    public void addEdge(T src, T dest, int weight) {
        int srcIndex = nodes.get(src);
        int destIndex = nodes.get(dest);

        Entry srcEntry = new Entry(src, weight);
        Entry destEntry = new Entry(dest, weight);

        adjList[srcIndex].add(destEntry);
        adjList[destIndex].add(srcEntry);

//        adjList[nodes.get(src)].add(new Entry(dest, weight));
//        adjList[nodes.get(dest)].add(new Entry(src, weight));
    }

    class Entry {
        T dest;
        int weight;

        public Entry(T dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }
}
