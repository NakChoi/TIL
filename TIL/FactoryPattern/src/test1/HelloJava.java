package test1;

public class HelloJava {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("test1.Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffee("test1.Americano", 3000);

        System.out.println("Factory latte ::"+ latte);
        System.out.println("Factory ame ::"+ ame);
    }
}


abstract class Coffee {
    public abstract int getPrice();

    @Override
    public String toString(){                                       // toString() 오버라이딩하면 커피를 호출할때 toString()안에 메세지가 자동으로 출력된다.
        return "HI this coffee is "+ this.getPrice();
    }
}


class CoffeeFactory{
    public static Coffee getCoffee(String type, int price){
        if ("test1.Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if("test1.Americano".equalsIgnoreCase(type)) return new Americano(price);
        else {
            return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Coffee{
    private int price;

    public DefaultCoffee(){
        this.price = -1;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}

class Latte extends Coffee{
    private int price;

    public Latte(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}

class Americano extends Coffee{
    private int price;

    public Americano(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}


