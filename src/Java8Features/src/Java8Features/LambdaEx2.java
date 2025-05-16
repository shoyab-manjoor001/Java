package src.Java8Features;

interface InnerLambdaEx2 {
    public void add(int a, int b);

}

// class Demo implements InnerLambdaEx2 {

// @Override
// public void add(int a, int b) {
// System.out.println("Sum of Numbers: " + (a + b));
// }

// }

public class LambdaEx2 {

    public static void main(String[] args) {

        // System.out.println("Using Functional Iterface and Normal implementation:\n");
        // Demo d = new Demo();
        // d.add(12, 32);

        System.out.println("Using functional and Lambda Expression:\n");
        InnerLambdaEx2 iEx2 = (x, y) -> System.out.println("Sum Of Number: " + (x + y));
        iEx2.add(456, 656);
        iEx2.add(322223, 89);
    }

}
