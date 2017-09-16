package holding;

import java.util.*;


public class Ex12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> reverse = new ArrayList<Integer>(list.size());
        ListIterator<Integer> it = list.listIterator(3);
        while (it.hasPrevious()){
            Integer integer = it.previous();
            reverse.add(integer);
        }
        Ex11.printAny(list);
        Ex11.printAny(reverse);
    }
}
