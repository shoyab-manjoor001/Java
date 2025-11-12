package src.streams;

import java.util.stream.Collectors;

public class FrequecnyCount {

    public static void main(String[] args) {

        String str = "HelloWorld";

        // stream.map(c->(char)c).collect(
        // Collectors.groupingBy(Function.identity() )

        str.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((k,v)->System.out.println(k+" : "+v));
    }
}
