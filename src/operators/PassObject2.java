package operators;

import static net.mindview.util.Print.*;
class Float {
    float c;
}
public class PassObject2 {
    static void f(Float y) {
        y.c = 0.27f;
    }
    public static void main(String[] args) {
        Float x = new Float();
        x.c = 0.47f;
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}
