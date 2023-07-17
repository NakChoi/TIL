public class Main {
    public static void main(String[] args) {

        final Car car = new Car(1);

        Bus bus = new Bus(car);

        bus.val.intVal = 3;

        System.out.println(car.intVal);
    }
}