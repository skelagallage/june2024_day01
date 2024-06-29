package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Zeema");
//        stringList.add("Janaka");
//        stringList.add("Vinodya");
        List<String> stringList = Arrays.asList("Zeema", "Janaka", "Vinodya");
//        List<String> reverseList = new ArrayList<>();
//        for(int i=stringList.size()-1; i>=0; i--){
//            reverseList.add(stringList.get(i));
//        }
        Collections.reverse(stringList);
        System.out.println(stringList);
//        System.out.println(reverseList);
    }
}
