package polymorphism;

class base{
    void base1(){
        System.out.println("base2 from base 1:");
        base2();
    }
    void base2(){
        System.out.println("base2");
    }
}
class derived extends base{
    @Override
    void base2() {
        System.out.println("derived2");
    }
}
public class ex10 {
    public static void main(String[] args) {
        derived base = new derived();
        base.base1();
    }
}
