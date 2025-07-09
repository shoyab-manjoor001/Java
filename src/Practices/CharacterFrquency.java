import java.util.HashMap;
import java.util.Map;

public class CharacterFrquency {

    public static void main(String[] args) {

        String str = "assskhjskafkhgygucvaa";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, 0);
        }

        for (char c : ch) {
            map.put(c, map.get(c) + 1);
        }

        System.out.println(map);
    }
}
