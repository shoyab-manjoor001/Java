import java.util.Stack;
import java.util.function.Consumer;

public class StackEx {

    static Consumer<Object> display = str -> System.out.println(str);

    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.add(1);
        stack.add(null);
        stack.add("stack");
        display.accept(stack);

        stack.add(0, 12);
        display.accept(stack);

        display.accept(stack.peek());
        display.accept(stack.pop());
        display.accept(stack);
        display.accept(stack.push("pop"));
        display.accept(stack);
        display.accept(stack.lastIndexOf(stack));
    }
}
