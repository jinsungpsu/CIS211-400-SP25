import java.util.HashMap;
import java.util.LinkedList;

public class UUGenericMapGraph<T> {
    private HashMap<T, LinkedList<T>> adjList = new HashMap<>();

    public void addNode(T node) {
        adjList.put(node, new LinkedList<>());
    }

    public void addEdge(T src, T dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
}
