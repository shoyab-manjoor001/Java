import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {

        Function<Integer, Integer> fn = i -> i * i;

        System.out.println("Square of number : " + fn.apply(45));

    }
}
