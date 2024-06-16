package multithreading;

public class Demo {

    public static void main(String[] args) {
        BankAccount account01 = new BankAccount("Account01");
        BankAccount account02 = new BankAccount("Account02");

        DepositedThread t1 = new DepositedThread(account01);
        DepositedThread t2 = new DepositedThread(account02);

        DepositedRunnable r1 = new DepositedRunnable(account01);
        DepositedRunnable r2 = new DepositedRunnable(account02);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }



}
