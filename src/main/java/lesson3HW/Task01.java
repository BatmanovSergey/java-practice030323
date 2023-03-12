package lesson3HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

//  1. Пусть дан произвольный список целых чисел,
//  удалить из него четные числа (в языке уже есть что-то готовое для этого)

        List<Integer> ourArray = getRandomListFromInputSize();
        deleteEvenElemets(ourArray);
    }

    private static void deleteEvenElemets(List<Integer> array) {
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            }
        }
        System.out.printf("Массив после удаления чётных чисел: " + array + "%n");
    }

    private static List<Integer> getRandomListFromInputSize() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = Integer.parseInt(in.nextLine());
        in.close();
        List<Integer> numbs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbs.add(random.nextInt(size * 5));
        }
        System.out.printf("Исходный рандомный массив: " + numbs + "%n");
        return numbs;
    }
}

