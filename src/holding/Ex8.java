package holding;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil("1"));
        gerbils.add(new Gerbil("2"));
        gerbils.add(new Gerbil("3"));
        Iterator<Gerbil> it = gerbils.iterator();
        while (it.hasNext()) {
            Gerbil gerbil = it.next();
            gerbil.hop();
        }
    }
}
