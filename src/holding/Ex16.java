package holding;
import net.mindview.util.TextFile;
import java.util.*;

public class Ex16 {
    public static void main(String[] args) {
        int total = 0;
        Set<String> words =
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(
                new TextFile("SetOperations.java", "\\W+"));
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<Character>();
        Collections.addAll(set,
                'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            int count = 0;
            String string = it.next();
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (set.contains(chars[i])) {
                    count++;
                    map.put(chars[i], map.get(chars[i]) == null ? 1 :  map.get(chars[i])+ 1);
                }
            }
            total += count;
            System.out.println(string + " has " + count + " vowels");
        }
        System.out.println("Total vowels: " + total);
        System.out.println(map);
    }
}
