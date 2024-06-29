package lambda;

import java.util.function.Supplier;

public class LambdaWithSupplier {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello world";

        System.out.println(supplier.get());
    }
}
