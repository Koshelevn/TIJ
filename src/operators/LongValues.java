package operators;
import static net.mindview.util.Print.*;

public class LongValues {
    public static void main(String[] args) {
        long n1 = 0xffff; // hexadecimal
        long n2 = 077777; // octal
        print("long n1 in hex = " + Long.toBinaryString(n1));
        print("long n2 in oct = " + Long.toBinaryString(n2));
    }
}
