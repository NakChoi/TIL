import java.util.ArrayList;

public class PracticeStack {

    private ArrayList<Integer> arr_stack = new ArrayList<>();

    public void push(Integer data){
        arr_stack.add(data);
    }

    public Integer pop(){
        if(arr_stack.size() ==0){
            return null;
        }else {
            return arr_stack.remove(arr_stack.size() -1); // remove할때 지운 마지막 값이 리턴됨.
        }
    }

    public int size() {
        return arr_stack.size();
    }

    public Integer peek(){
        if(arr_stack.size() ==0){
            return null;
        }else {
            return arr_stack.get(arr_stack.size() -1);
        }
    }

    public String show(){
        return arr_stack.toString();
    }

    public void clear(){arr_stack.clear();}

}
