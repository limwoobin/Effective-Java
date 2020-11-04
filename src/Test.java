

public class Test {
    public static void main(String[] args) {
        Runnable runnable = new RunnableTest2();
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();
    }
}

class Account_2 {
    int balance = 1000;

    public synchronized void withdraw(int money) {
        while (balance < money) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        balance -= money;
    }

    public synchronized void deposit(int money) {
        balance += money;
        notify();
    }
}

class RunnableTest2 implements Runnable {
    Account_2 account = new Account_2();

    public void run() {
        while (account.balance > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            account.withdraw(money);
            System.out.println("balance : " + account.balance);
        }
        account.deposit(1000);
    }
}


