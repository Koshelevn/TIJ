package generics;

public class Ex9 {
    public <A, B, C> void f(A a, B b, C c){
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Ex9 ex = new Ex9();
        ex.f(1,"asd", 'v');
    }
}
