interface I {

    public void m1();

    public void m2();

    default void say() {
        System.out.println("Inside Defualt Message");
    }

}

public class Test2 implements I {

    public static void main(String[] args) {

        // I i = new I() {

        // @Override
        // public void m1() {
        // System.out.println("Inside M1 method");
        // }

        // @Override
        // public void m2() {
        // System.out.println("Inside M2 Method");
        // }
        // };

        // i.m2();
        // i.m1();

        Test2 t = new Test2();
        t.say();

    }

    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }
}

class Test2_1 implements I {

    @Override
    public void m1() {
        System.out.println("Inside M1");
    }

    @Override
    public void m2() {
        System.out.println("Inside m2");
    }
}

class Test2_2 implements I {

    @Override
    public void m1() {
        System.out.println("Inside m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Inside Method m2");
    }

}