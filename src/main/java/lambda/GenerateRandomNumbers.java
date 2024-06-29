package lambda;

import java.util.Random;
import java.util.function.Function;

public class GenerateRandomNumbers {

    public static void main(String[] args) {

        Function<Integer[], Integer> randomNumberGen = integers -> {
            int min = integers[0];
            int max = integers[1];
            return new Random().nextInt(((max - min) + 1))+min;
        };

//        System.out.println(new GenerateRandomNumbers().genRandom(10, 20));
        System.out.println(randomNumberGen.apply(new Integer[]{3, 10}));
    }

    public int genRandom(int min, int max){
        return new Random().nextInt(((max - min) + 1))+min;

    }
}
