import java.util.*;
import java.util.logging.Level;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        //2
        List<String> names = Arrays.asList("Ayana", "Dariia", "Grape");
        List<String> upperCase = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);

        //3
        List<String> colors = Arrays.asList("Pink", "Purple", "Blue", "Red");
        List<String> specificLetter = colors.stream().filter(color -> color.startsWith("P")).collect(Collectors.toList());
        System.out.println(specificLetter.size());

        //4
        //In the first task: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> descending = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descending);

        //5
        int max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        int min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        //6
        List<String> flowers = Arrays.asList("Lilly", "Rose", "Lilly", "Dandelion");
        List<String> duplicates = flowers.stream().distinct().toList();
        System.out.println(duplicates);

        //7
        String singleString = flowers.stream().collect(Collectors.joining(", "));
        System.out.println(singleString);

        //8

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ayana", "COMSE", 96));
        students.add(new Student("Diana", "COMFCI", 95));
        students.add(new Student("Azim", "COMSEH", 89));
        students.add(new Student("Erzhan", "COMFCI", 90));
        students.add(new Student("Sanzhar", "COMSEH", 87));
        students.add(new Student("Dariia", "COMSE", 89));

        List<Student> comse = students.stream().filter(s -> s.getMajor().equals("COMSE")).toList();
        System.out.println("Students of COMSE: " + comse);

        List<Student> comfci = students.stream().filter(s -> s.getMajor().equals("COMFCI")).toList();
        System.out.println("Students of COMFCI: " + comfci);

        List<Student> comseh = students.stream().filter(s -> s.getMajor().equals("COMSEH")).toList();
        System.out.println("Students of COMSEH: " + comseh);

        //9
        double avgGPA = students.stream().mapToDouble(s -> s.gpa).average().orElse(0.0);
        System.out.println("Average of all gpa: " + avgGPA);

        //10
        List<Student> bestGPA = students.stream().filter(s -> s.getGpa() > 87.5).limit(3).toList();
        System.out.println(bestGPA);

        //11
        List<Student> allGpa = students.stream().filter(s -> s.getGpa() > 87.5).toList();
        System.out.println(allGpa);
    }

}