package exceptions;

class VeryImportantException1 extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException1 extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class MeaninglessException extends Exception {
    public String toString() {
        return "A meaningless exception";
    }
}

public class Ex18 {
    void f() throws VeryImportantException1 {
        throw new VeryImportantException1();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void eliminate() throws MeaninglessException {
        throw new MeaninglessException();
    }
    public static void main(String[] args) {
        try {
            Ex18 lm = new Ex18();
            try {
                try {
                    lm.f();
                    lm.dispose();
                } finally {
                    lm.eliminate();
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}