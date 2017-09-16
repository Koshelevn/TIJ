package reusing;
import static net.mindview.util.Print.*;
class Component21 {
    Component21() { print("Component1()"); }
    void dispose() { print("Component1.dispose()"); }
}

class Component22 {
    Component22() { print("Component2()"); }
    void dispose() { print("Component2.dispose()"); }
}

class Component23 {
    Component23() { print("Component3()"); }
    void dispose() { print("Component3.dispose()"); }
}

class Root2 {
    Component21 c1root;
    Component22 c2root;
    Component23 c3root;
    Root2() {
        print("Root()");
        c1root = new Component21();
        c2root = new Component22();
        c3root = new Component23();
    }
    void dispose() {
        c3root.dispose();
        c2root.dispose();
        c1root.dispose();
        print("Root2.dispose()");
    }
}

class Stem2 extends Root2 {
    Component21 c1stem;
    Component22 c2stem;
    Component23 c3stem;
    Stem2() {
        super();
        print("Stem2()");
        c1stem = new Component21();
        c2stem = new Component22();
        c3stem = new Component23();
    }
    void dispose() {
        c3stem.dispose();
        c2stem.dispose();
        c1stem.dispose();
        super.dispose();
        print("Stem2.dispose()");
    }
    public static void main(String[] args) {
        Stem2 s = new Stem2();
        try {
            // Code and exception handling...
        } finally {
            s.dispose();
        }
    }
}