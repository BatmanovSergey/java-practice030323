package lesson2HW;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
//  Напишите метод, который принимает на вход строку (String) и определяет
//  является ли строка палиндромом (возвращает boolean значение).
        String s = inputStringForCheck();
        if (s.length() == 0 ) {
            System.out.printf("строка %s - не содержит символов", s);
        } else if (s.length() == 1 ) {
            System.out.printf("строка %s - содержит только один символ", s);
        } else {
            boolean res = checkPalindrome(s);
            if (res == true){
                System.out.printf("строка %s - палиндром", s);
            } else {
                System.out.printf("строка %s - не является палиндромом", s);
            }
        }
    }

    private static String inputStringForCheck() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для проверки:");
        String str = in.nextLine();
        in.close();
        return str;
    }

    private static Boolean checkPalindrome(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
