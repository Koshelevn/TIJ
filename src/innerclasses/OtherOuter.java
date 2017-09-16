package innerclasses;

class Outer3{
    class Inner{

    }
}
public class OtherOuter {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();

    }
}
