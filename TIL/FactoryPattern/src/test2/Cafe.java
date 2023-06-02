package test2;

public enum Cafe {
    AMERICANO("아메리카노", 3000),
    LATTE("라떼", 4000);

    private final String value;
    private final int price;


    Cafe(String value, int price){
        this.value = value;
        this.price = price;
    }

    public String getValue(){
        return this.value;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return "Hi this coffee is "+ this.getValue()+ " Price is " + this.getPrice();
    }
}



