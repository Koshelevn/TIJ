package holding;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Mike",new Gerbil("Mike"));
        gerbilMap.put("Rose",new Gerbil("Rose"));
        gerbilMap.put("John",new Gerbil("John"));
        Iterator<String> it = gerbilMap.keySet().iterator();
        while (it.hasNext()){
            String string = it.next();
            System.out.println(string);
            gerbilMap.get(string).hop();
        }

    }
}
