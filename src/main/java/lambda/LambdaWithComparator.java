package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaWithComparator {

    public static void main(String[] args) {
        String[] stringsArr = {"Dog", "Elephant", "Hi", "Mango", "Banana"};

//        Arrays.sort(stringsArr, (String::compareTo));
//
//        System.out.println(Arrays.toString(stringsArr));
//        Arrays.sort(stringsArr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });

        Arrays.sort(stringsArr, (o1, o2) -> {
            return o1.length()-o2.length();
        });

        System.out.println(Arrays.toString(stringsArr));
    }
}
