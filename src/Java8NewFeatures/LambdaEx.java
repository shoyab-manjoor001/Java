package src.Java8NewFeatures;

interface Interf {
    public void m1();
}

public class LambdaEx {

    public static void main(String[] args) {

        Interf i = () -> System.out.println("Hello... By Lambda Expression");
        i.m1();
        i.m1();
    }
}