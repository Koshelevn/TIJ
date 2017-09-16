package interfaces;

interface One{
    void One1();
    void One2();
}
interface Two{
    void Two1();
    void Two2();
}
interface Three{
    void Three1();
    void Three2();
}
interface New extends One,Two, Three{
    void New1();
}
abstract class Doctor {
    private int i = 0;
    abstract void doc();
}
public class Ex14 extends Doctor implements New{
   public void One1(){}
   public void One2(){}
   public void Two1(){}
   public void Two2(){}
   public void Three1(){}
   public void Three2(){}
   public void New1(){}
   void doc(){}
   static void TakeOne(One one){}
   static void TakeTwo(Two two){}
   static void TakeThree(Three three){}
   static void TakeNew(New New){}

    public static void main(String[] args) {
        Ex14 ex = new Ex14();
        TakeOne(ex);
        TakeTwo(ex);
        TakeThree(ex);
        TakeNew(ex);
    }
}
