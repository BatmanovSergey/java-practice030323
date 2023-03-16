package lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Maingroup {
    public static void main(String[] args) {
//        1. Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида
//        text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        inputText();

    }

    private static void inputText() {
        List<String> linkedList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку вида: text~num");
            String str = in.nextLine();
            if (str.isBlank()) {
                System.out.println("Не должно быть пустой строки");
            } else if (str.equalsIgnoreCase("print~all")) {
                System.out.println(linkedList);
            } else {
                String[] newArray = str.split("~"); //[text, num]
                int n = Integer.parseInt(newArray[1]);
                if (newArray[0].equalsIgnoreCase("print")) {
                    System.out.println(linkedList.get(n));
                } else if (n < linkedList.size()) {
                    linkedList.set(n, newArray[0]);
                } else {
                    int size = linkedList.size();
                    for (int i = size; i < n; i++) {
                        linkedList.add(i, "null");
                    }
                    linkedList.add(n, newArray[0]);
                }
            }
        }
    }
}
