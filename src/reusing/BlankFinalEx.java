package reusing;

class Obj{

}
public class BlankFinalEx {
    final Obj obj;
    BlankFinalEx(){
        obj = new Obj();
    }


    public static void main(String[] args) {
        BlankFinalEx blank = new BlankFinalEx();
    }
}
