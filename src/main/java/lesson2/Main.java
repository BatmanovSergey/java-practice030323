package lesson2;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10000); //идетично StringBuffer
        for (int i = 0; i < 10000; i++) {
            sb.append(i).append(": ").append((char) i).append(System.lineSeparator());

//            sb = sb.append(i);
//            sb = sb.append(": ");
//            sb = sb.append((char) i);
//
        }
//        String strResult = sb.toString();
//        System.out.println(strResult); // идентично строке 16
//        System.out.println(sb);

//       Дано число N (>0) и символы c1 и c2.
//       Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

        int n = 5;
        char a = 'A';
        char b = 'B';

        String result = numToString(n, a, b);
//        System.out.println(result);
//        System.out.println(stringBilderUse(n, a, b));

//        Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd.

        String str1 = "aaaabbbcdd" ;
        System.out.println(pressString(str1));
    }

    private static String pressString(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(array[i]);
                    count = 1;
                } else {
                    sb.append(array[i]).append(count);
                    count = 1;
                }
            }
        }
        if (array[array.length - 1] == array[array.length - 2]) {
            sb.append(array[array.length - 1]).append(count);
        }else{
            sb.append(array[array.length - 1]);
        }
        return sb.toString();
    }


    private static String stringBilderUse(int n, char a, char b) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
        }
        return sb.toString();
    }

    private static String numToString(int n, char a, char b) {
        String str = "" ;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str += a;
            } else {
                str += b;
                ;
            }
        }
        return str;
    }
}
