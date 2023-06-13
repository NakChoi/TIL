public class Main {
    public static void main(String[] args) {


        Solution rootNode = new Solution("0");

        for(int i = 1; i <= 5; i++) {
            rootNode.addChildNode(new Solution(Integer.toString(i)));
        }

    }
}