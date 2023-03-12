package lesson2HW;


import java.io.File;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        String[] fileNameArray = readFilesFromDirectory("src/main/java/lesson2HW");
        if (fileNameArray.length == 0) {
            System.out.println("Папка пустая");
            System.exit(0);
        }
        showFileExtensions(fileNameArray);
    }

    private static String[] readFilesFromDirectory(String pathDir) {
        File dir = new File(pathDir);
        try {
            if (dir.isFile()) {
                System.out.println("Введён путь к файлу");
                System.exit(0);
            }
            String[] filesNames = dir.list();
            if (filesNames == null) {
                System.out.println("Директория не найдена");
                System.exit(0);
            }
            return filesNames;

        } catch (SecurityException e) {
            System.out.println("Директория не доступна");
            System.exit(0);
            return null;
        }
    }

    private static void showFileExtensions(String[] str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (String fileName : str) {
            String[] words = fileName.split("\\.");
            if (words[0] == "" || words.length == 1 ){
                sb.append(count).
                        append(" Расширение файла: ").
                        append(" ").
                        append(System.lineSeparator());
                count++;
            } else {
                sb.append(count).
                        append(" Расширение файла: ").
                        append(words[words.length - 1]).
                        append(System.lineSeparator());
                count++;
            }
        }
        System.out.println(sb);
    }
}

