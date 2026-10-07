package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Even {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0, 5, 10, 15, 20, 25, 30);
        List<Integer> even = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        // using partitioningBy() method to find even numbers        
        Map<Boolean,List<Integer>> evenNumber = nums.stream().collect(Collectors.partitioningBy(n->n%2==0));
        
        System.out.println("List of even number : "+evenNumber.get(true));
        System.out.println("List of Odd Number : "+evenNumber.get(false));
    }
}
