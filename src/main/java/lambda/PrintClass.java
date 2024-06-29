package lambda;

import java.util.Arrays;
import java.util.List;

public class PrintClass {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("cat", "rat", "bat");

        stringList.forEach(System.out::println);
    }
}
