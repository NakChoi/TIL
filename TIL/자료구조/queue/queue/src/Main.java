import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        QueuePractice queue = new QueuePractice();


        queue.size(); // 0
        for(int i = 1; i < 10; i++) {
            queue.add(i);
        }
        queue.poll(); // 1
        queue.poll(); // 2
        System.out.println(queue.size()); // 7
        queue.add(10);
        System.out.println(queue.size()); // 8
        queue.poll(); // 3
        queue.poll(); // 4
        System.out.println(queue.size()); // 6

        System.out.println(queue.show());



    }
}