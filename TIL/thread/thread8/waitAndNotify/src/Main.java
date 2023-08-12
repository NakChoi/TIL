import java.lang.annotation.Target;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(10000);
        System.exit(0);

    }
}

class Customer implements Runnable {
    private Table table;
    private String food;

    public Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String name = Thread.currentThread().getName();

            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " failed to eat.  :(");
            }
        }
    }

    boolean eatFood() {
        return table.remove(food);
    }
}

class Cook implements Runnable {
    private Table table;

    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Table{
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD){
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        dishes.add(dish);
        notify();
        System.out.println("Dishes: " + dishes.toString());
    }

    public boolean remove(String dishName) {

        synchronized (this) {
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0){
                System.out.println(name + " is waiting.");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        return true;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }

    }

    public int dishNum() {
        return dishNames.length;
    }
}