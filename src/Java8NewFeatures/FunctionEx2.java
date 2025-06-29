import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionEx2 {

    public static void main(String[] args) {

        Consumer<Object> display = (str) -> System.err.println(str);

        // 1. Function Example.
        Function<Integer, Double> half = (i) -> i / 2.0;
        Function<Double, Double> half2 = (i) -> i / 2.0;

        // Use of Apply Method.
        display.accept("\nExample of Apply method");
        display.accept("Half of 10 : " + half.apply(10));
        // display.accept("Half of Half of 50 : " + half.andThen(x -> x /
        // 2.0).apply(50));

        // Use of andThen method. (F1 and then F2)
        display.accept("\nExmple of andThen Method");
        display.accept("Half of Half of 50 : " + (half.andThen(half2).apply(50)));

        // Use of Compose Method. (f2 first then f1)
        Function<Double, Double> f1 = (i) -> i / 2.0;
        Function<Double, Double> f2 = (i) -> i * 2;
        display.accept("\nExample of Compose Method:");
        display.accept(f1.compose(f2).apply((double) 50));

        // Use of Identity Function (return same parameter passed)
        Function<Integer, Integer> ide = Function.identity();
        display.accept("\nExample of Identity Method:");
        display.accept(ide.apply(56));

        // 2. BiFunction Example.
        display.accept("\nExample OF Bifunction:");
        BiFunction<Integer, Integer, Long> sum = (a, b) -> Long.valueOf(a + b);
        display.accept("Sum of a and b : " + (sum.apply(45, 56)) + "\n");

    }
}
