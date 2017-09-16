package holding;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {
    static void insert(LinkedList<Integer> collection, int number){
        ListIterator<Integer> it = collection.listIterator();

        while (it.hasNext()){
            Integer integer = it.next();
            if (it.nextIndex()==collection.size()/2)
                it.add(number);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        Ex11.printAny(list);



    }
}
