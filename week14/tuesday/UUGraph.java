import java.util.HashMap;

public class UUMatrix<T> {
    private int DEFAULT_CAPACITY = 10;
    private boolean[][] matrix;
    private HashMap<T, Integer> nodes = new HashMap<>();
    private int count = 0;

    public UUMatrix() {
        matrix = new boolean[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
    }
    public UUMatrix(int numNodes) {
        matrix = new boolean[numNodes][numNodes];
    }

    public void addNode(T node) {
        nodes.put(node, count++);
    }

    public void addEdge(T src, T dest) {
        matrix[nodes.get(src)][nodes.get(dest)] = true;
        matrix[nodes.get(dest)][nodes.get(src)] = true;
    }

    public boolean hasEdge(T src, T dest) {
        return false;
    }
}
