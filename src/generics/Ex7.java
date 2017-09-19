package generics;

import java.util.Iterator;

public class Ex7 implements Iterable<Integer> {
    Fibonacci fibonacci = new Fibonacci();
    private int n;
    public Ex7(int count){ n = count;}

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
                public boolean hasNext() { return n > 0; }
            public Integer next() {
                n--;
                return fibonacci.next();
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
