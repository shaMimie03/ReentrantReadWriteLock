package Week_09.ReentrantReadWriteLock;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccountWithLock account = new BankAccountWithLock(1000);

        // Create threads
        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.getBalance();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.withdraw(300);
            account.getBalance();
        }, "Thread-2");

        Thread t3 = new Thread(() -> {
            account.getBalance();
        }, "Thread-3");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
