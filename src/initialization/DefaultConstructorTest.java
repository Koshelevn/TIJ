package initialization;

class DefaultCons{
    DefaultCons(){
        System.out.println("Default");
    }
    DefaultCons(String s){
        System.out.println(s);
    }
}
public class DefaultConstructorTest {
    public static void main(String[] args) {
        DefaultCons d1 = new DefaultCons();
        DefaultCons d2 = new DefaultCons("123");
    }
}
