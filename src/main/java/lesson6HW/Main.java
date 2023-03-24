package lesson6HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        Создать множество ноутбуков (ArrayList).
        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
        Выводить только те ноутбуки, что соответствуют условию */

        Notebook nB1 = new Notebook("Apple", 4000.0, 500.0, "black", 17.0);
        Notebook nB2 = new Notebook("Huawei", 8000.0, 500.0, "red", 17.0);
        Notebook nB3 = new Notebook("ASUS", 4000.0, 1000.0, "white", 19.0);
        Notebook nB4 = new Notebook("Huawei", 8000.0, 500.0, "white", 17.0);
        Notebook nB5 = new Notebook("Acer", 8000.0, 1000.0, "black", 21.0);
        Notebook nB6 = new Notebook("ASUS", 4000.0, 1000.0, "red", 19.0);
        Notebook nB7 = new Notebook("Acer", 4000.0, 500.0, "black", 21.0);
        Notebook nB8 = new Notebook("Apple", 8000.0, 1000.0, "white", 17.0);

        ArrayList<Notebook> NoteBooks = new ArrayList<Notebook>();
        Collections.addAll(NoteBooks, nB1, nB2, nB3, nB4, nB5, nB6, nB7, nB8);
//      ArrayList <Notebook> NoteBooks = (ArrayList<Notebook>) List.of(nB1, nB2, nB3, nB4, nB5); // второй метод
//      System.out.println(NoteBooks);

        startSystem(NoteBooks);

    }

    private static void startSystem(ArrayList<Notebook> book) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("Выберите характеристику ноутбука:\n" +
                    "1. Производитель -> \"1\"\n" +
                    "2. Оперативная память -> \"2\"\n" +
                    "3. Жёсткий диск -> \"3\"\n" +
                    "4. Цвет -> \"4\"\n" +
                    "5. Диагональ экрана -> \"5\"\n" +
                    "6. Заполнить все характеристики -> \"6\"\n" +
                    "7. Вывести список доступных ноутбуков -> \"7\"\n" +
                    "0. Остановить программу -> \"0\"\n");

            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой. Попробуйте ещё раз!\n");
                continue;
            }

            if (inputString.equals("0")) {
                System.out.println("Работа программы завершена.\n");
                break;
            }

            if (inputString.equals("1")) {
                producerFind(book);
                continue;
            }

            if (inputString.equals("2")) {
                memoryFind(book);
                continue;
            }

            if (inputString.equals("3")) {
                hardDiskFind(book);
                continue;
            }

            if (inputString.equals("4")) {
                colorFind(book);
                continue;
            }

            if (inputString.equals("5")) {
                diagonalFind(book);
                continue;
            }

            if (inputString.equals("7")) {
                printAllNoteBooks(book);
                continue;
            }

            if (inputString.equals("6")) {
                allParametersFind(book);

            } else {
                System.out.println("Ошибка ввода команды. Попробуйте ещё раз!\n");
            }
        }
    }

    private static void allParametersFind(ArrayList<Notebook> book) {
        String msg1 = "Введите производителя: \n";
        String inputValue1 = enterFromUser(msg1);

        String msg2 = "Введите минимальный объём оперативной памяти: \n";
        double inputValue2 = checkDouble(msg2);

        String msg3 = "Введите минимальный объём жёсткого диска: \n";
        double inputValue3 = checkDouble(msg3);

        String msg4 = "Введите цвет: \n ";
        String inputValue4 = enterFromUser(msg4);

        String msg5 = "Введите минимальный размер диагонали экрана в дюймах: \n";
        double inputValue5 = checkDouble(msg5);

        int count = 0;
        for (Notebook item : book) {
            String producer = item.getProducer();
            double memory = item.getMemory();
            double hardDisk = item.getHardDisk();
            String color = item.getColor();
            double diagonal = item.getMemory();

            if (producer.equals(inputValue1)
                    && memory >= inputValue2
                    && hardDisk >= inputValue3
                    && color.equals(inputValue4)
                    && diagonal >= inputValue5) {
                item.printNoteBooks();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Подхожящего ноутбука не найдено.%n");
        }
    }

    private static void producerFind(ArrayList<Notebook> book) {
        String msg = "Введите производителя: \n";
        String inputValue = enterFromUser(msg);
        int count = 0;
        for (Notebook item : book) {
            String producer = item.getProducer();
            if (producer.equals(inputValue)) {
                item.printNoteBooks();
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Производитель \"%s\" не найден.%n", inputValue);
        }
    }

    private static void memoryFind(ArrayList<Notebook> book) {
        String msg = "Введите минимальный объём оперативной памяти: \n";
        double inputValue = checkDouble(msg);
        int count = 0;
        for (Notebook item : book) {
            double memory = item.getMemory();
            if (memory >= inputValue) {
                item.printNoteBooks();
                count++;
            }
        }
        if (count == 0) {
                System.out.printf("Ноутбуков с оперативной памятью \"%s\" не найдено.%n", inputValue);
        }
    }

    private static void hardDiskFind(ArrayList<Notebook> book) {
        String msg = "Введите минимальный объём жёсткого диска: \n";
        double inputValue = checkDouble(msg);
        int count = 0;
        for (Notebook item : book) {
            double hardDisk = item.getHardDisk();
            if (hardDisk >= inputValue) {
                item.printNoteBooks();
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Ноутбуков с размером жётского диска \"%s\" не найдено.%n", inputValue);
        }
    }

    private static void colorFind(ArrayList<Notebook> book) {
        String msg = "Введите цвет: \n ";
        String inputValue = enterFromUser(msg);
        int count = 0;
        for (Notebook item : book) {
            String color = item.getColor();
            if (color.equals(inputValue)) {
                item.printNoteBooks();
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("\"%s\" цвет не найден.%n", inputValue);
        }
    }

    private static void diagonalFind(ArrayList<Notebook> book) {
        String msg = "Введите минимальный размер диагонали экрана в дюймах: \n";
        double inputValue = checkDouble(msg);
        int count = 0;
        for (Notebook item : book) {
            double diagonal = item.getMemory();
            if (diagonal >= inputValue) {
                item.printNoteBooks();
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Ноутбуков с диагональю экрана \"%s\" не найдено.%n", inputValue);
        }
    }

    private static void printAllNoteBooks(ArrayList<Notebook> book) {
        for (Notebook item : book) {
            item.printNoteBooks();
        }
    }

    private static String enterFromUser(String text) {
        Scanner in = new Scanner(System.in);
        System.out.printf(text);
        String data = in.nextLine();
        while (data.isBlank()) {
            System.out.printf("Строка не должна быть пустой. Попробуйте ещё раз!%n");
            System.out.println(text);
            data = in.nextLine();
        }
        return data;
    }

    private static double checkDouble(String text ) {
        double doubleinputValue;
        while (true) {
            String inputValue = enterFromUser(text);
            try {
                doubleinputValue = Double.parseDouble(inputValue);
                break;
            } catch (NumberFormatException ex) {
                System.out.printf("Ошибка ввода данных, попробуйте ещё раз!%n");
            }
        }
        return doubleinputValue;
    }
}