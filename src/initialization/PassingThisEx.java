package initialization;


public class PassingThisEx {
    void first(){
        System.out.println("1");
    }
    void second(){
        this.first();
        first();
    }

    public static void main(String[] args) {
        PassingThisEx p = new PassingThisEx();
        p.second();

    }
}
