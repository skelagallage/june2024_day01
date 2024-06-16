package multithreading;

public class DepositedRunnable implements Runnable{

    private BankAccount bankAccount;

    public DepositedRunnable(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for(int i=0; i<3; i++){
            bankAccount.depositMoney(200);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
