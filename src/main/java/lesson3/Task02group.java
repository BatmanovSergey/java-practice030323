package lesson3;

import java.util.*;

public class Task02group {

//  Задание №2.1 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

    public static void main(String[] args) {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Uranus", "Neptun", "Pluto");
        List<String> ourPlanetsRandom = planetRandomList(names);

//  Задание №2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        removeRepeatPlanets(ourPlanetsRandom);
    }

    private static List<String> planetRandomList(List<String> str) {
        Random random = new Random();
        List<String> planets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String randomElement = str.get(random.nextInt(str.size()));
            planets.add(randomElement);
        }
        System.out.printf("Рандомный массив:%n" + planets + "%n");

        planets.sort(Comparator.naturalOrder());
        System.out.printf("Отсортированный массив:%n" + planets + "%n");
        int count = 1;
        for (int i = 0; i < planets.size() - 1; i++) {
            if (planets.get(i).equals(planets.get(i + 1))) {
                count++;
            } else {
                System.out.println(planets.get(i) + "\t->\t" + count); // Табуляция - вариант вывода
//                System.out.printf("Планета: %s стречается %d раз(а)%n", planets.get(i), count );
                count = 1;
            }
        }
        System.out.println(planets.get(planets.size() - 1) + "\t->\t" + count); // Табуляция - вариант вывода
//        System.out.printf("Планета: %s стречается %d раз(а)%n", planets.get(planets.size() - 1), count );
        return planets;
    }

    private static void removeRepeatPlanets(List<String> str) {
        for (int i = str.size() - 1; i > 0; i--) {
            if (str.get(i).equals(str.get(i-1))) {
                str.remove(i);
            }
        }
        System.out.printf("Массив после удаления повторяющихся элементов:%n" + str);
    }
}

