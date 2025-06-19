@FunctionalInterface
public interface FuncInterfaceEx {

    public void m1();

    public static void m2() {
        System.out.println("Inside Statice Method of Functional Interface");
    }

    default void sayGoodbye() {
        System.out.println("Goodbye!");
    }

}