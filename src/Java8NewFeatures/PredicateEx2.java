import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class User{
    private String name, role;

    User(String a, String b)
    {
        this.name=a;
        this.role=b;
    }

    public String getName()
    {
        return this.name;
    }

    public String getRole()
    {
        return this.role;
    }

    public String toString()
    {
        return "User Name: "+ name +" , Role: "+role;
    }

}

public class PredicateEx2 {

            public static List<User> processUsers(List<User> list)
        {
            List<User> newList = new ArrayList<>();
            return list.stream().filter((user)->user.getRole().equalsIgnoreCase("admin")).toList();

        }


    // Predicate to a Function.

    static void Pred(Integer n, Predicate<Integer> predicate)
    {
        if (predicate.test(n)) 
            System.out.println("Number " + n);
        else
            System.out.println("Number is Less than 7 : " + n);

    }

    public static void main(String[] args) {
        
        Predicate<Integer> greaterThan = i -> (i>18) ;
        Predicate<Integer> lesserThan = i -> (i<60);

        Consumer<Object> printf = val -> System.out.println(val);

        // and
        printf.accept(greaterThan.and(lesserThan).test(20));

        // chaining with negate
        printf.accept(greaterThan.and(lesserThan).negate().test(20));

        // OR
        printf.accept(greaterThan.or(lesserThan).test(12));

        Pred(8, (i) -> i > 7);


        List<User> users = new ArrayList<>();
        users.add(new User("Abc", "admin"));
        users.add(new User("def", "normal"));
        users.add(new User("efg", "admin"));
        users.add(new User("jkl", "normal"));
        users.add(new User("mno", "admin"));

        System.out.println(processUsers(users));

    }
}
