package src;

public class Fibonacci {

    public static void Fib(int n)
    {
        if (n<1)
        {
            System.out.println("Inavlid Number");
            return;
        }
        int prev1 = 1;
        int prev2 = 0;

        System.out.println(prev2);
        if(n==1)
            return;

        System.out.println(prev1);

        int current;
        for(int i=3;i<=n;i++)
        {
            current = prev2 + prev1;
            System.out.println(current);
            prev2=prev1;
            prev1=current;
        }
    }

    public static void main(String[] args) {
        int n=10;
        Fib(n);
    }
}
