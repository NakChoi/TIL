import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Solution adjMatrix = new Solution();
        adjMatrix.setGraph(3);
        System.out.println(Arrays.deepToString(adjMatrix.getGraph()));
    }
}