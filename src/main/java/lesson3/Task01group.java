package lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Task01group {
    public static void main(String[] args) {
        randomNumbers();
    }

    private static void randomNumbers() {
        List<Integer> numbers = new ArrayList<>();
//        int randomWithMathRandom = (int) ((Math.random() * (max - min)) + min);
//        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        for (int i = 0; i <= 10; i++) {
            int n = (int) ((Math.random() * (60 - 0)) + 0);
            numbers.add(n);
        }
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
