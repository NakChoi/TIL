public class Main {
    public static void main(String[] args) {

        PracticeStack stack = new PracticeStack();

        stack.size(); // 0
        for(int i = 1; i < 10; i++) {
            stack.push(i);
        }
        stack.pop(); // 9
        stack.pop(); // 8
        stack.size(); // 7
        stack.push(8);
        System.out.println(stack.size());


    }
}