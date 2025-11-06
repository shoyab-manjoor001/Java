import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamApiDemo {

    private static Integer reduce;

    public static void main(String[] args) {

        Consumer<Object> printer = (str) -> System.out.print(str + " ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

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
    }
}
