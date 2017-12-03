package generics;

interface TwoInt{
    void first();
    void second();
}
class imp implements TwoInt{
    @Override
    public void first() {
        System.out.println("First");
    }

    @Override
    public void second() {
        System.out.println("Second");
    }
    void extra(){
        System.out.println("Extra");
    }
}
class bounded{
    public static  <T extends TwoInt> void j(T x){
        x.first();
        x.second();
    }
}
public class Ex20 {
    public static void main(String[] args) {
        imp imp = new imp();
        bounded.j(imp);
    }
}
