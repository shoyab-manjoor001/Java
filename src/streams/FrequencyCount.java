package src.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FrequencyCount {

    public static void main(String[] args) {

        String str = "HelloWorld";

        // stream.map(c->(char)c).collect(
        // Collectors.groupingBy(Function.identity() )

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

        String str1 = "welcome to the world of java";

        str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

        // finding frequency of word in a string
        String str2 = "apple banana orange apple mango banana";

        Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + " : " + count));

    }

}
