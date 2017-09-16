package interfaces;

abstract class println{
   public abstract void print();
   println(){
       print();
   }
}
class println2 extends println{
    int i = 10;
    public void print(){
        System.out.println(i);
    }
}
public class ex3 {
    public static void main(String[] args) {
        println2 println = new println2();
        println.print();
    }
}
