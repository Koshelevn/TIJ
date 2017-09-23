package generics;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class BigFish{
    private static long count=1;
    private final long index=count++;
    @Override
    public String toString() {
        return "BigFish " + index;
    }
    public static Generator<BigFish> generator(){
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}
class LittleFish{
    private static long count=1;
    private final long index = count++;

    @Override
    public String toString() {
        return "LittleFish " + index;
    }
    public static Generator<LittleFish> generator(){
        return new Generator<LittleFish>() {
            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
public class Ex18 {
    public static void eat(BigFish big, LittleFish little){
        System.out.println(big + " eats " + little);
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<BigFish> bigFish = new ArrayList<>();
        Generators.fill(bigFish, BigFish.generator(), 3);
        ArrayList<LittleFish> littleFish = new ArrayList<>();
        Generators.fill(littleFish, LittleFish.generator(), 20);
        for(LittleFish little: littleFish)
            Ex18.eat(bigFish.get(random.nextInt(3)), little);
    }
}
