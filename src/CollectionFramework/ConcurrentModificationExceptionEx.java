import java.util.*;

class ConcurrentModificationExceptionEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        // for (Integer i : list) {
        // if (i == 20)
        // list.remove(i); // ❌ modifying list directly during iteration
        // }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            if (iterator.next() == 20) {
                iterator.remove(); // ✅ safe way to remove during iteration
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
