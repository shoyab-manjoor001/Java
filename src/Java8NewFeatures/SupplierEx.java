import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) 
    {

        Consumer<Object> consumer = (str) -> System.out.println(str); 
        
        Supplier<Double> supplier = () -> Math.pow(2, 10);

        // Normal Suppleier.
        consumer.accept(supplier.get());

        // Boolen Supplier.
        BooleanSupplier booleanSupplier = () -> (1<0);

        consumer.accept(booleanSupplier.getAsBoolean());

        // Int Supplier
        IntSupplier intSupplier = () -> (int)(Math.random() * 10);

        consumer.accept(intSupplier.getAsInt());

        // Double Supplier

        DoubleSupplier doubleSupplier = () -> Math.random();

        consumer.accept(doubleSupplier.getAsDouble());

        //Long Supplier

        LongSupplier longSupplier = () -> 542;

        consumer.accept(longSupplier.getAsLong());

    }
    
}
