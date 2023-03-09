package lesson2HW;


import java.io.File;

public class Task03 {
    public static void main(String[] args) {

        readFilesFromDirectory("C:\\Users\\Сергей\\Desktop\\java\\java-practice030323");
    }

    private static void readFilesFromDirectory(String pathDir) {
        File dir = new File(pathDir);
        String[] filesNames = dir.list();
        StringBuilder sb = new StringBuilder();
        for (String fileTitle : filesNames) {
            sb.append(fileTitle).append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
