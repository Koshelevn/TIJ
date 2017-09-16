package object;

class StaticTest {
    static int i = 47;

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
class Incrementable {
    static void increment() { StaticTest.i++; }
}
public class ITest {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1 + " " + st2);
        Incrementable.increment();
        System.out.println(st1 + " " + st2);
        st1.i++;
        System.out.println(st1 + " " + st2);
    }
}
