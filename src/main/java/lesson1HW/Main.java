package lesson1HW;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        searchMaxAndMin(); // задача 1
//        getNameAndPrintHiFromTime(); // задача 2


    }

    //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void searchMaxAndMin() {
        int[] arr = {10, 1, 5, 8, 20, 15, -5, -2, 0, 9};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Максимальное значение = %d", max);
        System.out.println();
        System.out.printf("Минимальное значение = %d", min);
    }

    //3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59;
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static void getNameAndPrintHiFromTime() {
        String name = inputName();
        LocalDateTime dateTime = LocalDateTime.now();
        int t = dateTime.getHour();
//        System.out.println(dateTime);
//        System.out.println(t);
        if (t >= 5 && t < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (t >= 12 && t < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (t >= 18 && t < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }

    private static String inputName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String nameUser = in.nextLine();
        in.close();
        return nameUser;
    }

}