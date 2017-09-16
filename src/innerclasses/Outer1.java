package innerclasses;

class Outer{
    class Inner{

    }
    Inner inner(){
        return new Inner();
    }

}
public class Outer1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.inner();
    }
}
