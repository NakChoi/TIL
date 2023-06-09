public class Main {
    public static void main(String[] args) {


        StackPractice stackPractice = new StackPractice();

        String[] actions =  new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";

        System.out.println(stackPractice.browserStack(actions, start));
    }
}