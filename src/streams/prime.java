package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prime {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0, 5, 10, 15, 20, 25, 30);
        List<Integer> even = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
}
