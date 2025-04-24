import java.util.HashMap;
import java.util.LinkedList;

public class UUAdjList<T> {
    private final int DEFAULT_SIZE = 10;
    private LinkedList<T>[] adjList;
    private HashMap<T, Integer> nodes = new HashMap<>();
    private int count = 0;

    public UUAdjList() {
        adjList = new LinkedList[DEFAULT_SIZE];
    }
    public UUAdjList(int size) {
        adjList = new LinkedList[size];
    }

    public void addNode(T node) {
        nodes.put(node, count++);
        adjList[count-1] = new LinkedList<>();
        // adjList[nodes.get(node)] = new LinkedList<>();
    }

    public void addEdge(T src, T dest) {
        adjList[nodes.get(src)].add(dest);
        adjList[nodes.get(dest)].add(src);
    }
}
