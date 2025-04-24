import java.util.HashMap;

public class UWMatrix<T> {
    private int DEFAULT_CAPACITY = 10;
    private int[][] matrix;
    private HashMap<T, Integer> nodes = new HashMap<>();
    private int count = 0;

    public UWMatrix() {
        matrix = new int[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
    }
    public UWMatrix(int numNodes) {
        matrix = new int[numNodes][numNodes];
    }

    public void addNode(T node) {
        nodes.put(node, count++);
    }

    public void addEdge(T src, T dest, int weight) {
        matrix[nodes.get(src)][nodes.get(dest)] = weight;
        matrix[nodes.get(dest)][nodes.get(src)] = weight;
    }

    public boolean hasEdge(T src, T dest) {
        return false;
    }
}
