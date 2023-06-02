import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
    public void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KAKAOCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid Using KAKAOCard.");
    }
}

class LUNACardStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public LUNACardStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid Using LUNACard.");
    }
}

class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart{
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;

        for(Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}


public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("item1", 500);
        Item B = new Item("item2", 800);

        cart.addItem(A);
        cart.addItem(B);

        // Pay by LUNACard
        cart.pay(new LUNACardStrategy("NakJunChoi@example.com","NakJunChoi"));

        // pay by KAKAOCard
        cart.pay(new KAKAOCardStrategy("Nak Jun Choi", "123456789", "123", "01/26"));
    }
}