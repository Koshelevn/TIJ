package polymorphism.music6;

import java.util.*;
public class RandomInstrumentGenerator {
    private Random rand = new Random(48);
    public Instrument next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Woodwind();
            case 1: return new NewWind();
            case 2: return new Brass();
            case 3: return new Stringed();
        }
    }
}
