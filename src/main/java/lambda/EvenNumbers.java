package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(23, 55, 44, 98, 23, 38, 95, 28);
        List<Integer> evenList = new ArrayList<>();

//        for(int i = 0; i < integerList.size(); i++){
//            if(integerList.get(i) % 2 == 0){
//                evenList.add(integerList.get(i));
//            }
//        }

//        for(int element : integerList){
//            if(element % 2 == 0){
//                evenList.add(element);
//            }
//        }

//        integerList.forEach(integer -> {
//            if(integer%2==0) evenList.add(integer);
//        });

        evenList = integerList.stream()
                .filter(integer -> integer % 2 ==0).toList();

        System.out.println(evenList);
    }
}
