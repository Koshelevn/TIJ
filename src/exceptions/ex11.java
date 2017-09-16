package exceptions;

class class1 {
    void g() throws MyEx {
        throw new MyEx("f()");
    }

    void f() {
        try {
            g();
        } catch (MyEx e) {
            try {
                System.out.println(e.getMessage());
                try {
                    throw new RuntimeException("Runtime");
                } catch (RuntimeException run) {
                    System.out.println(run.getMessage());
                    throw new ExceptionA("g()");
                }
            } catch (ExceptionA exceptionA) {
                System.out.println(exceptionA.getMessage());
            }

        }
    }
}

public class ex11 {
    public static void main(String[] args) {
        class1 class1 = new class1();
        class1.f();
    }
}
