package reusing;

class Amphibian {
    void move() {
        System.out.println("Amphibian.move()");
    }

    void voice() {
        System.out.println("Amphibian.sound()");
    }

    void eat() {
        System.out.println("Amphibian.eat()");
    }

    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}

public class Frog extends Amphibian {
    void move() {
        System.out.println("Frog.move()");
    }

    void voice() {
        System.out.println("Frog.sound()");
    }

    void eat() {
        System.out.println("Frog.eat()");
    }

    static void grow(Amphibian a) {
        System.out.println("Frog grow");
        a.eat();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.move();
        frog.voice();
        Amphibian.grow(frog);
    }
}
