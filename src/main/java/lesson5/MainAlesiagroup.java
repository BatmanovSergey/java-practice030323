package lesson5;

import java.util.List;
import java.util.Map;

public class MainAlesiagroup {
    public static void main(String[] args) {
//        Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXXII = 2022
//        Например, MMCMXCIX = 2999
        Map<String, Integer> romeNumbers = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000);
//        List<String> shortRomeNum = List.of("X", "I", "C", "M");
        String romeNum = "MMXXII";
        getArabianNum(romeNum, romeNumbers);
    }
    private static void getArabianNum(String romeNum, Map<String, Integer> romeNumbers) {
        int sum = 0;
        int next = 0;
        String[] romeNumSplit = romeNum.split("");
        for (int i = 0; i < romeNumSplit.length - 1; i++) {
            int current = romeNumbers.get(romeNumSplit[i]);
            next = romeNumbers.get(romeNumSplit[i + 1]);
            if (next > current) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        sum+=next;
        System.out.println(sum);
    }

    //    private static void getArabianNum(String romeNum, Map<String, Integer> romeNumbers, List<String> shortRomeNum) {
//        int sum = 0;
//        int next = 0;
//        String[] romeNumSplit = romeNum.split("");
////        System.out.println(Arrays.toString(romeNumSplit));
//        for (int i = 0; i < romeNumSplit.length - 2; i++) {
//            int current = romeNumbers.get(romeNumSplit[i]);
//            next = romeNumbers.get(romeNumSplit[i + 1]);
//            if (next < current) {
//                sum += current;
//            } else if (next > current && shortRomeNum.contains(romeNumSplit[i])) {
//                sum += next - current;
//                i++;
//            } else if (next == current) {
//                sum += current;
//            }
//        }
//        if (romeNumbers.get(romeNumSplit[romeNumSplit.length - 2]) < romeNumbers.get(romeNumSplit[romeNumSplit.length - 1])) {
//            sum += romeNumbers.get(romeNumSplit[romeNumSplit.length - 1]) - romeNumbers.get(romeNumSplit[romeNumSplit.length - 2]) ;
//        } else {
//            sum += romeNumbers.get(romeNumSplit[romeNumSplit.length - 1]);
//        }
//        System.out.println(sum);
//    }

}
