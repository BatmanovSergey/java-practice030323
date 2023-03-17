package lesson5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
//        Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXXII = 2022
//        MMXLII = 2042
//        VII = 7
//        IV = 4
//        MMCMXCIX = 2999
        romToArab();

//       Написать метод, который переведёт данное целое число в римский формат.
        arabToRom();
    }

    private static void arabToRom() {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("M", 1000);
        m.put("CM", 900);
        m.put("D", 500);
        m.put("CD", 400);
        m.put("C", 100);
        m.put("XC", 90);
        m.put("L", 50);
        m.put("XL", 40);
        m.put("X", 10);
        m.put("IX", 9);
        m.put("V", 5);
        m.put("IV", 4);
        m.put("I", 1);

//        for (Character character : m.keySet()) {
//            System.out.println(m.get(character));
//        }

        int arabNumber = 2999;
        StringBuilder romNumber = new StringBuilder();

//        while (arabNumber != 0) {
            for (Map.Entry<String, Integer> item : m.entrySet()) {
                while (arabNumber >= item.getValue()) {
                    romNumber.append(item.getKey());
                    arabNumber -= item.getValue();
                }
//            }
        }
        System.out.println(romNumber);

    }

    private static void romToArab() {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        String romNumber = "VII";
        int arabNumber = m.get(romNumber.charAt(romNumber.length() - 1));

        int current = 0;
        int prev = 0;

        for (int i = romNumber.length() - 1; i > 0; i--) {
            current = m.get(romNumber.charAt(i));
            prev = m.get(romNumber.charAt(i - 1));

            if (current <= prev) {
                arabNumber = arabNumber + prev;
            } else {
                arabNumber -= prev;
            }
        }
        System.out.println(arabNumber);
    }
}
