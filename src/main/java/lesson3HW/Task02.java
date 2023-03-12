package lesson3HW;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {

//  2. Задан целочисленный список ArrayList.
//  Найти минимальное, максимальное и среднее арифметическое из этого списка.
        List<Integer> ourArray = getRandomListFromInputSize();
        findMaxMinAverage(ourArray);
    }

    private static void findMaxMinAverage(List<Integer> array) {

        int max = Collections.max(array);
        System.out.printf("Максимальное значение в массиве равно: %d%n", max);
        int min = Collections.min(array);
        System.out.printf("Минимальное значение в массиве равно: %d%n", min);
        double average = findAverage(array);
        System.out.printf("Среднеарифметическое значение в массиве равно: %.2f%n", average);

    }

    private static double findAverage(List<Integer> array) {
        double sum = 0;
        for (Integer item : array) {
            sum += item;
        }
        return sum/ array.size();
    }

    private static List<Integer> getRandomListFromInputSize() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = Integer.parseInt(in.nextLine());
        in.close();
        List<Integer> numbs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbs.add(random.nextInt(-100, 100));
        }
        System.out.printf("Исходный массив: " + numbs + "%n");
        return numbs;
    }
}

