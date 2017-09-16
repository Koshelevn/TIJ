package innerclasses;

class Outer2{
    private String string;
    Outer2(String string){
        this.string = string;
    }
    class Inner{
        @Override
        public String toString() {
            return string;
        }
    }
    Inner inner(){
        return new Inner();
    }

}
public class Ex3 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2("abc");
        System.out.println(outer.inner());
    }
}