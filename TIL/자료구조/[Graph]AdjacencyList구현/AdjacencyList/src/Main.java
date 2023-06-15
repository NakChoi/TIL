public class Main {
    public static void main(String[] args) {

        Solution adjList = new Solution();
        adjList.setGraph(3);

        adjList.addEdge(0, 1);
        System.out.println(adjList.hasEdge(0, 1)); //true

    }
}