package holding;

import net.mindview.util.TextFile;

import java.util.*;

public class Ex21 {
    public static void main(String[] args) {
        List<String> words =
                new ArrayList<String>();
        words.addAll(
                new TextFile("SetOperations.java", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> map = new LinkedHashMap<String,Integer>();
        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            String word = it.next();
            map.put(word, map.get(word) == null ? 1 :  map.get(word)+ 1);
        }
        System.out.println(map);
    }
}
