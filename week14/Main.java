//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //UUMatrix<String> graph = new UUMatrix<>(5);
        UUAdjList<String> graph = new UUAdjList<>(5);
        graph.addNode("PHL");
        graph.addNode("JFK");
        graph.addNode("EWR");
        graph.addEdge("PHL", "EWR");
        graph.addEdge("JFK", "EWR");

        UWAdjList<String> graph2 = new UWAdjList<>(3);
        graph2.addNode("PHL");
        graph2.addNode("JFK");
        graph2.addNode("EWR");
        graph2.addEdge("PHL", "EWR", 5);
        graph2.addEdge("JFK", "EWR", 10);
    }
}