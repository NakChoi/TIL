public class Main {
    public static void main(String[] args) {
        RunnableEx r = new RunnableEx();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }

}

class Account{
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    /*public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            balance -= money;
        }
    }*/

    public void withdraw(int money) {
        synchronized (this) {
        if (balance >= money) {
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
               }
               balance -= money;
           }
        }
    }
}

class RunnableEx implements Runnable{
    Account acc =  new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int)(Math.random()*3 +1) *100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}