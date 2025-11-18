import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

public class EvenOdd {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println("Even Numbers: " + map.get(true));
        System.out.println("Odd Numbers: " + map.get(false));

        // Alternatively, printing directly
        System.out.println("Even Numbers: ");
        List<Integer> collect = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
