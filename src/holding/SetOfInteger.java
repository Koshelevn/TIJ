package holding;

import java.util.*;
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        HashSet<Integer> intset = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}
