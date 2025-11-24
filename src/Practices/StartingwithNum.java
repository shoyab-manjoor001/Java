import java.util.List;
import java.util.Arrays;

class StartingwithNum {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        List<Integer> list = Arrays.asList(11, 289, 123, 114, 455, 4536, 107, 58, 669, 110);
        System.out.println(list);

        list.stream().map(i -> String.valueOf(i)).filter(i -> i.startsWith("1")).forEach(System.out::println);
    }
}