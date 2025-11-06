import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorEx {

    public static void main(String[] args) {
        
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);    
        list.add(4);
        list.add(5);   


        for (Integer number : list) {
            System.out.println(number);
            if (number == 3) {
                list.remove(Integer.valueOf(number)); // Safe removal in fail-safe iterator
            }
        }
        System.out.println("After Modification: " + list);
    }
    
}
