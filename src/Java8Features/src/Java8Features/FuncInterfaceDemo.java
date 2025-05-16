package src.Java8Features;

public class FuncInterfaceDemo {

    public static void main(String[] args) {

        FuncInterfaceEx fr = () -> System.out.println("Impelementation of Fn Interface");

        fr.m1();
        fr.sayGoodbye();
        FuncInterfaceEx.m2();

        FuncInterfaceEx2 fr2 = () -> System.out.println("\nImplemting 2nd Interface.");

        fr2.m1();
        fr2.write();
        FuncInterfaceEx2.write2();

    }
}
