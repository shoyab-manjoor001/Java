interface A {

    public void show();

    public void m1();

    default void say() {
        System.out.println("Inside Default Method of A");
    }
}

interface B {

    public void display();

    public void m1();

    default void say() {
        System.out.println("Inside Default Method of B");
    }
}

public class Example implements A, B {

    @Override
    public void display() {
        System.out.println("Inside Display Method.");
    }

    @Override
    public void show() {
        System.out.println("Inside Show Method");
    }

    @Override
    public void m1() {

    }

    @Override
    public void say() {
        B.super.say();
    }

    public static void main(String[] args) {

        Example ex = new Example();
        ex.display();
        ex.show();
        ex.say();
    }

}