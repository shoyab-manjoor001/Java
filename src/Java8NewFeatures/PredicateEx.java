import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{

    String empName;
    Double salary;

    public Employee(String empName, Double salary) {
        this.empName = empName;
        this.salary = salary;
    }


}

public class PredicateEx {

    public static void main(String[] args) {

        String[] names = {"Aman","Anup","Pooja","Shoyab","Abhinav"};

        Predicate<String> t = s -> s.length()%2==0;
        for (String name : names) {
            if(t.test(name))
                System.out.println(name);
        }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add( new Employee("Aman", (double) 80000));
        employees.add( new Employee("Anup", (double) 60000));
        employees.add( new Employee("Pooja", (double) 55000));
        employees.add( new Employee("Shoyab", (double) 42000));
        employees.add( new Employee("Abhinav", (double) 35000));
        employees.add( new Employee("Bhaskar", (double) 51000));
        
        Predicate<Employee> p = e -> e.salary>50000;

        System.out.println("\n\n");
        for (Employee employee : employees) {

            if (p.test(employee)) {
                System.out.println(employee.empName);
            }
            
        }

        int array[] =  {10,23,432,65,78,33,102,11,9,1,65,8,6,4};

        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Integer> p2 = i -> i>1;

        for (int j : array) {       
            if (p1.and(p2).test(j)) {
                System.out.println(j);
            }
            
        }

    }
    
}
