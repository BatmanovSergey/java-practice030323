package lesson2HW;

import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task02 {
    static Logger logger = Logger.getLogger("Task5");

    public static void main(String[] args) {
//  Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//  который запишет эту строку в простой текстовый файл, обработайте исключения.
        String[] s = inputStrings();
        String ls = createLongString(s);
        writeStringIntoFile(ls);

    }

    private static String[] inputStrings() {
        String[] stringsArray = new String[2];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово:");
        String str = in.nextLine();
        stringsArray[0] = str;
        System.out.println("Введите число повторений:");
        String n = in.nextLine();
        stringsArray[1] = n;
        in.close();
        return stringsArray;
    }

    private static String createLongString(String[] str) {
        String word = str[0];
        int n = Integer.parseInt(str[1]);
        StringBuilder sb = new StringBuilder(10000);
        for (int i = 0; i < n; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    private static void writeStringIntoFile(String str) {
        try (FileWriter fw = new FileWriter("file.txt")) {
            fw.write(str);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            logger.warning(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
}
