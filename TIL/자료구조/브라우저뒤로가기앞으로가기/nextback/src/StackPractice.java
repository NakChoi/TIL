import java.util.ArrayList;
import java.util.Stack;

public class StackPractice {


    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.add(start);

        for (int i = 0; i < actions.length; i++) {
            if (actions[i].equals("1")) {

                if(!nextStack.empty()){
                    prevStack.add(current.pop());
                    current.add(nextStack.pop());
                }

            } else if (actions[i].equals("-1") ) {
                if(!prevStack.empty()){
                    nextStack.add(current.pop());
                    current.add(prevStack.pop());
                }

            } else {

                prevStack.add(current.pop());
                current.add(actions[i]);
                nextStack.clear();

            }
        }

        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }

}
