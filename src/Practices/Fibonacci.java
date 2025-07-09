public class Fibonacci {

    // using If Else
    public static int Fib(int n)
    {
        int prev1 = 1;
        int prev2 = 0;
        int current = 0;
        if (n<1)
        {
            System.out.println("Inavlid Number");
            return n;
        }
        if(n==1)
        {
            return prev2;
        }
        if (n==2)
        {
            return prev1;
        }

        if(n>2)
        {
            for(int i=3;i<=n;i++)
            {
                current = prev2 + prev1;
                prev2=prev1;
                prev1=current;
            }
        }
        return current;
    }

    // using recurssion

    static int fibC(int n)
    {
            if (n <= 1)
                return n;
            return fibC(n - 1) + fibC(n - 2);
    }

    public static void main(String[] args) {
        int n=12;
       System.out.println(Fib(n));

        for(int i=0;i<n;i++)
        {
            System.out.print(fibC(i)+ " ");
        }
    }
}
