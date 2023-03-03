package lesson1HW;

public class Main {
    public static void main(String[] args) {
        searchMaxAndMin();
    }

    //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void searchMaxAndMin() {
        int[] arr = {10, 1, 5, 8, 20, 15, -5, -2, 0, 9};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}