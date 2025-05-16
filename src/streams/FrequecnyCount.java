package src.streams;

import java.io.InputStream;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequecnyCount {

    public static void main(String[] args) {

        String str = "HelloWorld";
        IntStream stream = str.chars();

        // stream.map(c->(char)c).collect(
        // Collectors.groupingBy(Function.identity() )
    }
}
