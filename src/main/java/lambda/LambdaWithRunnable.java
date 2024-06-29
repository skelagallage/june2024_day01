package lambda;

public class LambdaWithRunnable {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm from anonymous runnable method");
            }
        };

        Runnable runnable2 = () -> System.out.println("I'm from lambda runnable");

        runnable1.run();
        runnable2.run();
    }
}
