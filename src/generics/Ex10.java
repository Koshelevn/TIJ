package generics;

public class Ex10 {
    public <B, C> void f(Integer a, B b, C c){
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Ex10 ex = new Ex10();
        ex.f(1,"asd", 'v');
    }
}
