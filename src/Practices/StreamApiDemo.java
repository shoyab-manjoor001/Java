import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

    private static Integer reduce;

    public static void main(String[] args) {

        Consumer<Object> printer = (str) -> System.out.print(str + " ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        List<String> names = Arrays.asList("Rani", "Raj", "Rohit", "Sita", "Raman", "Anil");

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);

        printer.accept(numbers);

        // printing all elements using stream and forEach
        System.out.println("\nPrinting using Stream and forEach:");
        numbers.stream().forEach(printer);

        // printing even numbers using stream and forEach
        System.out.println("\n\nPrinting Even Numbers using Stream and forEach:");
        numbers.stream().filter(i -> i % 2 == 0).forEach(printer);

        // printing square of each number using stream and forEach
        System.out.println("\n\nPrinting Square of each number using Stream and forEach:");
        numbers.stream().map(i -> i * i).forEach(printer);

        // printing sum of even in the list numbers using stream
        printer.accept("\n\nPrinting Sum of Even Numbers using Stream:");
        reduce = numbers.stream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
        printer.accept(reduce);

        // printing max of odd in the list numbers using stream
        printer.accept("\n\nPrinting Max of Odd Numbers using Stream:");
        reduce = numbers.stream().filter(i -> i % 2 != 0).reduce(0, (a, b) -> a > b ? a : b);
        printer.accept(reduce);

        // printing min of odd in the list numbers using stream
        printer.accept("\n\nPrinting Min of Odd Numbers using Stream:");
        reduce = numbers.stream().filter(i -> i % 2 != 0).reduce(0, (a, b) -> a < b ? a : b);
        printer.accept(reduce);

        // printing max of all numbers in the list using stream
        printer.accept("\n\nPrinting Max of All Numbers using Stream:");
        reduce = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        printer.accept(reduce);

        // printing min of all numbers in the list using stream
        printer.accept("\n\nPrinting Min of All Numbers using Stream:");
        reduce = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        printer.accept(reduce);

        // Sort List in Acending and Descending Order
        System.out.println("\n\nSorting List in Ascending Order:");

        Stream<Integer> sorted = numbers.stream().sorted((a, b) -> a.compareTo(b));
        sorted.forEach(printer);

        System.out.println("\n\nSorting List in Descending Order:");
        Stream<Integer> sortDesc = numbers.stream().sorted((a, b) -> b.compareTo(a));
        sortDesc.forEach(val -> printer.accept(val));

        // remove duplicates from list
        System.out.println("\n\nRemoving Duplicates from List:");
        Stream<Integer> distinct = numbers.stream().distinct();
        distinct.forEach(printer);

        // Filter names starting with R
        System.out.println("\n\nFiltering Names starting with R:");

        List<String> newList = names.stream().filter(str -> str != null && (str.startsWith("R") || str.startsWith("r")))
                .collect(Collectors.toList());
        printer.accept(newList);

        // print frquency of each elament

        Map<Integer, Long> hashMap = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        // printer.accept("\n" + hashMap);
        hashMap.forEach((k, v) -> System.out.println(k + " : " + v));

        // finding duplicates in the list
        numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .forEach(printer);

        String s1 = "hello, welcome to the programming world";

        System.out.println("\n\nFinding frequency of each character in the string:");
        s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

        // findind duplicates in the String.
        System.out.println("\n\nFinding duplicate characters in the string:");
        s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).forEach(printer);

        // Partitioning the list into even and odd numbers
        printer.accept("\n\nFinal List of Numbers:");
        numbers.stream().forEach(printer);

        Map<Boolean, List<Integer>> partition = numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        printer.accept("\n\nEven Numbers:");
        printer.accept(partition.get(true));

        printer.accept("\n\nOdd Numbers:");
        printer.accept(partition.get(false));
    }
}
