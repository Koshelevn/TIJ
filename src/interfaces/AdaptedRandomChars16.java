package interfaces;

import java.nio.*;
import java.util.*;

public class AdaptedRandomChars16 implements Readable{
    Character[] characters = new Character[] {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i',
            'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    @Override
    public int read(CharBuffer cb){
        Random random = new Random(45);
        cb.append(characters[random.nextInt(26)]);
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars16());
        while(s.hasNext())
            System.out.println(s.next());
    }

}
