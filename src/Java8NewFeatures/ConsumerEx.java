import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
 

public static void main(String[] args) {

    // Consumer to display a number.
    Consumer<Object> display = a -> System.out.println(a+"\n");

    display.accept(10);

    // Consumer to modify the existing list.
    Consumer<List<Integer>> modify = list ->
    {
        for (int i = 0; i < list.size(); i++) {

            list.set(i, 2 * list.get(i));
        }
    };

    // Consumer to display the list.

    Consumer<List<Integer>>  show = list -> list.stream().forEach(a->System.out.println(a));
    
    List<Integer>  list = new ArrayList<>();
    list.add(56);
    list.add(23);
    list.add(90);

    display.accept("List Before Modification:");
    display.accept(list);


    display.accept("List After Modification");
     modify.andThen(show).accept(list);


     try {
            // using addThen()
            modify.andThen(null).accept(list);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
}
    
}
