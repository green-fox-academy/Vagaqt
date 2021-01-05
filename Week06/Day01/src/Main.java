import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers1 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbers2 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        String uppercase = "WrItE a StReAm ExPrEsSiOn To FiNd ThE uPpErCaSe ChArAcTeRs In A sTrInG!";

        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println("-----------");

        numbers.stream()
                .filter(x -> x > 0)
                .forEach(System.out::println);
        System.out.println("-----------");

        numbers1.stream()
                .filter(x -> (x * x) > 20)
                .forEach(System.out::println);
        System.out.println("-----------");

//        OptionalDouble optionalAverage = numbers.stream()
//                .filter(x -> x % 2 == 1 || x % 2 == -1)
//                .mapToDouble(Integer::doubleValue)
//                .average();
//
//        if (optionalAverage.isPresent()) {
//            System.out.println(optionalAverage.getAsDouble());
//        } else {
//            System.out.println("");
//        }
        numbers.stream().filter(x -> x % 2 == 1 || x % 2 == -1)
                .mapToDouble(Integer::doubleValue)
                .average()
                .ifPresent(System.out::println);
        System.out.println("-----------");

        int optionalSum = numbers2.stream()
                .filter(x -> x % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(optionalSum);
        System.out.println("-----------");

        String uppercaseCharacters = "WrItE a StReAm ExPrEsSiOn To FiNd ThE uPpErCaSe ChArAcTeRs In A sTrInG!"
                .chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
        System.out.println(uppercaseCharacters);
        System.out.println("-----------");

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        char n = 'N';
        cities.stream().filter(c -> c.charAt(0) == n).forEach(System.out::println);
        System.out.println("-----------");

        System.out.println(uppercase.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .toString()
                .replaceAll(", ", ""));
        System.out.println("-----------");

        Map<Character, Long> frequency = uppercase.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
        System.out.println(frequency);
        System.out.println("-----------");

        List<Fox> foxes = Arrays.asList(
                new Fox("Fox1", "green", 2),
                new Fox("Fox2", "green", 6),
                new Fox("Fox3", "red", 5),
                new Fox("Fox4", "orange", 4),
                new Fox("Fox5", "blue", 7)
        );
        List<String> greenFoxes = foxes.stream()
                .filter(fox -> fox.colour.equals("green"))
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println("Green foxes: " + greenFoxes);

        List<String> youngGreenFoxes = foxes.stream()
                .filter(fox -> fox.colour.equals("green") && fox.age < 5)
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println("Young green foxes: " + youngGreenFoxes);

        Map<String, Long> foxColourFrequency = foxes.stream().collect(Collectors.groupingBy(Fox::getColour, Collectors.counting()));
        System.out.println(foxColourFrequency);
        System.out.println("-----------");

        


    }
}
