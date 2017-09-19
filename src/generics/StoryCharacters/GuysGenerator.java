package generics.StoryCharacters;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class GuysGenerator implements Generator<Guy>, Iterable<Guy> {
    private Class[] guys = {Doctor.class, John.class, Jason.class, Arthas.class};
    private static Random random = new Random();
    public GuysGenerator() {
    }
    private int size;
    public GuysGenerator(int size) {
        this.size = size;
    }
    public Guy next() {
        try {
            return (Guy) guys[random.nextInt(guys.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    class GuysIterator implements Iterator<Guy>{
        int count = size;
        public boolean hasNext() { return count > 0; }
        public Guy next() {
            count--;
            return GuysGenerator.this.next();
        }
    }

    @Override
    public Iterator<Guy> iterator() {
        return new GuysIterator();
    }

    public static void main(String[] args) {
        for(Guy c : new GuysGenerator(5))
            System.out.println(c);
    }
}
