package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "orange", "banana");
        List<String> upperCaseList = new ArrayList<>();

//        upperCaseList = stringList.stream()
//                .map(s -> s.toUpperCase()).toList();

        upperCaseList = stringList.stream()
                .map(String::toUpperCase).toList();

        System.out.println(upperCaseList);

    }
}
