//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UUMatrix<String> graph = new UUMatrix<>(5);
        graph.addNode("PHL");
        graph.addNode("JFK");
        graph.addNode("EWR");
        graph.addEdge("PHL", "EWR");
        graph.addEdge("JFK", "EWR");
    }
}
