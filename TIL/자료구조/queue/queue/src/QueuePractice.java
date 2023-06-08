import java.util.ArrayList;

public class QueuePractice {
    private ArrayList<Integer> arr = new ArrayList<>();

    public void add(int num) {
        arr.add(num);
    }

    public Integer poll() {
        if (arr.size() == 0) {
            return null;
        } else {
            return arr.remove(0);
        }
    }

    public int size() {
        return arr.size();
    }

    public Integer peek() {
        if (arr.size() == 0) {
            return null;
        }else
            return arr.get(0);
    }

    public String show() {
        return arr.toString();
    }

    public void clear() {
        arr.clear();
    }
}
