package interfaces;
abstract class Dad {
}

class Son extends Dad {
    protected void print() { net.mindview.util.Print.print("Son"); }
}

abstract class SecondDad {
    abstract protected void print();
}

class SecondSon extends SecondDad {
    protected void print() { net.mindview.util.Print.print("SecondSon"); }
}

public class Ex4 {
    public static void testPrint(Dad d) {
        ((Son)d).print();
    }
    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }
    public static void main(String[] args) {
        Son s = new Son();
        Ex4.testPrint(s);
        SecondSon ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }
}