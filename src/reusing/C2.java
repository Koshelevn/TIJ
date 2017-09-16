package reusing;

class A2{
    A2(int i){
        System.out.println("A2: " + i);
    }
}
class B2{
    B2(int i){
        System.out.println("B2: " +  i);
    }
}
public class C2 extends A2{
    B2 b = new B2(2);
    C2 (int i){
        super(i);
        System.out.println("C2: " + i);
    }

    public static void main(String[] args) {
        C2 c = new C2(1);
    }
}
