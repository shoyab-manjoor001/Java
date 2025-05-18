package src.Java8NewFeatures;

@FunctionalInterface
public interface FuncInterfaceEx2 extends FuncInterfaceEx {

    public void m1();

    default void write() {
        System.out.println("Inside default method");
    }

    public static void write2() {
        System.out.println("Inside Statice method of Fn Interface.");
    }

}
