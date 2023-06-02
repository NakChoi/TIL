public class Main {
    public static void main(String[] args) {


        int chicken = 100;

        int serviceChicken = 0;
        int coupon = 0;

        int var = 10;

        while (chicken/var >0){

            serviceChicken += chicken/var;

            coupon = chicken/var + chicken%var;

            chicken = coupon;

        }


        System.out.println(serviceChicken);

    }
}