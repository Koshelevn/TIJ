package innerclasses;

class HoldString{
    String string;
    HoldString(String string){
        this.string=string;
    }
    @Override
    public String toString() {
        return string;
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i + i*10));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
