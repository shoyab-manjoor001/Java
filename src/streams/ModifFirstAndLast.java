package src.streams;

import java.util.Arrays;
import java.util.List;

public class ModifFirstAndLast {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shoyab", "Sameer", "Suahil", "Savej", "Khan");

        // o/p = {"SHOYAB","KHAN"}

        names.stream().map(
                name -> (name.equalsIgnoreCase("shoyab") || name.equalsIgnoreCase("Khan") ? name.toUpperCase() : name))
                .forEach(System.out::println);

    }

}
